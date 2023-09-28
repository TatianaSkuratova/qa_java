package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)
public class LionTest extends TestCase {
    String predator = "Хищник";
    @Mock Feline feline;
    Lion lion;

    @Before
    public void init() throws Exception {
        lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
    }
    @Test
    public void getKittensNoParamsIsReturnOne() throws Exception {
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void LionFetFoodTest() throws Exception{
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(Mockito.anyList());
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood(predator);
    }
    @Test
    public void lionThrowException(){
        assertThrows( Exception.class, () -> new Lion("44", feline));
    }
}