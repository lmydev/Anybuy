package com.lmy.anybuy.ui.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lmy.anybuy.ui.Home.MainActivity;
import com.lmy.anybuy.R;
import com.lmy.anybuy.logic.bean.UserInfo;
import com.lmy.anybuy.util.zLog;
import com.lmy.anybuy.util.zToast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/3/19
 */

public class LoginActivity extends Activity implements View.OnClickListener {


    private String TAG = "LoginActivity";
    private Context mContext;
    private String phone;
    private String pwd;
    private int phoneLength;
    private int pwdLength;

    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.bt_register)
    Button btRegister;
    @BindView(R.id.bt_find_password)
    Button btFindPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //第一：默认初始化
        Bmob.initialize(this, "7b802caecd996887785382021ac31877");
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        init();
    }

    void init() {
        ButterKnife.bind(this);
        mContext = this;

        btLogin.setOnClickListener(this);
        btRegister.setOnClickListener(this);
        btFindPassword.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
        switch (id) {
            case R.id.bt_login:


                zLog.e(TAG, etPhone.getText().toString() + "====" + etPassword.getText().toString());
                login(etPhone.getText().toString(), etPassword.getText().toString());
                break;

            case R.id.bt_register:

                Intent intent = new Intent(mContext, RegisterActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_find_password:

                break;
        }

    }

    void login(String phone, final String password) {
        BmobQuery<UserInfo> query = new BmobQuery<UserInfo>();
        query.addWhereEqualTo("phone", phone);

        query.findObjects(new FindListener<UserInfo>() {
            @Override
            public void done(List<UserInfo> list, BmobException e) {
                if (e==null) {
                    //查询成功
                    if (list.get(0).getPassWord().equals(password)) {
                        //账号密码都输入正确
                        Intent intent = new Intent(mContext, MainActivity.class);
                        startActivity(intent);
                    }else {
                        zToast.showShort(mContext, "请输入正确的账号或密码", true);
                    }

                }else {
                    Toast.makeText(mContext, "请输入正确的账号或密码", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
