package com.company;

public class Main {
    public static void main(String[] args) {
        Person adilet = new Person("Adilet", "Student");
        System.out.println(adilet);
        adilet.eat();
        adilet.walk();
        adilet.learn();
        System.out.println();

        Programmer programmer = new Programmer("Azamat", "Programmer", "QSU");
        System.out.println(programmer);
        programmer.coding();
        programmer.eat();
        programmer.walk();
        programmer.learn();
        System.out.println();

        Dancer dancer = new Dancer("Aleks", "Dancer", "Weekend");
        System.out.println(dancer);
        dancer.dancing();
        dancer.eat();
        dancer.walk();
        dancer.learn();
        System.out.println();

        Signer signer = new Signer("Sypin", "Signer", "Monoir");
        System.out.println(signer);
        signer.singing();
        signer.playGitar();
        signer.learn();
    }
}