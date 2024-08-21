package com.aditya.familyflow;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatCheckBox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class AddPersonBasicInfo extends AppCompatActivity {

    Button btnnext,btnback;
    AppCompatCheckBox checkbox_industry;
    TextInputLayout textInputAddressTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_person_basic_info);

        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.toolbar_tiltlecenter);
        View view = getSupportActionBar().getCustomView();

        TextView title = findViewById(R.id.title);
        title.setText("Basic Information");

        ImageView imageButton = (ImageView) view.findViewById(R.id.back);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnnext=findViewById(R.id.btnnext);
        btnback=findViewById(R.id.btnback);
        checkbox_industry=findViewById(R.id.checkbox_industry);
        textInputAddressTwo=findViewById(R.id.textInputAddressTwo);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AddPersonBasicInfo.this,ProfileSummary.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
                finish();
            }
        });

        checkbox_industry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    textInputAddressTwo.setVisibility(View.GONE);
                }else {
                    textInputAddressTwo.setVisibility(View.VISIBLE);
                }
            }
        });

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        String[] marital = {"Select","Married","Unmarried"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, marital);
        spinner1.setAdapter(adapter1);

        /*Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        String[] years = {"Select","Hinduism","Islam","Christianity","Sikhism","Buddhism","Jainism"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, years);
        spinner.setAdapter(adapter2);*/

        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        String[] district = {"Select","Software Developer","Dentist","Physician Assistant","Nurse Practitioner","Other"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, district);
        spinner3.setAdapter(adapter3);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AddPersonBasicInfo.this,AddPerson.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(AddPersonBasicInfo.this,AddPerson.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
        finish();
    }
}