package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Quiz {

    public static void main(String[] args) {
        TrueOrFalse question1 = new TrueOrFalse("Snakes and Ladders was originally created in India.", "True", new String[] {"True", "False"});
        System.out.println(question1.printQuestion());

    }



}