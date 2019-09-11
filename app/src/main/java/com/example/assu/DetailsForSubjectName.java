package com.example.assu;

import java.util.ArrayList;

public class DetailsForSubjectName {
    String Id_Doctor;
    String Id_lecture;
    int CounterOfStudent;
    ArrayList<String> StudentsWhoAttendInLecture;

    public DetailsForSubjectName(){}
    public DetailsForSubjectName(String id_Doctor, String id_lecture, int counterOfStudent, ArrayList<String> studentsWhoAttendInLecture) {
        Id_Doctor = id_Doctor;
        Id_lecture = id_lecture;
        CounterOfStudent = counterOfStudent;
        StudentsWhoAttendInLecture = studentsWhoAttendInLecture;
    }

    public void setId_Doctor(String id_Doctor) {
        Id_Doctor = id_Doctor;
    }

    public void setId_lecture(String id_lecture) {
        Id_lecture = id_lecture;
    }

    public void setCounterOfStudent(int counterOfStudent) {
        CounterOfStudent = counterOfStudent;
    }

    public void setStudentsWhoAttendInLecture(ArrayList<String> studentsWhoAttendInLecture) {
        StudentsWhoAttendInLecture = studentsWhoAttendInLecture;
    }

    public String getId_Doctor() {
        return Id_Doctor;
    }

    public String getId_lecture() {
        return Id_lecture;
    }

    public int getCounterOfStudent() {
        return CounterOfStudent;
    }

    public ArrayList<String> getStudentsWhoAttendInLecture() {
        return StudentsWhoAttendInLecture;
    }
}
