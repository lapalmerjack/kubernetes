package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {


        UUID myString = UUID.randomUUID();

        while(true) {

            System.out.println(LocalDateTime.now() + ": " + myString );

            try {

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}