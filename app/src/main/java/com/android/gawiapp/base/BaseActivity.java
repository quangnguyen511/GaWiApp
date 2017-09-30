package com.android.gawiapp.base;

import android.support.v7.app.AppCompatActivity;

import com.android.gawiapp.others.dialog.LoadingDialog;
import com.android.gawiapp.utils.AppUtils;

/**
 * Created by DangQuang on 9/30/17.
 **/

public class BaseActivity extends AppCompatActivity {
    private LoadingDialog mLoadingDialog;

    public void showLoading(){
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
}
