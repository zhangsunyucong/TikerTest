package com.example.hyj.tikertest;

import android.util.Log;

/**
 * 测试bug类.
 *
 * @author devilwwj
 * @since 2016/10/25
 */
public class BugClass {

    public String bug() {
        // 这段代码会报空指针异常
       // String str = "修好了呀";
        String str = "get String length";
        //String str = null;
        Log.e("BugClass", "get String length:" + str.length());
        return str;
    }
}
