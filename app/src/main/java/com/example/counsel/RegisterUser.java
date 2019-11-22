package com.example.counsel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class RegisterUser extends AppCompatActivity {

    EditText l_email, r_email, l_password, r_password, cnfpassword;
    String regin_email, regin_password, regin_cnfpassword, lin_email, lin_password;
    Button btn_register, btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        ViewPager viewpager = findViewById(R.id.viewPager);

        RegisterUser.AuthenticatePagerAdapter pagerAdapter =
                new RegisterUser.AuthenticatePagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new Login_fragment());
        pagerAdapter.addFragment(new Register_fragment());
        viewpager.setAdapter(pagerAdapter);

        l_email = findViewById(R.id.login_email);
        l_password = findViewById(R.id.login_password);
        r_email = findViewById(R.id.reg_email);
        r_password = findViewById(R.id.reg_password);
        cnfpassword =findViewById(R.id.reg_repassword);
        btn_login = findViewById(R.id.btn_login);
        btn_register =findViewById(R.id.btn_register);

        //Get the data when buttons are clicked
        //Register
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regin_email = r_email.getText().toString().toLowerCase().trim();
                regin_password = r_password.getText().toString().trim();
                regin_cnfpassword = cnfpassword.getText().toString().trim();


            }
        });

        //Login
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lin_email = l_email.getText().toString().toLowerCase().trim();
                lin_password = l_password.getText().toString().trim();


            }
        });


    }

    //class serves to connect Fragments with viewPager
    class AuthenticatePagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragmentList = new ArrayList<>();
        public AuthenticatePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
        void addFragment(Fragment fragment) {
            fragmentList.add(fragment);
        }
    }
}
