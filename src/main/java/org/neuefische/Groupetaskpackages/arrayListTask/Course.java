package org.neuefische.Groupetaskpackages.arrayListTask;

public class Course {
    private String name;
    private String instructor;
    int roomNr;
    Course(String name, String instructor, int roomNr) {
        this.name = name;
        this.instructor = instructor;
        this.roomNr = roomNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    @Override
    public String toString() {
        return "Course{" +
                "instructor='" + instructor + '\'' +
                ", name='" + name + '\'' +
                ", roomNr=" + roomNr +
                '}';
    }
}
