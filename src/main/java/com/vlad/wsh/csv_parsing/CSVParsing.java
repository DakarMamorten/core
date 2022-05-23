package com.vlad.wsh.csv_parsing;

import com.assignments.Person;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;

public class CSVParsing {
    @SneakyThrows
    public static void main(String[] args) {
//        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build();
//        try (CSVReader reader = new CSVReaderBuilder(
//                new FileReader("d:\\Person.csv"))
//                .withCSVParser(csvParser)
//                .withSkipLines(1)
//                .build()) {
//            List<String[]> r = reader.readAll();
//            r.stream()
//                    .map(CSVParsing::mapToPerson)
//                    .forEach(System.out::println);
//        }

        Files.lines(Path.of("d:\\Person.csv"))
                .map(x -> x.split(";"))
                .map(CSVParsing::mapToPerson)
                .forEach(System.out::println);
    }

    private static Person mapToPerson(String[] values) {
        return new Person(values[0], values[1], values[2]);
    }
}