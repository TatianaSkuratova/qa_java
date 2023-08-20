package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest extends TestCase {
    private String placeOfLiving = "Нью-Йоркский зоопарк";
    @Mock
    Feline feline;

    Alex alex;
    @Before
    public void init() throws Exception {
        alex = new Alex(feline);
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(0);
    }

    @Test
    public void checkFriendsAlex() throws Exception{
        List<String> friends = Arrays.asList("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        Assert.assertEquals(friends, alex.getFriends());
    }

    @Test
    public void placeOfLivingIsNYZoo(){
        Assert.assertEquals(placeOfLiving, alex.getPlaceOfLiving());
    }

    @Test
    public void kittensIsZero(){
        alex.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(0);
    }
}