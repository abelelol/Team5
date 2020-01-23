package com.example.dr_sounds;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Patient_login extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;
    TextView checker;
    Database db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient_login);

        username = (EditText) findViewById(R.id.PUsername);
        password = (EditText) findViewById(R.id.PPassword);
        login = (Button) findViewById(R.id.Pbutton);
        checker = (TextView) findViewById(R.id.Pchecker);
        db = new Database(this);
    }


    public void pinitlogin(View v){
        String user = username.getText().toString().trim();
        String passwrd = password.getText().toString().trim();
        Boolean res = db.checkUser(user, passwrd);

        if(res == true){
            Toast.makeText(Patient_login.this, "Successfully Logged in as Patient", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Patient_login.this, UserSelection.class );
            startActivity(intent);
        }else
            Toast.makeText(Patient_login.this, "Incorrect Username/Password", Toast.LENGTH_SHORT).show();

    }


}
