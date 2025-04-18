// Student.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private int age;
    private String gender;
    private String course;
    private String dob;
    private String address;
    private String contact;

    // Constructor
    public Student(int studentId, String name, int age, String gender, String course, String dob, String address, String contact) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.dob = dob;
        this.address = address;
        this.contact = contact;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return String.format("%d\t%s\t%d\t%s\t%s\t%s\t%s\t%s",
                             studentId, name, age, gender, course, dob, address, contact);
    }
}
