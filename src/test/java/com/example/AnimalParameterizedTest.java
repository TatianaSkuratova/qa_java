package com.example;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    List<String> expectedFood;
    String animalKind;

    public AnimalParameterizedTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters()
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void checkFoodOfAnimal() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(expectedFood, animal.getFood(animalKind));

    }

}
