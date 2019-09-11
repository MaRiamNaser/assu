package com.example.assu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList <subjectOfDoctor> list = new ArrayList<>();
    DatabaseReference databaseReference , ref;

//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference("Subjets");

        ListView customListViewJAVA =  findViewById(R.id.listView1);
        subjectOfDoctor subject1 = new subjectOfDoctor("Data Comuncations","mariam3");
        subjectOfDoctor subject2 = new subjectOfDoctor("Logic Design", "maiam1");
        subjectOfDoctor subject3 = new subjectOfDoctor("Introduction To Cs", "mariam2");
        subjectOfDoctor subject4 = new subjectOfDoctor("Python", "mariam3");
        subjectOfDoctor subject5 = new subjectOfDoctor("Network1", "mariam2");
        subjectOfDoctor subject6 = new subjectOfDoctor("Simulation", "maiam1");

        list.add(subject1);
        list.add(subject2);
        list.add(subject3);
        list.add(subject4);
        list.add(subject5);
        list.add(subject6);

        int xmlFile = R.layout.row_subjects_doctors;
        AdapterSubjectsForDoctors adapter = new AdapterSubjectsForDoctors(MainActivity.this, xmlFile, list);
        customListViewJAVA.setAdapter(adapter);

        //**************************************************************
        // when you click on item in list view
        customListViewJAVA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent newActivity = new Intent(MainActivity.this, EverySubjectInDetails.class);
                String subjectName = list.get(position).getName();
                databaseReference.child(subjectName).setValue("");

                newActivity.putExtra("subject_name", subjectName);

                Intent n = getIntent();
                Bundle b = n.getExtras();
                if( b != null)
                {
                    String Id_doctor = (String) b.get("Id_doctor");
                    databaseReference.child(subjectName).child("Id_doctor").setValue(Id_doctor);
                }

                startActivity(newActivity);
            }
        });
        //**************************************************************
    }
}
