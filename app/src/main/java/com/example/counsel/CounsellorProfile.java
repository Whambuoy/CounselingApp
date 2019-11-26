package com.example.counsel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CounsellorProfile extends AppCompatActivity {

    EditText Name, Phone, Description;
    String Counsellor_name, counsellor_phone, counsellor_description;
    Button Add_profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counsellor_profile);

        Name = findViewById(R.id.Counsellor_name);
        Phone = findViewById(R.id.counsellor_phoneNo);
        Description = findViewById(R.id.counsellor_description);
        Add_profile = findViewById(R.id.Add_profile);

        //But when clicked, collects data and opens dashboard(add this later)
        Add_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Counsellor_name = Name.getText().toString().toLowerCase().trim();
                counsellor_phone = Phone.getText().toString().trim();
                counsellor_description = Description.getText().toString().trim();

                //TO DO; ADD CODE TO LAUNCH DASHBOARD ACTIVITY
                Intent dash = new Intent(CounsellorProfile.this, Dashboard.class);
                CounsellorProfile.this.startActivity(dash);
            }
        });
    }
}
