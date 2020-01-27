package com.rakovets.course.challenge.javaio;

import java.io.FileReader;
import java.io.IOException;

public class Ticket1 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("textforticket1.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}