package com.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class LionParameterizedTest extends TestCase {
    String sex;
    Boolean expectedResult;
    @Mock
    Feline feline;
    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    public LionParameterizedTest(String sex, Boolean expectedResult){
        this.sex = sex;
        this.expectedResult = expectedResult;

    }
    @Test
    public void testDoesHaveMane() throws Exception{
        Lion lion = new Lion(sex, feline);
        Boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
    }

}