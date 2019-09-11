package com.example.assu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartAssignmentsForDoctors extends AppCompatActivity {
    TextView namesofassignment;
    EditText questiontostudent,answerone,answertwo,answerthree,answerfour,rightanswers;
    Button uploading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_assignments_for_doctors);

        namesofassignment=findViewById(R.id.nameofassignment);
        questiontostudent=findViewById(R.id.questions);
        answerone=findViewById(R.id.ans1);
        answertwo=findViewById(R.id.ans2);
        answerthree=findViewById(R.id.ans3);
        answerfour=findViewById(R.id.ans4);
        uploading=findViewById(R.id.upload);


    }
    }

