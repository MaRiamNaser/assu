package com.example.assu;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterSubjectsOfStudents extends ArrayAdapter{


    ArrayList<ModelOfSubjects> dataList = new ArrayList<ModelOfSubjects>();

    public AdapterSubjectsOfStudents(Context context, int resource, ArrayList<ModelOfSubjects> mydata)
    {
        super(context, resource, mydata);

        dataList = mydata;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent)
    {
        LayoutInflater inflatobj = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflatobj.inflate(R.layout.row_of_subjects_of_students,parent,false);

        TextView txtname= convertView.findViewById(R.id.txtname);
        txtname.setText(dataList.get(position).getName());

        return convertView;

    }
}
