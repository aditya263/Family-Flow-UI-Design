package com.aditya.familyflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etEmail,etPassword;
    TextView txtForgetPass,txtSignup;
    Button btnLogin;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail=findViewById(R.id.etEmail);
        txtForgetPass=findViewById(R.id.txtForgetPass);
        etPassword=findViewById(R.id.etPassword);
        txtSignup=findViewById(R.id.txtSignup);
        btnLogin=findViewById(R.id.btnLogin);

        txtSignup.setOnClickListener(this);
        txtForgetPass.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtSignup:
                intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.txtForgetPass:
                intent=new Intent(LoginActivity.this,ForgetPassword.class);
                startActivity(intent);
                finish();
                break;


            case R.id.btnLogin:
                intent=new Intent(LoginActivity.this,NavigationActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}