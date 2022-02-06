package com.vlad.epam;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String address;
    private long telNumber;
    private String fak;
    private int curs;
    private String group;

    public Student() {
    }

    public Student(int id, String surname, String name, String fak, int curs, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fak = fak;
        this.curs = curs;
        this.group = group;
    }

    public Student(String surname, String name, String birthday, String address, long telNumber) {
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.telNumber = telNumber;
    }

    public Student(int id, String surname, String name, String patronymic, String birthday, String address, long telNumber, String fak, int curs, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.telNumber = telNumber;
        this.fak = fak;
        this.curs = curs;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(long telNumber) {
        this.telNumber = telNumber;
    }

    public String getFak() {
        return fak;
    }

    public void setFak(String fak) {
        this.fak = fak;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && telNumber == student.telNumber && curs == student.curs &&
                Objects.equals(surname, student.surname) && Objects.equals(name, student.name) &&
                Objects.equals(patronymic, student.patronymic) && Objects.equals(birthday, student.birthday)
                && Objects.equals(address, student.address) && Objects.equals(fak, student.fak) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, birthday, address, telNumber, fak, curs, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", telNumber=" + telNumber +
                ", fak='" + fak + '\'' +
                ", curs='" + curs + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
