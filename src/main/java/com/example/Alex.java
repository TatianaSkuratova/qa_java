package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion{
    Feline feline;
    private String placeOfLiving = "Нью-Йоркский зоопарк";
    private final String sex = "Самец";
    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
        this.feline = feline;
    }
    public List<String> getFriends(){
        List<String> friends = Arrays.asList("зебра Марти", "бегемотиха Глория", "жираф Мелман");
        return friends;
    }

    public String getPlaceOfLiving(){
        return placeOfLiving;
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

}
