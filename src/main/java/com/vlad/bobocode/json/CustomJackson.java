package com.vlad.bobocode.json;

import lombok.Data;

public class CustomJackson {
    public static void main(String[] args) {
        var json = "{\n" +
                "  \"firstName\": \"Andrii\",\n" +
                "  \"lastName\": \"Shtramak\",\n" +
                "  \"email\": \"shtramak@gmail.com\"\n" +
                "}";
        var user = jsonToObj(json,User.class);

    }

    private static <T> T jsonToObj(String json, Class<T> userClass) {
        return null;
    }

    @Data
    static class User{
        private String firstname;
        private String secondName;
        private String email;
    }
}
