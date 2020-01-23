package com.example.dr_sounds;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.microsoft.cognitive.speakerrecognition.SpeakerIdentificationClient;
//import com.microsoft.cognitive.speakerrecognition.SpeakerVerificationClient;
//import com.microsoft.cognitive.speakerrecognition.SpeakerVerificationRestClient;

public class AddFamilyMem extends AppCompatActivity {

//    SpeakerVerificationClient stuff;
//    SpeakerVerificationRestClient enrolment;
//    SpeakerIdentificationClient hey;
    Button addsound;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_family);
        addsound = findViewById(R.id.add_sound);
        addsound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddFamilyMem.this, AudioRecord.class);
                startActivity(intent);
            }
        });
    }

    // this is going to method connected to the onclick of the add sound button
//    public void addSound(View v){
//        Intent intent = new Intent(AddFamilyMem.this, AudioRecord.class);
//        startActivity(intent);
//    }
}
