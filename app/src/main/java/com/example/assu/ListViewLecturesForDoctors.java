package com.example.assu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewLecturesForDoctors extends AppCompatActivity {
    ListView listView;
    Button delet;
    String[] names = {"Ahmed", "Ali", "Zain", "Ziad"};
    String[] ids = {"1", "2", "3", "4"};
    String[] levels = {"4", "3", "2", "1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_lectures_for_doctors);

        delet=findViewById(R.id.buttontodelet);


        ArrayList<Modelforattendence> list = new ArrayList<>();
        listView = findViewById(R.id.listviewstudentshasbeenattended);
        for (int i = 0; i < ids.length; i++) {
            list.add(new Modelforattendence(names[i], ids[i], levels[i]));
            AdapterListViewLecturesForDoctors adapterlis = new
                    AdapterListViewLecturesForDoctors(ListViewLecturesForDoctors.this , 0, list);
            listView.setAdapter(adapterlis);

        }

    }
}
