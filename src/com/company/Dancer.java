package com.company;

public class Dancer extends Person {

    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(){
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(name + " красиво танцует");
        System.out.println("Название группы:" + groupName);
    }

    @Override
    public void learn() {
        System.out.println(name+" изучает новый движения");
    }

    @Override
    public void walk() {
        System.out.println(name+" вышел на пробежку");
    }

    @Override
    public void eat() {
        System.out.println(name+" зашел в ресторан поесть");
    }

    @Override
    public String toString() {
        return "Имя:"+name+" Название группы:"+groupName+" Роль:"+designation;
    }
}