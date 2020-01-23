package com.example.dr_sounds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EndScreen extends AppCompatActivity {

    Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_screen);

        done = (Button) findViewById(R.id.end1);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent endScreen = new Intent(EndScreen.this, DoctorInitLogin.class);
                startActivity(endScreen);
            }
        });
    }
}
