package com.example.bus_booking_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button custbut;
    Button admbut;
    Button sgubut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        sgubut = findViewById(R.id.butsgu);
        admbut = findViewById(R.id.butadmin);
        custbut = findViewById(R.id.butcust);

        //SIGN UP !!!
        sgubut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,signup.class));
                finish();
            }
        });

        //Admin
        admbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,admin.class));
                finish();
            }
        });

        //Admin
        custbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,customer.class));
                finish();
            }
        });

    }
}