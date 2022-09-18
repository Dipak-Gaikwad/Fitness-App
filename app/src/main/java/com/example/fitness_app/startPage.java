package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;
import android.view.WindowManager;

public class startPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void register(View view) {
        startActivity(new Intent(getApplicationContext(),register.class));
        finish();
    }

    public void login(View view) {
        startActivity(new Intent(getApplicationContext(),login.class));
        finish();
    }
}