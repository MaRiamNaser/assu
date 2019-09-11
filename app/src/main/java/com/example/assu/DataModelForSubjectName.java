package com.example.assu;

public class DataModelForSubjectName {
    String id_lecture;
    String id_doctor;
    String counter_of_student;
    String student_of_lectures;

    public DataModelForSubjectName(String id_lecture, String id_doctor, String counter_of_student, String student_of_lectures) {
        this.id_lecture = id_lecture;
        this.id_doctor = id_doctor;
        this.counter_of_student = counter_of_student;
        this.student_of_lectures = student_of_lectures;
    }

    public DataModelForSubjectName(){}

    public void setId_lecture(String id_lecture) {
        this.id_lecture = id_lecture;
    }

    public void setId_doctor(String id_doctor) {
        this.id_doctor = id_doctor;
    }

    public void setCounter_of_student(String counter_of_student) {
        this.counter_of_student = counter_of_student;
    }

    public void setStudent_of_lectures(String student_of_lectures) {
        this.student_of_lectures = student_of_lectures;
    }

    public String getId_lecture() {
        return id_lecture;
    }

    public String getId_doctor() {
        return id_doctor;
    }

    public String getCounter_of_student() {
        return counter_of_student;
    }

    public String getStudent_of_lectures() {
        return student_of_lectures;
    }
}
