package com.example.fitness_app;


import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;


import java.util.Objects;

public class Profile<firebaseUser> extends AppCompatActivity {

    TextView f_name_p, f_name, Email, gender;

    //profile
    String dbuser, dbemail, dbgender;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Profile");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        f_name_p = findViewById(R.id.full_name_profile);
        f_name = findViewById(R.id.fullname);
        Email = findViewById(R.id.email_profile);
        gender = findViewById(R.id.gender_profile);

        //profile
        dbuser = getIntent().getStringExtra("profile_user");
        dbemail = getIntent().getStringExtra("profile_email");
        dbgender = getIntent().getStringExtra("profile_gender");

        //set text
        f_name.setText(dbuser.toUpperCase());
        f_name_p.setText(dbuser);
        Email.setText(dbemail);
        gender.setText(dbgender);

    }
}