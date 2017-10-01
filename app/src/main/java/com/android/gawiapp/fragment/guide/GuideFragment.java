package com.android.gawiapp.fragment.guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.gawiapp.R;
import com.android.gawiapp.base.BaseFragment;
import com.android.gawiapp.utils.StartActivityUtils;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by DangQuang on 9/30/17.
 **/

public class GuideFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.fragmentGuide_tvHello)
    public void onViewClicked() {
        StartActivityUtils.toMain(getContext());
    }
}
