package com.android.gawiapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.gawiapp.fragment.GuideFragment;

/**
 * Created by DangQuang on 9/30/17.
 **/

public class SplashAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public SplashAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new GuideFragment();
            case 1:
                return new GuideFragment();
            case 2:
                return new GuideFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
