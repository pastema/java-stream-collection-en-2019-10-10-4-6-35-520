package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream()
                .filter(number -> number % 3 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> getCommonBoolean = new ArrayList<Integer>();
        firstList.forEach(number -> {
            if (secondList.indexOf(number) > -1) {
                getCommonBoolean.add(number);
            }
        });
        return getCommonBoolean;
    }

//    public List<Integer> getDifferentElements() {
//        List<Integer> naaaa = new ArrayList<>();
//        return array.stream()
//                .filter(n -> !naaaa.add(n))
//                .collect(Collectors.toList());
//    }
}