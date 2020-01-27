package com.rakovets.course.challenge;

import java.util.stream.Stream;

public class ApiTask1 {
    public static void main(String[] args) {
        String[] arguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Stream<String> argumentsStream = Stream.of(arguments);
       // argumentsStream.map()
    }
}
