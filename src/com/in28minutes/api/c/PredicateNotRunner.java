package com.in28minutes.api.c;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotRunner {

    static Predicate<Integer> evenPredicate = (x -> x%2 == 0);

    public static boolean isEven(Integer num){
        return num % 2 == 0 ;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,4,5,67,89,88);
        for(int num:numbers){
            System.out.println(num +" - "+ evenPredicate.test(num));
        }
        System.out.println("________________________________________________");

        //List<Integer> evennumbers = numbers.stream().filter(p).collect(Collectors.toList());
        //System.out.println(evennumbers);
        System.out.println("even predicate - Using Predicate");
        numbers.stream().filter(evenPredicate).forEach(System.out::println);

        System.out.println("Predicate.negate()");
        numbers.stream().filter(evenPredicate.negate()).forEach(System.out::println);

        System.out.println("________________________________________________");

        System.out.println("even  - Using Method Reference");
        numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);

        // Here we do not have a negate option. Therefore Predicate.not is introduced.
        System.out.println("Predicate.not()");
        numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven))
                .forEach(System.out::println);
    }
}
