package com.example.bus_booking_app;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class admin extends AppCompatActivity {

    Button add;
    Switch swt;
    EditText num;
    EditText time;
    RadioButton am;
    RadioButton pm;
    String bustime;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference().child("Bus");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        ///////////////retrieve data////////////////////




        //////////////////////////////////

        num = findViewById(R.id.number);
        add = findViewById(R.id.add);
        time = findViewById(R.id.time);
        am = findViewById(R.id.AM);
        pm = findViewById(R.id.PM);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(am.isChecked()){
                    bustime = time.getText().toString() + am.getText().toString();
                }
                else if(pm.isChecked()){
                    bustime = time.getText().toString() + am.getText().toString();
                }
                else{
                    Toast.makeText(admin.this, "please choose time", Toast.LENGTH_SHORT).show();
                    bustime="";
                }



                if(Integer.parseInt(num.getText().toString()) > 0
                        && Integer.parseInt(num.getText().toString()) < 10
                        && bustime != ""
                )

                    for (int i =0; i < Integer.parseInt(num.getText().toString()); i++) {

                    FirebaseDatabase.getInstance().getReference()
                            .child("Bus").child(bustime).child(String.valueOf(i+1))
                            .setValue(true);
                }
            }
        });



    }


}