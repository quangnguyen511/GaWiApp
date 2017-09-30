package com.android.gawiapp.base;

import android.support.v4.app.Fragment;

/**
 * Created by DangQuang on 9/30/17.
 **/

public class BaseFragment extends Fragment {

    public void showLoading() {
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).showLoading();
        }
    }

    public void dismissLoading() {
        if (getActivity() instanceof BaseActivity) {
            ((BaseActivity) getActivity()).dismissLoading();
        }
    }
}
