package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class AppTest {

    // Test with real palindrome words
    @Test
    void palindrome_word() {
        assertTrue(App.palindrome_validator("arara"));
    }

    // Test with not real palindrome words
    @Test
    void not_palindrome_word() {
        assertFalse(App.palindrome_validator("Gustavo"));
    }
}
