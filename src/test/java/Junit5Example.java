import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Junit5Example {
    @BeforeAll
    static void beforeAll(){
        System.out.println("### @beforeAll");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("### @afterAll");
    }

    @BeforeEach
    void beforeEach(){
//        open("google.com')
        System.out.println("####    @beforeEach");
    }
    @AfterEach
    void afterEach(){
        System.out.println("###     @afterEach");
    }
    @Test
    void firstTest(){
        System.out.println("####        @Test firstTest()!");
        assertTrue(3 > 2);
    }
    @Test
    void secondTest(){
        System.out.println("####        @Test secondTest()!");
        assertFalse(3 > 2);
    }
}
