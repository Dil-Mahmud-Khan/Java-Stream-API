package com.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    @Test
    void  streams(){
        List<String> names= List.of("Dil","Mahmud","Khan");
        List<String> stream = names.stream().collect(Collectors.toList());
        System.out.println(stream);
    }

    @Test
    void stream1(){
        List<Integer> numbers=List.of(12,34,2,1,23,12,43);
        List<Integer> newNumber=numbers.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(newNumber);
    }

    @Test
    void stream2(){
        List<String>namees=List.of("Dil","Dada","KHan");
        List<String> newNames=namees.stream().filter(e->e.startsWith("D")).collect(Collectors.toList());
        System.out.println(newNames);
    }


}
