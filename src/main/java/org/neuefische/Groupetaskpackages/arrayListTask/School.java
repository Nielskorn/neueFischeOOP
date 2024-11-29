package org.neuefische.Groupetaskpackages.arrayListTask;

import java.util.List;

public class School {
    List<Student> students;

    public School(List<Student> students) {
        this.students = students;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(int id) {
        Student student =findStudent(id);
        students.remove(student);
    }
    public Student findStudent(Integer id) {
//        for (Student student : students) {
//            if(student.getStudentID() == id){
//                return student;
//            }
//        }
        Student student = students.stream().filter(student1 ->id.equals(student1.getStudentID()) ).findAny().orElse(null);
        return  student;

      //throw new IllegalArgumentException("this student does not exist");
    }
    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
    public void printCousesOfStudent(Integer id) {
        //student.getCourses().forEach(course -> System.out.println(course.toString()));
      Student student=findStudent(id);
        for(Course course :student.getCourses()){
            System.out.println(course.toString());
        }
    }
}
