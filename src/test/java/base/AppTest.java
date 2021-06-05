/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void output_string_uses_string_name_in_concatenation() {
        App myApp = new App();
        String name = "Brian";

        String expectedOutput = "Hello, Brian, nice to meet you!";

        Assertions.assertEquals(myApp.GenerateGreeting(name), expectedOutput);
    }
}