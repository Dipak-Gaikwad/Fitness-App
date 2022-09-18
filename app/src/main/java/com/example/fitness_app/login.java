package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.os.Bundle;

public class login extends AppCompatActivity {

    EditText name,password;
    Button login,register;
    TextView pass_tv,email_tv;
    String user_name,user_password;

    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //getSupportActionBar().setTitle("Login");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        reference = FirebaseDatabase.getInstance().getReference();

        name = findViewById(R.id.loginuser);
        password = findViewById(R.id.loginpassword);
        login = findViewById(R.id.loginbtn1);
        register = findViewById(R.id.regbtn2);
        pass_tv = findViewById(R.id.loginpasswordtv);
        email_tv = findViewById(R.id.loginemailtv);

        pass_tv.setText("");
        email_tv.setText("");
    }

    public void register(View view) {
        startActivity(new Intent(getApplicationContext(),register.class));
        finish();
    }

    public void loginbtn(View view) {
        if(correct()){

            user_name = name.getText().toString().trim();
            user_password = password.getText().toString().trim();

            reference.child("User").child(user_name).addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    if(snapshot.exists()){
                        String dbuser , dbpassword , dbemail , dbgender ;
                        dbuser = snapshot.child("user_name").getValue().toString();
                        dbpassword = snapshot.child("user_password").getValue().toString();
                        dbemail = snapshot.child("user_email").getValue().toString();
                        dbgender = snapshot.child("user_gender").getValue().toString();

                        if(user_name.equals(dbuser)&&user_password.equals(dbpassword)){
                            //startActivity(new Intent(login.this, main_courses.class));
                            Intent intent = new Intent(login.this, main_courses.class);
                            intent.putExtra("db_user", dbuser);
                            intent.putExtra("db_email", dbemail);
                            intent.putExtra("db_gender", dbgender);
                            startActivity(intent);
                            finish();
                        }
                        else{
                            Toast.makeText(login.this, "User name or password is incorrect", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(login.this, "User name or password is incorrect", Toast.LENGTH_SHORT).show();
                    }


                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });

        }

    }

    private boolean correct(){
        if(name.getText().toString().equals("")){
            email_tv.setText("Enter User Name...");
            return false;
        }
        if(password.getText().toString().equals("")){
            pass_tv.setText("Enter Password...");
            return false;
        }

        return true;

    }
}