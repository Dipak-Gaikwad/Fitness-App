package com.example.fitness_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.os.Bundle;

public class register extends AppCompatActivity {

    DatabaseReference reference;

    EditText name, email, password, confirm_password;
    TextView txtName, txtEmail, txtPassword, txtConfirmPassword;
    Button registerbtn;
    RadioButton male,female,other;
    RadioGroup gender;

    String user_name,user_email,user_password,user_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        reference = FirebaseDatabase.getInstance().getReference();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirm_password = findViewById(R.id.confirmPassword);
        registerbtn = findViewById(R.id.registerbtn);
        txtName = findViewById(R.id.nameTextView);
        txtEmail = findViewById(R.id.emailTextView);
        txtPassword = findViewById(R.id.passwordTextView);
        txtConfirmPassword = findViewById(R.id.confirmPasswordTextView);
        gender = findViewById(R.id.gender);

        txtName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
    }

    public void reg_click(View view) {
        if(correct()){
            txtName.setText("");
            txtEmail.setText("");
            txtPassword.setText("");
            txtConfirmPassword.setText("");

            user_name = name.getText().toString().trim();
            user_email = email.getText().toString().trim();
            user_password = password.getText().toString().trim();

            int gen_id = gender.getCheckedRadioButtonId();

            switch(gen_id){
                case R.id.male :
                    user_gender = "Male";
                    break;
                case R.id.female :
                    user_gender = "Female";
                    break;
                case R.id.other :
                    user_gender = "Other";
                    break;
                default :
                    user_gender = "NA";
                    break;
            }

            User user = new User(user_name,user_email,user_password,user_gender);
            reference.child("User").child(user_name).setValue(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    Toast.makeText(register.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                }
            });


            startActivity(new Intent(getApplicationContext(),login.class));
            finish();
        }
    }

    private boolean correct(){
        if(name.getText().toString().equals("")){
            txtName.setText("Enter Name...");
            return false;
        }
        if(email.getText().toString().equals("")){
            txtEmail.setText("Enter Email...");
            return false;
        }
        if(password.getText().toString().equals("")){
            txtPassword.setText("Enter Password...");
            return false;
        }
        if(confirm_password.getText().toString().equals("")){
            txtConfirmPassword.setText("Re-enter Password...");
            return false;
        }

        if(confirm_password.getText().toString().length()<6){
            txtConfirmPassword.setText("Password must contain minimum 6 characters...");
            return false;
        }
        if(!password.getText().toString().equals(confirm_password.getText().toString())){
            txtConfirmPassword.setText("Password is not matching. Please, enter correct Password...");
            return false;
        }

        return true;
    }

    public void login_click(View view) {
        startActivity(new Intent(getApplicationContext(),login.class));
        finish();
    }
}