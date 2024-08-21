package com.aditya.familyflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtSignin,txtSendOtp;
    Button btnRegister;
    EditText etName,etPhone;
    Intent intent;
    TextInputLayout enterotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        txtSignin=findViewById(R.id.txtSignin);
        btnRegister=findViewById(R.id.btnRegister);
        etName=findViewById(R.id.etName);
        etPhone=findViewById(R.id.etPhone);
        enterotp=findViewById(R.id.enterotp);
        txtSendOtp=findViewById(R.id.txtSendOtp);

        enterotp.setVisibility(View.GONE);

        txtSignin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        txtSendOtp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtSignin:
                intent=new Intent(RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.btnRegister:
                intent=new Intent(RegisterActivity.this,CreatePassword.class);
                startActivity(intent);
                break;

            case R.id.txtSendOtp:
                enterotp.setVisibility(View.VISIBLE);
                break;
        }
    }
}