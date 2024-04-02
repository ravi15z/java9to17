package com.feautures.java9to17.java9.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiF {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 1, 2, 20, 25, 4, 6);
        System.out.println("Simple Filter:" + list.stream().filter(n -> n % 5 == 0).collect(Collectors.toList()));
        System.out.println("TakeWhile:" + list.stream().takeWhile(n -> n % 5 == 0).collect(Collectors.toList()));
        System.out.println("DropWhile:" + list.stream().dropWhile(n -> n % 5 == 0).collect(Collectors.toList()));

        List<Integer> listq = Arrays.asList(5, 10, 15, 1, null, 2, 20, 25, 4, 6);
        System.out.println(listq.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));

    }
}
