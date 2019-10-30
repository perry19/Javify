package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int rand_int = random.nextInt(1000);

        User user = new User(1, "Armel", "Perry", 21, "Male");
        System.out.println("Welcome " +user.getFirst_name() + " " +user.getLast_name());
        System.out.println("We know you're a " + user.getAge() +" years old " + user.getGender());
        System.out.println("Below is your ID " +rand_int);
    }
}
