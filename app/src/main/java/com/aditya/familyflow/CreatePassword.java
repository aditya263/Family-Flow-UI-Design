package com.aditya.familyflow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreatePassword extends AppCompatActivity implements View.OnClickListener{

    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_password);

        btnRegister=findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnRegister:
                Intent intent=new Intent(CreatePassword.this,PersonalDetails.class);
                startActivity(intent);
                break;
        }
    }

}