package com.example.assu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListOfStudents extends AppCompatActivity {
    //Initialization variables and Array
    ListView listView;
    ArrayList<ModelOfSubjects> listOfStudent = new ArrayList<>();
    String [] name = {"Data structure" , "Operating System" , "Java" , "C++" , "DataBase_SQl","interdiction computer", "Network","Python","PHP","ASP.NET"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_students);

        listView =findViewById(R.id.list_student);

        //For loop into value of variable to fill Array list

        for (int i =0 ; i < name.length ;i++)
        {
            listOfStudent.add(new ModelOfSubjects(name[i]));
        }

        // make call adapter class for list view

        final AdapterSubjectsOfStudents adapterObject = new AdapterSubjectsOfStudents(getBaseContext(),0,listOfStudent);
        listView.setAdapter(adapterObject);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
                Intent toAttendanceAndAssignment = new Intent(ListOfStudents.this, AttendanceAndAssignment.class);
                toAttendanceAndAssignment .putExtra("Position",i);
                startActivity(toAttendanceAndAssignment);



            }
        });




    }
}
