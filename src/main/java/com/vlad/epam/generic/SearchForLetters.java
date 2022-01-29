package com.vlad.epam.generic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchForLetters {
    public static void main(String[] args) {
        String s = "queue";
        String s1 = "equ";
//        System.out.println(StringUtils.contains(s, s1));

    }

    private static boolean searchLetters(String string, String string1) {
        Pattern pattern = Pattern.compile("^\\w" + string, Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(string1);

        return matcher.find();
    }

}

