package com.example.assu;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartFragmentForDoctorSubject extends Fragment {
    Button btn_Attendance;
    Button btn_Assignments;


    public StartFragmentForDoctorSubject() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_start_fragment_for_doctor_subject, container, false);

        btn_Attendance = view.findViewById(R.id.button1);
        btn_Assignments = view.findViewById(R.id.button2);
        //***********************************************************

        btn_Attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), StartAttendanceForDoctors.class);
                startActivity(intent);
            }
        });

        //*********************************************************
        btn_Assignments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getContext(), StartAssignmentsForDoctors.class);
                startActivity(intent);
            }
        });
        //*********************************************************
        return view;

    }



}
