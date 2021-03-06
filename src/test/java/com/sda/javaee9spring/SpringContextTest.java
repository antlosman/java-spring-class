package com.sda.javaee9spring;

import com.sda.javaee9spring.component.MyFirstSpringComponent;
import com.sda.javaee9spring.component.SecondComponent;
import com.sda.javaee9spring.controller.FirstController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SpringContextTest {
    @Autowired
    private FirstController myFirstController;

    @Test
    void checkFirstControllerReference() {
        assertNotNull(myFirstController);
        String firstPageName = myFirstController.firstPage();
        assertEquals("home-page", firstPageName);
    }

    @Autowired
    private MyFirstSpringComponent myFirstSpringComponent;

    @Autowired
    private MyFirstSpringComponent myFirstSpringComponentSecond;

    @Test
    void checkMyFirstSpringComponentReference() {
        assertNotNull(myFirstSpringComponent);
    }

    @Test
    void manyObjectsOfTheSameTypeTest() {
        assertSame(myFirstSpringComponent, myFirstSpringComponentSecond);
        // == - checks if two references points to the same object
        // by default every bean inside Spring Context is singleton
    }

    @Autowired
    private SecondComponent secondComponent1;

    @Autowired
    private SecondComponent secondComponent2;

    @Test
    void checkIfSecondComponent1AndSecondComponent2NotSame() {
        assertNotSame(secondComponent1, secondComponent2);
    }
}
