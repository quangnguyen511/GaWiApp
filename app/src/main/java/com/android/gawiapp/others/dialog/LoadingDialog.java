package com.android.gawiapp.others.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Window;

import com.android.gawiapp.R;

/**
 * Created by DangQuang on 9/30/17.
 **/

public class LoadingDialog extends Dialog {

    public LoadingDialog(Context context) {
        super(context, android.R.style.Theme_Holo_Dialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if(getWindow()!=null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        setContentView(R.layout.dialog_loading);
    }
}
