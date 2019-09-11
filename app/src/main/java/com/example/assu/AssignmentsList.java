package com.example.assu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AssignmentsList extends AppCompatActivity {


    ListView listAssignmentsName ;
    final ArrayList<ModelOfAssignmentList> listassignments = new ArrayList<>();
    final String [] assignments = {"assignments 1" , "assignments 2" , "assignments 3" , "assignments 4" , "assignments 5","assignments 6", "assignments 7","assignments 8","assignments 9"
            ,"assignments 10","assignments 11","assignments12" ,"assignments 13","assignments 14","assignments15" ,"assignments 16","assignments 17","assignments18"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);

        listAssignmentsName =findViewById(R.id.list_assignments);


        for (int i =0 ; i < assignments.length ;i++)
        {
            listassignments.add(new ModelOfAssignmentList(assignments[i]));
        }
        final AdapterAssignmentOfStudent adapterObject = new AdapterAssignmentOfStudent(getBaseContext(),0,listassignments);
        listAssignmentsName.setAdapter(adapterObject);

        listAssignmentsName.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent toAssignmentsTest = new Intent(AssignmentsList.this, AssignmentTest.class);
                startActivity(toAssignmentsTest);



            }
        });
    }
}
