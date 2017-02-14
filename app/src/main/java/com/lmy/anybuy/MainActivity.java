package com.lmy.anybuy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.lmy.anybuy.logic.bean.UserInfo;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends Activity {


    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //第一：默认初始化
        Bmob.initialize(this, "7b802caecd996887785382021ac31877");

        setContentView(R.layout.activity_main);

        fist();

    }

    private void fist() {
        UserInfo mUser = new UserInfo();
        mUser.setName("天下第一");
        mUser.setEmail("6666");

        mUser.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e==null){
                    Toast.makeText(mContext, "fail to add user", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(mContext, "success to add user", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
