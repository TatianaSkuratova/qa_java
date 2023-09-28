package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest extends TestCase {
    @Spy
    Feline feline;
    @Test
    public void testEatMeat() throws Exception{
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void getKittensReturnRightValue() {
        Assert.assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void getKittensCallWithoutParams() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }
}