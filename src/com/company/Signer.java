package com.company;

public class Signer extends Person {

    String bandName;

    public Signer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;}

    public Signer(){
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println(name + " напевает мелодию с бандой:"+bandName);
    }

    public void playGitar() {
        System.out.println(name + " делает невероятный запил на гитаре!");
    }

    @Override
    public void learn() {
        System.out.println(name+" Читает книгу про музыку");
    }

    @Override
    public void walk() {
        System.out.println("Ходит по сцене");
    }

    @Override
    public void eat() {
        System.out.println(name+" кушает в музыкальном зале");
    }

    @Override
    public String toString() {
        return "Имя:"+name+" Роль:"+designation+" Название банды:"+bandName;
    }
}