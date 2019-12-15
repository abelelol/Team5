package com.example.dr_sounds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    RadioButton doctor, patient;
    EditText username, password;
    Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeration);
        db = new Database(this);
        doctor = findViewById(R.id.doctor);
        patient = findViewById(R.id.patient);
        username = findViewById(R.id.usernm_creation);
        password = findViewById(R.id.passwrd_creation);
    }

    public void register(View v){
        String user = username.getText().toString().trim();
        String passwrd = password.getText().toString().trim();
        db.addUser(user,passwrd);
        Toast.makeText(Registration.this,"Account has been created", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Registration.this, ChooseUser.class);
        startActivity(intent);
    }



}
