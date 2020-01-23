package com.example.dr_sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DoctorInitLogin extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;
    TextView checker;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.Password);
        login = (Button) findViewById(R.id.button);
        db = new Database(this);
    }
    public void initlogin(View v){
        String user = username.getText().toString().trim();
        String passwrd = password.getText().toString().trim();
        Boolean res = db.checkUser(user, passwrd);

        if(res == true) {
            Toast.makeText(DoctorInitLogin.this, "Successfully Logged in as Doctor", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DoctorInitLogin.this, doctorpage.class);
            startActivity(intent);
        }
        else
            Toast.makeText(DoctorInitLogin.this, "Incorrect Username/Password", Toast.LENGTH_SHORT).show();

    }

}
