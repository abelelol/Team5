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
    String type;
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
        type = "doctor";
        String user = username.getText().toString().trim();
        String passwrd = password.getText().toString().trim();
        if(doctor.isSelected())
            type = "doctor";
        else
            type = "patient";
        db.addUser(user,passwrd);
        if(type.equals("doctor"))
            Toast.makeText(Registration.this,"Doctor Account has been created", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(Registration.this,"Patient Account has been created", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Registration.this, ChooseUser.class);
        intent.putExtra("type",type);
        startActivity(intent);
    }



}
