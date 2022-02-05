package com.vlad.wsh.reader_file;

import lombok.SneakyThrows;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * skróciłem kod
 **/
public class AsciiCods {

    @SneakyThrows
    public void filter() {
        URL url = this.getClass().getClassLoader().getResource("data.txt");

        List<String> strings = null;
        if (url != null) {
            strings = Files.readAllLines(Path.of(url.toURI()));
        }
        if (strings != null) {
            strings
                    .stream()
                    .distinct()
                    .filter(this::isIncreaseString)
                    .forEachOrdered(System.out::println);
        }
    }

    private boolean isIncreaseString(String string) {
        char[] chars = string.toCharArray();
        boolean flag = false;

        for (int i = 0; i < string.length() - 1; i++) {
            flag = chars[i] <= chars[i + 1];
            if (!flag) {
                break;
            }
        }
        return flag;
    }

}
