package com.rakovets.course.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamApiDemo {
    public static void main(String[] args) {
        long count = IntStream.of(6, 7, 8, 9, 10, 0, 1, 2, 3, 4, 5)
                .filter(w -> w % 2 == 1)
                .count();
        System.out.println(count);
    }
}