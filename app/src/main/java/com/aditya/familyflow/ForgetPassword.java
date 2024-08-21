package com.aditya.familyflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class ForgetPassword extends AppCompatActivity implements View.OnClickListener {

    TextInputLayout textInputPassword,textInputcPassword,enterotp;
    TextView txtSendOtp;
    Button btnChangePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        textInputPassword=findViewById(R.id.textInputPassword);
        textInputcPassword=findViewById(R.id.textInputcPassword);
        enterotp=findViewById(R.id.enterotp);
        txtSendOtp=findViewById(R.id.txtSendOtp);
        btnChangePassword=findViewById(R.id.btnChangePassword);

        textInputPassword.setVisibility(View.GONE);
        textInputcPassword.setVisibility(View.GONE);

        txtSendOtp.setOnClickListener(this);
        btnChangePassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.txtSendOtp:
                textInputPassword.setVisibility(View.VISIBLE);
                textInputcPassword.setVisibility(View.VISIBLE);
                break;

            case R.id.btnChangePassword:
                Toast.makeText(this, "Password Changed Successfully", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(ForgetPassword.this,LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}