package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceComplexTest {
    ServiceComplex service = new ServiceComplex();;
   Complex complex1, complex2;
   @BeforeEach
   void initializate()
   {
       complex1 = new Complex(5,5);
       complex2 = new Complex(5,5);
   }



    @Test
    void str() {
       assertEquals("5.0 + 5.0i", service.str(complex1));
    }

    @Test
    void add() {
        assertEquals(new Complex(10,10), service.add(complex1,complex2));
    }

    @Test
    void sub() {
        assertEquals(new Complex(0,0),service.sub(complex1,complex2));
    }

    @Test
    void mul() {
        assertEquals(new Complex(0,50), service.mul(complex1,complex2));
    }

    @Test
    void div() {
        assertEquals(new Complex(25.5,0), service.div(complex1,complex2));
    }

    @Test
    void module() {
        assertEquals("7.0710678118654755", String.valueOf(service.module(complex1)));
    }

    @Test
    void testEquals() {
       assertTrue(complex1.equals(complex2));
    }
}