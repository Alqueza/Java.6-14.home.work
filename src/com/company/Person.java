package com.company;

public class Person {

    String name;
    String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn() {
        System.out.println(name + " читает книгу");
    }

    public void walk() {
        System.out.println(name + " гуляет на улице");
    }

    public void eat() {
        System.out.println(name + " кушает блюдо");
    }

    @Override
    public String toString() {
        return "Имя:"+name+" Роль:"+designation;
    }
}