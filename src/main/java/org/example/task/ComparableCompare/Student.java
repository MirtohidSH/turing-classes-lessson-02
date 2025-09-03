package org.example.task.ComparableCompare;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private static long count = 0;

    private String name;
    private int age;
    private double gpa;
    private String department;
    private long id = 0;
    private String teacher;
    private int classNumber;
    private int lessonsNumber;


    public Student(String name, int age, double gpa, String department, String teacher, int classNumber, int lessonsNumber) {
        this.id = ++count;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.department = department;
        this.teacher = teacher;
        this.classNumber = classNumber;
        this.lessonsNumber = lessonsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Student.count = count;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getLessonsNumber() {
        return lessonsNumber;
    }

    public void setLessonsNumber(int lessonsNumber) {
        this.lessonsNumber = lessonsNumber;
    }

    @Override
    public int compareTo(Student o) {
        int result = Long.compare(this.id, o.id);
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(gpa, student.gpa) == 0 && id == student.id && classNumber == student.classNumber && lessonsNumber == student.lessonsNumber && Objects.equals(name, student.name) && Objects.equals(department, student.department) && Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gpa, department, id, teacher, classNumber, lessonsNumber);
    }

    @Override
    public String toString() {
        return String.format("Student {Name=%s, Age=%d, GPA=%f, Department=%s, ID=%d, Teacher=%s, ClassNumber=%d, LessonsNumber=%d}", name, age, gpa, department, id, teacher, classNumber, lessonsNumber);
    }
}
