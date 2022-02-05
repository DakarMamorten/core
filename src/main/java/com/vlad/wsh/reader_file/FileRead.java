package com.vlad.wsh.reader_file;

import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class FileRead {
    @SneakyThrows
    public static void main(String[] args) {

        List<String> strings = getStringsFromFile("d://NAPIS.txt");

        //1 variant
        List<String> temp = new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        for (String string : strings) {
            if (temp.contains(string)) {
                res.add(string);
            } else {
                temp.add(string);
            }
        }
        System.out.println(res);

        //2 variant

        HashMap<String, Long> resultMap = strings
                .stream()
                .collect(groupingBy(Function.identity(), HashMap::new, Collectors.counting()));

        for (Map.Entry<String, Long> stringLongEntry : resultMap.entrySet()) {
            if (stringLongEntry.getValue() > 1) {
                System.out.println(stringLongEntry.getKey());
            }
        }

    }

    private static List<String> getStringsFromFile(String path) throws IOException {
        return Files
                .readAllLines(Path.of(path));
    }
}
