package com.example.assu;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AssignmentsFragmentForDoctorSubject extends Fragment {


    public AssignmentsFragmentForDoctorSubject() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_assignments_fragment_for_doctor_subject, container, false);
        ListView customListViewJAVA = view.findViewById(R.id.listView1);

        subjectOfDoctor subject1 = new subjectOfDoctor("Assignment 1","mariam3");
        subjectOfDoctor subject2 = new subjectOfDoctor("Assignment 2", "maiam1");
        subjectOfDoctor subject3 = new subjectOfDoctor("Assignment 3", "mariam2");
        subjectOfDoctor subject4 = new subjectOfDoctor("Assignment 4", "mariam3");
        subjectOfDoctor subject5 = new subjectOfDoctor("Assignment 5", "mariam2");
        subjectOfDoctor subject6 = new subjectOfDoctor("Assignment 6", "maiam1");

        ArrayList<subjectOfDoctor> listOfStudent = new ArrayList<>();

        listOfStudent.add(subject1);
        listOfStudent.add(subject2);
        listOfStudent.add(subject3);
        listOfStudent.add(subject4);
        listOfStudent.add(subject5);
        listOfStudent.add(subject6);


        int xmlFile = R.layout.row_subjects_doctors;
        AdapterSubjectsForDoctors adapter = new AdapterSubjectsForDoctors(getContext(), xmlFile, listOfStudent);
        customListViewJAVA.setAdapter(adapter);

        // when you click on item in list view
        customListViewJAVA.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent newActivity = new Intent(getContext(), ListViewForAllStudentsWhoOpenedTheAssignment.class);
                startActivity(newActivity);
            }
        });
        //**************************************************************
        return  view;
    }
}