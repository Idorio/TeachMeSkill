package com.example.lib.Lesson12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson12 {
    public static void main(String[] args) {

        Stream<String> streamGenerated = Stream.generate(() -> "Hello").limit(10);
        System.out.println(streamGenerated.collect(Collectors.toList()));

        IntStream prinitiveStream = IntStream.range(1,10);
        System.out.print(Arrays.toString(prinitiveStream.toArray()));

        Stream streamFilter = Stream.of("apple","banana","kiwi").filter(
                element -> element.contains("b")
        );
        Stream streamFilter2 = Stream.of("apple","banana","kiwi","apple").skip(2);
        System.out.println();
        System.out.println(streamFilter2.collect(Collectors.toList()));
        System.out.println();
        System.out.println(streamFilter.findFirst());

        Stream<String> streamMap = Stream.of("apple","banana","kiwi","apple");
        String mappedString = streamMap.map(Object::toString).collect(
                Collectors.joining(",")
        );
        System.out.println(mappedString);

        Stream<String> streamMap2 = Stream.of("apple","banana","kiwi","apple");
        String mappedString2 = streamMap2.map(element -> element +" mapped" ).collect(
                Collectors.joining("|")
        );

        System.out.println(mappedString2);

        Stream<String> streamMap3 = Stream.of("apple","banana","kiwi","apple");
        String mappedString3 = streamMap3.map(String::toUpperCase).collect(
                Collectors.joining(",")
        );
        System.out.println(mappedString3);

    }
}
