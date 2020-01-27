package com.rakovets.course.challenge.api;

import java.util.Objects;

public class Student {
    private String name;
    private Speciality speciality;
    private int course;

    public Student(String name, Speciality speciality, int course) {
        this.name = name;
        this.speciality = speciality;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", speciality=" + speciality +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                speciality == student.speciality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speciality, course);
    }
}