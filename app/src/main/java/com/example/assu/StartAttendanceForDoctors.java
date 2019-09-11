package com.example.assu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class StartAttendanceForDoctors extends AppCompatActivity {

    EditText codes;
    Button beginnig, turn;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_attendance_for_doctors);

        databaseReference = FirebaseDatabase.getInstance().getReference("Subjects");

        codes = findViewById(R.id.codeofstudents);
        beginnig = findViewById(R.id.login);

        beginnig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code =  codes.getText().toString();

                Intent n = getIntent();
                Bundle b = n.getExtras();

                if(b != null) {
                    String subjectName = (String) b.get("subject_name");
                    databaseReference.child(subjectName).child("Id_lecture").setValue(code);
                }
            }
        });


    }
}
