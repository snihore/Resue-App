package com.example.rescue2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }

    public void gotoRegistration(View view) {
        Intent registrationActivityIntent = new Intent(getApplicationContext(), RegistrationActivity.class);
        startActivity(registrationActivityIntent);
    }

    public void gotoLogin(View view) {
        Intent loginActivityIntent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(loginActivityIntent);
    }
}
