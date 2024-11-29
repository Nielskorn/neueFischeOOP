package org.neuefische.Groupetaskpackages.SetListAufgebar;

import java.util.List;
import java.util.UUID;

public class Student {
    private String name;
    private String lastName;
    private final UUID studentID;
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


    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.studentID = UUID.randomUUID();
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
    public UUID getStudentID() {
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
