package com.android.gawiapp.base;

import android.app.Application;

import com.android.gawiapp.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by DangQuang on 9/30/17.
 **/

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath(getString(R.string.font_lato_regular))
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
