package com.rakovets.course.challenge;

import java.util.HashMap;
import java.util.Map;

public class PersonDemo {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1,new Person(258,"Bob","Bobov"));
        map.put(2,new Person(589,"Pob","Pobov"));
        map.put(3,new Person(986,"Rob","Robov"));
        map.put(4,new Person(657,"John","Johnov"));
        map.put(5,new Person(159,"Sara","Connor"));
        map.put(6,new Person(586,"Gorge","Ivanov"));
        map.put(7,new Person(634,"Mike","Tyson"));
        map.put(8,new Person(987,"Tod","Tobov"));
        map.put(9,new Person(158,"Bobby","Bobovov"));
        map.put(10,new Person(682,"Lom","Lomov"));

        for (Map.Entry<Integer, Person> maps : map.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", maps.getKey(), maps.getValue());
        }


    }
}