package com.example.counsel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Counselee_profile extends AppCompatActivity {

    EditText Name, Phone, Description;
    String Counselee_name, counselee_phone, counselee_description;
    Button Add_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselee_profile);

        Name = findViewById(R.id.Counselee_name);
        Phone = findViewById(R.id.counselee_phoneNo);

        Add_profile = findViewById(R.id.Add_profile2);

        Add_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Counselee_name = Name.getText().toString().toLowerCase().trim();
                counselee_phone = Phone.getText().toString().trim();


                //ADD CODE TO OPEN DASHBOARD
                Intent dash = new Intent(Counselee_profile.this, Dashboard.class);
                Counselee_profile.this.startActivity(dash);
            }
        });
    }
}
