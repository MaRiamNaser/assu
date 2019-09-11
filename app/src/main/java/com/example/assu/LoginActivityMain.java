package com.example.assu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivityMain extends AppCompatActivity {
    Button btnloginMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

       final EditText textuser = (EditText) findViewById(R.id.txtuser);
         btnloginMain = (Button) findViewById(R.id.btnlogin);




        btnloginMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = textuser.getText().toString();
                if(name.equals("1001") || name.equals("1002")||name.equals("1003") ||name.equals("1004") ||name.equals("1005") ||name.equals("1006") ||name.equals("1007") ||name.equals("1008") ||name.equals("1009") ||name.equals("1010") )
                {
                    Intent toSubjectOfStudent = new Intent(LoginActivityMain.this, ListOfStudents.class);
                    Intent newActivity2 = new Intent(LoginActivityMain.this, StartAttendanceForDoctors.class);
                    newActivity2.putExtra("Id_doctor", name);

                    startActivity(toSubjectOfStudent);

                }
                else if(name.equals("1011") || name.equals("1012")||name.equals("1013") ||name.equals("1014") ||name.equals("1015") ||name.equals("1016") ||name.equals("1017") ||name.equals("1018") ||name.equals("1019") ||name.equals("1020") )
                {

                    Intent toSubjectOfStudent = new Intent(LoginActivityMain.this, MainActivity.class);
                    Intent newActivity2 = new Intent(LoginActivityMain.this, StartAttendanceForDoctors.class);
                    newActivity2.putExtra("Id_doctor", name);
                    startActivity(toSubjectOfStudent);

                }


            }

        });
    }
}
