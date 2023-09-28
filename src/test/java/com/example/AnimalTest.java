package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)
public class AnimalTest extends TestCase {
    @Spy
    Animal animal;

    String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    @Test
    public void testGetFamily() {
        System.out.println();
        Assert.assertEquals(expectedResult, animal.getFamily());
    }

    @Test
    public void getFoodCanMakeThrows(){
        assertThrows(Exception.class, () -> animal.getFood("454"));
    }
}