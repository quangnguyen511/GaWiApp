package com.android.gawiapp.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;

import com.android.gawiapp.R;
import com.android.gawiapp.adapter.SplashAdapter;
import com.android.gawiapp.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class SplashScreenActivity extends BaseActivity implements TabLayout.OnTabSelectedListener {

    @BindView(R.id.actSplash_vpSplash)
    ViewPager vpSplash;
    @BindView(R.id.actSplash_tlIndicator)
    TabLayout tlIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);
        tlIndicator.addTab(tlIndicator.newTab());
        tlIndicator.addTab(tlIndicator.newTab());
        tlIndicator.setTabGravity(TabLayout.GRAVITY_FILL);

        SplashAdapter splashAdapter = new SplashAdapter(getSupportFragmentManager(),tlIndicator.getTabCount());
        vpSplash.setAdapter(splashAdapter);
        tlIndicator.setupWithViewPager(vpSplash,true);
        tlIndicator.addOnTabSelectedListener(this);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vpSplash.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
