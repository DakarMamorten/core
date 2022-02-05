package com.vlad.wsh.reader_file;

import lombok.SneakyThrows;

public class AsciiMain {
    @SneakyThrows
    public static void main(String[] args) {
        AsciiCods asciiCods = new AsciiCods();
        asciiCods.filter();
    }
}
