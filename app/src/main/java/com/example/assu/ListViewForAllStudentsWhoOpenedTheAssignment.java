package com.example.assu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewForAllStudentsWhoOpenedTheAssignment extends AppCompatActivity {

    ListView list;
    Button timer;
    EditText time_for_timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_for_all_students_who_opened_the_assignment);
        list = findViewById(R.id.students_list_view);
        timer = findViewById(R.id.timer);
        time_for_timer = findViewById(R.id.time_manager);
        ArrayList<String> names = new ArrayList<>();
        names.add("a");
        names.add("a");
        names.add("a");
        names.add("a");
        names.add("a");
        AdapterForStudentAssignmentList adapter = new AdapterForStudentAssignmentList(this,0,names);

        list.setAdapter(adapter);

    }

}
