package com.lmy.anybuy.util;

import android.util.Log;

/**
 * ClassName:
 * Function: 日志打印类
 * Author: lmy
 * Date: 2017/3/20
 */

public class zLog {

    public static boolean isDebug = true;

    public static void v(final String tag, final String msg) {
        if (isDebug) {
            Log.v(tag, "--> " + msg);
        }
    }

    public static void d(final String tag, final String msg) {
        if (isDebug) {
            Log.d(tag, "--> " + msg);
        }
    }

    public static void i(final String tag, final String msg) {
        if (isDebug) {
            Log.i(tag, "--> " + msg);
        }
    }

    public static void w(final String tag, final String msg) {
        if (isDebug) {
            Log.w(tag, "--> " + msg);
        }
    }

    /**
     * 调试日志，便于开发跟踪。
     */
    public static void e(final String tag, final String msg) {
        if (isDebug) {
            Log.e(tag, "--> " + msg);
        }
    }
}
