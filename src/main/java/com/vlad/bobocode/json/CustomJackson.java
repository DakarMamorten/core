package com.vlad.bobocode.json;

import lombok.Data;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomJackson {
    public static void main(String[] args) {
        var json = "{\n" +
                "  \"firstName\": \"Andrii\",\n" +
                "  \"lastName\": \"Shtramak\",\n" +
                "  \"email\": \"shtramak@gmail.com\"\n" +
                "}";
        var user = jsonToObj(json, User.class);
        System.out.println(user);

    }

    @SneakyThrows
    private static <T> T jsonToObj(String json, Class<T> clazz) {
        Pattern pattern = Pattern.compile("\"(.+)\"");
        Matcher matcher = pattern.matcher(json);
        String[] split = new String[10];
        while (matcher.find()) {
            split = matcher.group().replace("\"", "").split(": + s");
        }
        System.out.println(split.length);
        T t = clazz.getConstructor().newInstance();
        Field[] declaredFields = clazz.getDeclaredFields();
        System.out.println(declaredFields.length);
        int i = 1;
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            declaredField.set(t, split[i]);
            i += 2;
        }
        return t;


//        System.out.println(json);
//        return null;
    }

    @Data
    static class User {
        private String firstName;
        private String lastName;
        private String email;
    }
}
