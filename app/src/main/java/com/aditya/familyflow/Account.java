package com.aditya.familyflow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Account extends AppCompatActivity implements View.OnClickListener {

    LinearLayout linearChangePassword,linearPassword,linearName,linearEmail,linearPhoneno;
    Button btnCancel,btnSave;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.toolbar_tiltlecenter);
        View view = getSupportActionBar().getCustomView();

        TextView title = findViewById(R.id.title);
        title.setText("Account");

        ImageView imageButton = (ImageView) view.findViewById(R.id.back);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnCancel=findViewById(R.id.btnCancel);
        btnSave=findViewById(R.id.btnSave);
        linearPassword=findViewById(R.id.linearPassword);
        linearName=findViewById(R.id.linearName);
        linearChangePassword=findViewById(R.id.linearChangePassword);
        linearEmail=findViewById(R.id.linearEmail);
        linearPhoneno=findViewById(R.id.linearPhoneno);

        linearPassword.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnSave.setOnClickListener(this);
        linearName.setOnClickListener(this);
        linearEmail.setOnClickListener(this);
        linearPhoneno.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.linearPassword:
                if (count==0){
                    count = 1;
                    linearChangePassword.setVisibility(View.VISIBLE);
                }else if (count==1){
                    count = 0;
                    linearChangePassword.setVisibility(View.GONE);
                }
                break;

            case R.id.btnCancel:
                linearChangePassword.setVisibility(View.GONE);
                break;

            case R.id.btnSave:
                Toast.makeText(this, "Password Changed Successfully", Toast.LENGTH_SHORT).show();
                linearChangePassword.setVisibility(View.GONE);
                break;

            case R.id.linearName:
                nameDialog();
                break;

            case R.id.linearEmail:
                emailDialog();
                break;

            case R.id.linearPhoneno:
                Log.d("YourResponse","clickedPhone--");
                phoneDialog();
                break;
        }
    }

    private void phoneDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialogbox_phone);

        dialog.setCancelable( true );

        final EditText etPhone=dialog.findViewById(R.id.etPhone);
        Button btnCancel=dialog.findViewById(R.id.btnCancel);
        Button btnSave=dialog.findViewById(R.id.btnSave);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Account.this, "Phone no changed successfully", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void emailDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialogbox_email);

        dialog.setCancelable( true );

        final EditText etEmail=dialog.findViewById(R.id.etEmail);
        Button btnCancel=dialog.findViewById(R.id.btnCancel);
        Button btnSave=dialog.findViewById(R.id.btnSave);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Account.this, "Name changed successfully", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void nameDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature( Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialogbox_name);

        dialog.setCancelable( true );

        final EditText etName=dialog.findViewById(R.id.etName);
        Button btnCancel=dialog.findViewById(R.id.btnCancel);
        Button btnSave=dialog.findViewById(R.id.btnSave);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Account.this, "Name changed successfully", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}