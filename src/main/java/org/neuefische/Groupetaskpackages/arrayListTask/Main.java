package org.neuefische.Groupetaskpackages.arrayListTask;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID uniqueKey = UUID.randomUUID();
        System.out.println (uniqueKey);
        List<Student>myStudents = new ArrayList<>();
        Student s1 = new Student("Johana", "Doe", 1998);
        myStudents.add(s1);
        Student s2 = new Student("Jona", "Doe", 1995);
        myStudents.add(s2);
        Student s3 = new Student("Jhin", "Done", 1994);
        myStudents.add(s3);
        School school =new School(myStudents);
        Student s4 = new Student("Johnson", "Dose", 1999);
        myStudents.add(s4);
        System.out.println( school.findStudent(1999).getName());
        school.addStudent(new Student("Johnson", "Doe", 1999));
        school.printStudents();
        System.out.println("#######################");
        school.removeStudent(s1.getStudentID());
        school.printStudents();
        System.out.println("#######################");
        //school.findStudent(2000);
        Course course =new Course("math","Maier",1);
        Course course2 =new Course("English","Jon",2);
        ArrayList<Course> courses=new ArrayList<>();
        courses.add(course);
        courses.add(course2);
        s3.setCourses(courses);
        school.printCoursesOfStudent(1994);
        System.out.println("#######################");
        System.out.println( school.findStudent(1994));

        Sack sack=new Sack();
        sack.add(1);
        sack.add(2);
        sack.add(3);
        System.out.println(sack.size());
        System.out.println(sack.get(1));
        sack.remove(1);
        System.out.println(sack.size());
        sack.set(0,5);
        System.out.println(sack.get(0));




    }
}
