package com.example.assu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterAssignmentsTest extends ArrayAdapter {

    ArrayList<ModelOfAssignmentsTest> datalistassignmentstest = new ArrayList<ModelOfAssignmentsTest>();

    public AdapterAssignmentsTest( Context context, int resource,  ArrayList<ModelOfAssignmentsTest> mydatalistassignmentstest) {
        super(context, resource, mydatalistassignmentstest);

        datalistassignmentstest = mydatalistassignmentstest;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflatobj = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflatobj.inflate(R.layout.row_of_assignments_test,parent,false);

        TextView txtques = convertView.findViewById(R.id.txt_test);
        RadioButton radioButton= convertView.findViewById(R.id.radio_test);
        txtques.setText(datalistassignmentstest.get(position).getQues());




        return convertView;

    }
}
