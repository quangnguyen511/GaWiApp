package com.android.gawiapp.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.android.gawiapp.R;
import com.android.gawiapp.adapter.SplashAdapter;
import com.android.gawiapp.base.BaseActivity;
import com.android.gawiapp.fragment.guide.GuideFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreenActivity extends BaseActivity {

    @BindView(R.id.actSplash_vpSplash)
    ViewPager vpSplash;
    @BindView(R.id.actSplash_tlIndicator)
    SmartTabLayout tlIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);

        SplashAdapter mFragmentPagerItemAdapter = new SplashAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("intro1", GuideFragment.class)
                .add("intro2", GuideFragment.class)
                .add("intro3", GuideFragment.class)
                .create());

        vpSplash.setAdapter(mFragmentPagerItemAdapter);
        tlIndicator.setViewPager(vpSplash);
    }
}
