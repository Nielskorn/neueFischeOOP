package org.neuefische.Groupetaskpackages.arrayListTask;

import java.util.List;

public class Student {
    private String name;
    private String lastName;
    private final int studentID;
    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses( List<Course>courses) {
        this.courses = courses;
    }
    public void addCourse(Course course) {
        this.courses.add(course);
    }


    public Student(String name, String lastName, int studentID) {
        this.name = name;
        this.lastName = lastName;
        this.studentID = studentID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
