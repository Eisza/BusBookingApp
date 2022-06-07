package com.example.bus_booking_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                HashMap<String, Object> map = new HashMap<>();
                map.put("id","123");
                map.put("booked", true);
                FirebaseDatabase.getInstance().getReference().updateChildren(map);

              //  FirebaseAuth.getInstance().signOut();
               // Toast.makeText(MainActivity.this, "Logged out", Toast.LENGTH_SHORT).show();


               // startActivity(new Intent(MainActivity.this,customer.class));


            }
        });


    }
}