package com.example.dr_sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InitLogin extends AppCompatActivity {
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
        checker = (TextView) findViewById(R.id.checker);
        db = new Database(this);
    }
    public void initlogin(View v){
//        if(username.getText().toString().equals("Robert") && password.getText().toString().equals("pass")){
//            Intent intent = new Intent(InitLogin.this, UserSelection.class );
//            startActivity(intent);
//        }else if(username.getText().toString().equals("doctor") && password.getText().toString().equals("pass")){
//            Intent intent = new Intent(InitLogin.this, doctorpage.class );
//            startActivity(intent);
//        }
//        else{
//            checker.setText("Wrong Credentials, Try Again");
//            checker.setVisibility(View.VISIBLE);
//        }
        String user = username.getText().toString().trim();
        String passwrd = password.getText().toString().trim();
        Boolean res = db.checkUser(user, passwrd);

        if(res == true){
            Toast.makeText(InitLogin.this, "Successfully Logged in", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(InitLogin.this, UserSelection.class );
            startActivity(intent);
        }else
            Toast.makeText(InitLogin.this, "Incorrect Username/Password", Toast.LENGTH_SHORT).show();

    }

}
