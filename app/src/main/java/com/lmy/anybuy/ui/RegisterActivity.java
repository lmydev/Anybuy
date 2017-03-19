package com.lmy.anybuy.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lmy.anybuy.R;
import com.lmy.anybuy.logic.bean.UserInfo;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/3/19
 */

public class RegisterActivity extends Activity implements View.OnClickListener {


    private Context mContext;
    private int accontLength;
    private int pwdLength;


    @BindView(R.id.et_account)
    EditText etAccount;
    @BindView(R.id.et_password_first)
    EditText etPasswordFirst;
    @BindView(R.id.et_password_second)
    EditText etPasswordSecond;
    @BindView(R.id.bt_login)
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //第一：默认初始化
        Bmob.initialize(this, "7b802caecd996887785382021ac31877");

        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        init();
    }

    void init() {
        ButterKnife.bind(this);
        mContext = this;
        btLogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        int i = view.getId();
        switch (i) {
            case R.id.bt_login:
                if (etAccount.length() <= 0 || etPasswordFirst.length() <=0){
                    Toast.makeText(mContext, "账号密码不能为空", Toast.LENGTH_LONG).show();
                    return;
                }
                if (!etPasswordFirst.getText().toString().equals(etPasswordSecond.getText().toString())){
                    //判断两次密码是否一致
                    Toast.makeText(mContext, "密码不一致", Toast.LENGTH_LONG).show();
                    return;

                }
                submit(etAccount.getText().toString(), etPasswordFirst.getText().toString());

        }

    }

    void submit(String account, String password){
        UserInfo mUser = new UserInfo();
        mUser.setUserName(account);
        mUser.setEmail("123456@123.com");
        mUser.setPassWord(password);

        mUser.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e==null){
                    Toast.makeText(mContext, "success to add user", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(mContext, "fail to add user", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

