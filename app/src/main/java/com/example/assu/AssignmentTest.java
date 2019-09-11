package com.example.assu;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AssignmentTest extends AppCompatActivity {


    ListView listassignmentstest;
    final ArrayList<ModelOfAssignmentsTest> listassginmentstest = new ArrayList<>();
    final String [] ques = {"assignments 1" , "assignments 2" , "assignments 3" , "assignments 4" , "assignments 5","assignments 6", "assignments 7","assignments 8","assignments 9"
            ,"assignments 10","assignments 11","assignments12" ,"assignments 13","assignments 14","assignments15" ,"assignments 16","assignments 17","assignments18"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment_test);

        listassignmentstest = findViewById(R.id.assignments_test);

        for (int i =0 ; i < ques.length ;i++)
        {
            listassginmentstest.add(new ModelOfAssignmentsTest(ques[i]));
        }

        final AdapterAssignmentsTest adapterAssignmentsTest = new AdapterAssignmentsTest(getBaseContext(),0,listassginmentstest);
        listassignmentstest.setAdapter(adapterAssignmentsTest);



    }
}
