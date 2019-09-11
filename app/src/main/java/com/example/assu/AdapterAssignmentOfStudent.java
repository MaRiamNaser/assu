package com.example.assu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterAssignmentOfStudent extends ArrayAdapter {

    ArrayList<ModelOfAssignmentList> dataListassignment = new ArrayList<ModelOfAssignmentList>();

    public AdapterAssignmentOfStudent( Context context, int resource,  ArrayList<ModelOfAssignmentList> mydatalistassignment) {
        super(context, resource, mydatalistassignment);
        dataListassignment = mydatalistassignment;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflatobj = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflatobj.inflate(R.layout.row_of_assignments,parent,false);

        TextView txtname= convertView.findViewById(R.id.txt_assignment_name);
        txtname.setText(dataListassignment.get(position).getAssignment());

        return convertView;

    }
}
