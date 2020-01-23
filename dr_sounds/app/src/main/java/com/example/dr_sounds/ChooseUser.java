package com.example.dr_sounds;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseUser extends AppCompatActivity {
    TextView new_user;
    ImageButton doctorbutton;
    ImageButton patitentbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_user_type);
        new_user = (TextView) findViewById(R.id.new_user2);
        new_user.setPaintFlags(new_user.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void Doctor(View v) {
        Intent intent = new Intent(ChooseUser.this, DoctorInitLogin.class);
        startActivity(intent);
    }

    public void Patient(View v) {
        Intent intent = new Intent(ChooseUser.this, Patient_login.class);
        startActivity(intent);
    }

    public void newuser(View v){
        Intent intent = new Intent(ChooseUser.this, Registration.class );
        startActivity(intent);
    }

}