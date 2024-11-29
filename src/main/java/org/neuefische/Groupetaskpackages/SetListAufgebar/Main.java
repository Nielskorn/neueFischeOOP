package org.neuefische.Groupetaskpackages.SetListAufgebar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UUID uniqueKey = UUID.randomUUID();
        System.out.println (uniqueKey);
        List<Student>myStudents = new ArrayList<>();
        Student s1;
        s1 = new Student("Johana", "Doe");
        myStudents.add(s1);
        Student s2 = new Student("Jona", "Doe");
        myStudents.add(s2);
        Student s3 = new Student("Jhin", "Done");
        myStudents.add(s3);
        Map<UUID,Student>myStudentMap = new HashMap<UUID,Student>();
        for (Student student : myStudents) {
            myStudentMap.put(student.getStudentID(), student);
        }
        School school =new School(myStudentMap);
        Student s4 = new Student("Johnson", "Dose");
        myStudents.add(s4);
        System.out.println( school.findStudent(s3.getStudentID()));
        school.addStudent(new Student("Johnson", "Doe"));
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
        school.printCoursesOfStudent(s3.getStudentID());
        System.out.println("#######################");
        System.out.println( school.findStudent(s3.getStudentID()));






    }
}
