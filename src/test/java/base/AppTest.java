package base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void Test1() {
        App myApp = new App();
        String name = "Brian";

        String expectedOutput = "Hello, Brian, nice to meet you!";

        Assertions.assertEquals(myApp.GenerateGreeting(name), expectedOutput);
    }
}