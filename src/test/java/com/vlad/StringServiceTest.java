package com.vlad;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringServiceTest {

    @Test
    void whenStringEndsWithPostfix_returnTrue(){
        StringService stringService = new StringService();
        assertTrue(stringService.isStringEndWithPosfix("Test","st"));
    }

    @Test
    @DisplayName("String doesn't ends with postfix")
    void whenStringDoesntEndsWithPostfix_returnFalse(){
        StringService stringService = new StringService();
        assertFalse(stringService.isStringEndWithPosfix("Test","rt"));
    }
}
