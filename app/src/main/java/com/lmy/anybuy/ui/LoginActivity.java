package com.lmy.anybuy.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.lmy.anybuy.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * ClassName:
 * Function:
 * Author: lmy
 * Date: 2017/3/19
 */

public class LoginActivity extends Activity implements View.OnClickListener {


    private String TAG = "LoginActivity";
    private Context mContext;
    private String account;
    private String pwd;
    private int accountLength;
    private int pwdLength;

    @BindView(R.id.et_account)
    EditText etAccount;
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

                break;

            case R.id.bt_register:

                Intent intent = new Intent(mContext,RegisterActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_find_password:

                break;
        }

    }
}
