package com.sda.javaee9spring;

import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Javaee9SpringApplicationTests {

    @Test
    void contextLoads() {
        // this test starts the application and checks if every dependency are "fully hear?"
    }

    @Test
    void dependencyInjectionFirstTrial() {
        Toy plasticGun = new Toy("plastic gun");
        Child john = new Child("John", plasticGun);
        // dependency injection is providing all required class dependencies during creation of objects of that class
        // plasticGun (oj type Toy) is dependency of john (of type Child)
        // john (which is of type Child) is dependency of jason (of type Parent)
        // dependency is actually composition, so one item is made of another item
        Parent jason = new Parent("Jason", john);
    }

    @Test
    void recordTest() {
        // use records instead of value from Lombok
        // records are immutable - cannot modify instances of the class - so setters
        Toy plasticGun = new Toy("pGun");
        System.out.println(plasticGun);

        // child.with(favoriteToy = plasticGun); // in future Java version
    }

    @Test
    void equalTest() {
        Assertions.assertTrue(4 == 4);

        Animal one = new Animal();
        Animal two = new Animal();
        Animal three = one;

        // == checks if this is the same object, checks if two references point to the same object
        // equals by default checks if this is the same object, cheks if two object have same content
        Assertions.assertFalse(one == two);
        Assertions.assertFalse(one.equals(two));

        Toy pGun = new Toy("pGun");
        Toy pGun2 = new Toy("pGun");
        Assertions.assertEquals(pGun,pGun2);
    }

}

// toy is made of name
record Toy(String name) {}
// child is composed of: name and toy
record Child(String name, Toy favoriteToy) {}
// parent is made of (composed of) name and child
record Parent(String name, Child child) {
}

class Animal {

}