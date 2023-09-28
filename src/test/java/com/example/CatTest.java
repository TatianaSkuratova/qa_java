package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {

    @Mock
    Feline feline;
    Cat cat;
    @Before
    public void init() {
        cat = new Cat(feline);
    };
    @Test
    public void catSayMeow() {
        Assert.assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void catEatMeat() throws Exception{
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}