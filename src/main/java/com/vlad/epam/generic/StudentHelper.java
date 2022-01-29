package com.vlad.epam.generic;


import com.vlad.epam.Student;

public class StudentHelper {
    public void searchOfGroup(Student[] array, String group){
        for (Student student : array) {
            if (!student.getGroup().equals(group)) {
                continue;
            }
            System.out.println(student);
        }
    }

    public void searchOfFak(Student [] array, String fak){
        for (Student student : array) {
            if (!student.getFak().equals(fak)) {
                continue;
            }
            System.out.println(student);
        }
    }
}
