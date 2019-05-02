package com.example.rescue2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void gotoRegistration(View view) {
        Intent registrationActivityIntent = new Intent(getApplicationContext(), RegistrationActivity.class);
        startActivity(registrationActivityIntent);
    }
}
