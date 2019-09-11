package com.example.assu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSubjectsForDoctors  extends ArrayAdapter {


    Context adapterContext;
    int adapterRescources;
    ArrayList<subjectOfDoctor> list1 ;

    public AdapterSubjectsForDoctors(Context context, int resource, ArrayList objects) {
        super(context, resource, objects);
        this.adapterContext = context;
        this.adapterRescources = resource;
        this.list1 = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row;
        LayoutInflater rowInflater = LayoutInflater.from(adapterContext);
        row = rowInflater.inflate(adapterRescources ,parent,false);
        TextView nameJAVA = (TextView) row.findViewById(R.id.mainText);

        ImageView imageViewJAVA = (ImageView) row.findViewById(R.id.image1);
        subjectOfDoctor subject1 = list1.get(position);
        nameJAVA.setText(subject1.name);
        int imageId = adapterContext.getResources().getIdentifier(subject1.logoName,"drawable", adapterContext.getPackageName());
        imageViewJAVA.setImageResource(imageId);
        return row;
    }
}
