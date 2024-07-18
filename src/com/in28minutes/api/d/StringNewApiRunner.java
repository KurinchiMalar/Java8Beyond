package com.in28minutes.api.d;

public class StringNewApiRunner {
    public static void main(String[] args) {
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println(" L R ".strip().replace(" ","@"));
        System.out.println(" L R ".stripLeading().replace(" ","@"));
        System.out.println(" L R ".stripTrailing().replace(" ","@"));

        // If you have a string and you want to break it into a stream of multiple lines then you can
        // use the .lines() method.

        "Line1\nLine2\nLine3\nLine4\nLine5".lines().forEach(System.out::println);

        // Java 12
        System.out.println((String) "UPPER".transform(s->s.substring(2)));

        //Java 15
        System.out.println("I am %s, My age is %d ".formatted("Kurinchi",32));
    }
}
