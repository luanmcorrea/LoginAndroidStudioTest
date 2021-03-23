package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnGoLogin = (Button)findViewById(R.id.btnGoLogin);
        btnGoLogin.setOnClickListener(this::goLogin);

        Button btnGoSplash = (Button)findViewById(R.id.btnGoSplash);
        btnGoSplash.setOnClickListener(this::goSplash);
    }
    private void goLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    private void goSplash(View view) {
        Intent intent = new Intent(this, SplashScreen.class);
        startActivity(intent);
    }
}