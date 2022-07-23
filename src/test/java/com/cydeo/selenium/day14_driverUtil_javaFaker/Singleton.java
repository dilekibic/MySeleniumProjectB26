package com.cydeo.selenium.day14_driverUtil_javaFaker;

public class Singleton {

    private Singleton(){}  //Constructor, I don't want to get reach from outside

    private static String word;

    public static String getWord(){

        if(word == null){
            System.out.println("First time calling. Word object is null.");
            word="something";
        }else{
            System.out.println("Word is already assigned and has a value");
        }
        return word;

    }
}

