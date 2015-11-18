package com.kongqw.bottomnavigationlib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by kongqw on 2015/11/18.
 */
public final class ToastUtil {
    private static Toast mToast;

    private ToastUtil() {
    }

    public static void show(Context context, String text) {
        if (null == mToast) {
            mToast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
        }
        mToast.setText(text);
        mToast.show();
    }
}
