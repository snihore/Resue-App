package com.example.rescue2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Intent registrationActivityIntent = new Intent(getApplicationContext(), RegistrationActivity.class);
//
//        startActivity(registrationActivityIntent);
//        Intent loginActivityIntent = new Intent(getApplicationContext(), LoginActivity.class);
//
//        startActivity(loginActivityIntent);

        Intent optionsActivityIntent = new Intent(getApplicationContext(), OptionsActivity.class);

        startActivity(optionsActivityIntent);
    }
}
