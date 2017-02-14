package com.lmy.anybuy;

import android.app.Activity;
import android.os.Bundle;

import cn.bmob.v3.Bmob;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //第一：默认初始化
        Bmob.initialize(this, "7b802caecd996887785382021ac31877");

        setContentView(R.layout.activity_main);

    }
}
