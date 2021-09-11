package Streams.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        // Criar Stream apartir da lista
        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8);

        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<Integer> st2 = list.stream().map(element -> element * 10);
        System.out.println(Arrays.toString(st2.toArray()));

        // Cria Stream of ...
        Stream<String> st3 = Stream.of("Maria", "Alex", "Anne");
        System.out.println(Arrays.toString(st3.toArray()));

        // Criar uma Stream com complemento automático
        Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st4.limit(100).toArray()));

        // Fibonacci
        Stream<Long> st5 = Stream
                .iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(st5.limit(20).toArray()));


    }
}
