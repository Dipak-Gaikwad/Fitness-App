package com.example.fitness_app;


import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class AboutUs extends AppCompatActivity {
    ConstraintLayout expandableview_info;
    Button button_arrow_info;
    CardView cardView_info;
    ConstraintLayout expandableview_team;
    Button button_arrow_team;
    CardView cardView_team;

    //url
    TextView git;

    //mail
    TextView contact, feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About Us");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        expandableview_info = findViewById(R.id.expandableview_info);
        button_arrow_info = findViewById(R.id.button_arrow_info);
        cardView_info = findViewById(R.id.cardview_about);

        button_arrow_info.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (expandableview_info.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView_info,new AutoTransition());
                    expandableview_info.setVisibility(View.VISIBLE);
                    button_arrow_info.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                    expandableview_team.setVisibility(View.GONE);
                    button_arrow_team.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }else{
                    TransitionManager.beginDelayedTransition(cardView_info,new AutoTransition());
                    expandableview_info.setVisibility(View.GONE);
                    button_arrow_info.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });


        expandableview_team = findViewById(R.id.expandableview_team);
        button_arrow_team = findViewById(R.id.button_arrow_team);
        cardView_team = findViewById(R.id.cardview_about);

        button_arrow_team.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if(expandableview_team.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView_team,new AutoTransition());
                    expandableview_team.setVisibility(View.VISIBLE);
                    button_arrow_team.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                    expandableview_info.setVisibility(View.GONE);
                    button_arrow_info.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }else{
                    TransitionManager.beginDelayedTransition(cardView_team,new AutoTransition());
                    expandableview_team.setVisibility(View.GONE);
                    button_arrow_team.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });


        //url
        git = findViewById(R.id.git2);
        git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://github.com/Dipak-Gaikwad/Fitness_App");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        //mail- contact
        contact = findViewById(R.id.contact2);
        contact.setText(Html.fromHtml("<a href=\"mailto:homeworkout@gmail.com.\">homeworkout@gmail.com</a>"));
        contact.setMovementMethod(LinkMovementMethod.getInstance());

        //mail- service
        feedback = findViewById(R.id.service2);
        feedback.setText(Html.fromHtml("<a href=\"mailto:homeworkout@feedback.com.\">Send Feedback</a>"));
        feedback.setMovementMethod(LinkMovementMethod.getInstance());

    }
}