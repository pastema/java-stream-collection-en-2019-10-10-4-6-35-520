package com.thoughtworks.collection;

import org.apache.commons.collections.ArrayStack;
import org.apache.commons.collections.bag.HashBag;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        List<Integer> numbers = new ArrayList<>();
        if (leftBorder < rightBorder) {
            for (int x = leftBorder; x <= rightBorder; x++) {
                numbers.add(x);
            }
        } else {
            for (int x = leftBorder; x >= rightBorder; x--) {
                numbers.add(x);
            }
        }

        return numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        List<Integer> numbers = new ArrayList<>();
        if (leftBorder < rightBorder) {
            for (int x = leftBorder; x <= rightBorder; x++) {
                numbers.add(x);
            }
        } else {
            for (int x = leftBorder; x >= rightBorder; x--) {
                numbers.add(x);
            }
        }
        return numbers.stream().filter(n -> n % 2 != 0).mapToInt(n -> n).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(value -> value * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream()
                .map(value -> value % 2 != 0 ? value * 3 + 2 : value)
                .collect(Collectors.toList());

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(value -> value * 3 + 5)
                .sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        return  arrayList.stream()
                .filter(value -> value % 2 == 0)
                .mapToDouble(number -> number).sum() /
                arrayList.stream()
                .filter(value -> value % 2 == 0).mapToDouble(number -> number).count();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return  arrayList.stream()
                .filter(value -> value % 2 != 0)
                .mapToDouble(number -> number).sum() /
                arrayList.stream()
                        .filter(value -> value % 2 != 0).mapToDouble(number -> number).count();
    }

//    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
//        System.out.println(arrayList.stream()
//                .map(number ->{
//                    Integer getevenOrAdd = number % 2;
//                    if(getevenOrAdd == 0 ){
//                        return true;
//                    }
//                    else{
//                        return false;
//                    }
//                }));
//
//        return arrayList.stream()
//                .filter(number -> number % 2 != 0).equals(Stream.empty());
//        return arrayList.stream()
//                .filter(number -> number % 2 != 0);
//                .filter(number1 -> specialElment.toString().contains(number1.toString()))
                //.map(number -> number.compareTo(specialElment) == true);
//    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return  arrayList.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> evenList = arrayList.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddList = arrayList.stream()
                .filter(value -> value % 2 != 0)
                .collect(toList());
               // .sort(Collections.reverseOrder());

        oddList.sort(Collections.reverseOrder());

        LinkedList combineList = new LinkedList();
        combineList.addAll(evenList);
        combineList.addAll(oddList);

        return combineList;



    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        ListIterator listIterator = arrayList.listIterator();
//        return arrayList.stream()
//                .map(value -> value + 3 + value)
//                .collect(Collectors.toList());
//    }
}
