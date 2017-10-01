package com.android.gawiapp.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.IntentCompat;

import com.android.gawiapp.activity.MainActivity;
import com.android.gawiapp.activity.SplashScreenActivity;

/**
 * Created by DangQuang on 10/2/17.
 **/

public class StartActivityUtils {
    public static void toMain(Context context) {
        Intent intent = new Intent().setClass(context,
                MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }

    public static void toSplash(Context context) {
        Intent intent = new Intent().setClass(context,
                SplashScreenActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }
}
