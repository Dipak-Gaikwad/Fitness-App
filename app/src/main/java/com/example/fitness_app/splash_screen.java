package com.example.fitness_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    Animation logoAnim, appNameAnim, sloganAnim;
    ImageView imageView_logo;
    TextView textView_appName, textView_slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logoAnim = AnimationUtils.loadAnimation(this,R.anim.logo_anim);
        appNameAnim = AnimationUtils.loadAnimation(this,R.anim.app_name_anim);
        sloganAnim = AnimationUtils.loadAnimation(this,R.anim.slogan_anim);

        imageView_logo = findViewById(R.id.imageView_logo);
        textView_appName = findViewById(R.id.textView_appName);
        textView_slogan = findViewById(R.id.textView_slogan);
        textView_slogan.setVisibility(View.GONE);

        imageView_logo.setAnimation(logoAnim);
        textView_appName.setAnimation(appNameAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView_slogan.setVisibility(View.VISIBLE);
                textView_slogan.setAnimation(sloganAnim);
            }
        },2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this,startPage.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}