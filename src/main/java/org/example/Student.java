package org.example;

public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "hno='" + hno + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String hno, String name) {
        this.hno = hno;
        this.name = name;
    }


    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String hno;
    private String name;



}
