package com.android.gawiapp.base;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.android.gawiapp.R;
import com.android.gawiapp.others.dialog.LoadingDialog;
import com.android.gawiapp.utils.AppUtils;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by DangQuang on 9/30/17.
 **/

public abstract class BaseActivity extends AppCompatActivity {
    private LoadingDialog mLoadingDialog;

    public void showLoading() {
        if (AppUtils.isNetworkAvailable(this))
            if (mLoadingDialog != null) {
                mLoadingDialog.show();
            } else {
                mLoadingDialog = new LoadingDialog(this);
                mLoadingDialog.setCanceledOnTouchOutside(false);
                mLoadingDialog.show();
            }
    }

    public void dismissLoading() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
        }
    }

    private void addReplaceFragment(BaseFragment fragment, boolean isReplace, boolean isAddToBackStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager != null && fragment != null) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if (isReplace)
                fragmentTransaction.replace(R.id.actMain_frmContainer, fragment);
            else
                fragmentTransaction.add(R.id.actMain_frmContainer, fragment, fragment.getClass().getSimpleName());
            if (isAddToBackStack) {
                fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());
            }
            fragmentTransaction.commit();
        }
    }

    public void replaceFragment(BaseFragment fragment, boolean isAddToBackStack) {

        addReplaceFragment(fragment, true, isAddToBackStack);
    }

    public void addFragment(BaseFragment fragment, boolean isAddToBackStack) {
        addReplaceFragment(fragment, false, isAddToBackStack);
    }

    public void clearAllBackStack() {
        FragmentManager fm = getSupportFragmentManager();
        int count = fm.getBackStackEntryCount();
        for (int i = 0; i < count; ++i) {
            fm.popBackStack();
        }
    }
    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(context));
    }
}
