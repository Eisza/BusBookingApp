package com.example.bus_booking_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import android.app.Activity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.NumberFormat;
import java.util.HashMap;

public class admin extends AppCompatActivity {

    Button add;
    Switch swt;
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        num = findViewById(R.id.number);
        add = findViewById(R.id.button);
        swt = findViewById(R.id.switch1);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i =0; i < Integer.parseInt(num.getText().toString()); i++) {
                    Toast.makeText(admin.this, "gg", Toast.LENGTH_SHORT).show();

                    FirebaseDatabase.getInstance().getReference()
                            .child("Bus").child("1AM").child(String.valueOf(i+1))
                            .setValue(swt.isChecked());
                }
            }
        });



    }


}