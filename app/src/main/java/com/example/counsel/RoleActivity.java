package com.example.counsel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RoleActivity extends AppCompatActivity {

    TextView choose;
    Button counsellor, counselee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role);
        choose = findViewById(R.id.tv_title_choose);
        counsellor = findViewById(R.id.Counsellor_button);
        counselee = findViewById(R.id.Counselee);

        //Link to Counsellor Profile
        counsellor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent counselloep = new Intent(RoleActivity.this, CounsellorProfile.class);
                RoleActivity.this.startActivity(counselloep);
            }
        });
        //Link to Counselee profile activity
        counselee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent counseleeP = new Intent(RoleActivity.this, Counselee_profile.class);
                RoleActivity.this.startActivity(counseleeP);
            }
        });
    }
}
