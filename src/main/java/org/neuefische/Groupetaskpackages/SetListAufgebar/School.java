package org.neuefische.Groupetaskpackages.SetListAufgebar;

import java.util.Map;
import java.util.UUID;

public class School {
    Map<UUID,Student> students;

    public School(Map<UUID,Student> students) {
        this.students = students;
    }
    public Map<UUID,Student> getStudents() {
        return students;

    }
    public void setStudents(Map<UUID,Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        students.put(student.getStudentID(),student);
    }
    public void removeStudent(UUID id) {
        Student student =findStudent(id);
        students.remove(student);
    }
    public Student findStudent(UUID id) {
//        for (Student student : students) {
//            if(student.getStudentID() == id){
//                return student;
//            }
//        }
       // return   students.stream().filter(student1 ->id.equals(student1.getStudentID()) ).findAny().orElse(null);

      //throw new IllegalArgumentException("this student does not exist");
        return students.get(id);
    }
    public void printStudents() {
        students.forEach((k,v)->{
            System.out.println(v);
        });
    }
    public void printCoursesOfStudent(UUID id) {
        //student.getCourses().forEach(course -> System.out.println(course.toString()));
      Student student=findStudent(id);
        for(Course course :student.getCourses()){
            System.out.println(course.toString());
        }
    }
}
