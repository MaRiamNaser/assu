package com.example.assu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListViewLecturesForDoctors extends ArrayAdapter {

    ArrayList<Modelforattendence> list;

    public AdapterListViewLecturesForDoctors(Context context, int resource, ArrayList objects) {
        super(context, resource, objects);

        list = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = layoutInflater.inflate(R.layout.row_lectures_listview_for_doctors, parent,false);

        TextView textname = convertView.findViewById(R.id.thenameofstudent);
        TextView textid = convertView.findViewById(R.id.theidofstudent);
        TextView textlevel = convertView.findViewById(R.id.thelevelofstudent);

        textname.setText(list.get(position).getNmae());
        textid.setText(list.get(position).getId());
        textlevel.setText(list.get(position).getLevel());

        return convertView;
    }
}
