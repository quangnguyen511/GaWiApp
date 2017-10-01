package com.android.gawiapp.fragment.newest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.gawiapp.R;
import com.android.gawiapp.base.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created by DangQuang on 10/2/17.
 **/

public class NewestFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_newest,container,false);
        ButterKnife.bind(this,view);
        return view;
    }
}
