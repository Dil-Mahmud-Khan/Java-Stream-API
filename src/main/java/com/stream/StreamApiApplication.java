package com.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamApiApplication {

    public static void main(String[] args) {


       // SpringApplication.run(StreamApiApplication.class, args);

            List<String> names= List.of("Dil","Mahmud","Khan");
            List<String> stream = names.stream().collect(Collectors.toList());
            System.out.println(stream);
        }

}
