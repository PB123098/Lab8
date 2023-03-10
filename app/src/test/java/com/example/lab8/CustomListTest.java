package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private ArrayList<City> citylist = new ArrayList<>();

    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null,citylist);
        City city = new City("Edmonton","AB");

        list.addCity(city);
        assertEquals(1,list.getCount());

    }

    @Test
    public void testHasCity(){
        CustomList list = new CustomList(null,citylist);
        City city = new City("Regina", "Saskatchewan");
        assertTrue(CustomList.hasCity(city));
    }
//    @Test
//    public void testDelete(){
//        CustomList list = new CustomList(null,citylist);
//        City city = new City("Regina", "Saskatchewan");
//        list.delete(city);
//        assertEquals(0, CustomList.getCities().size());
//        assertThrows( IllegalArgumentException.class, () -> {CustomList.delete(city); });
//    }
//    @Test
//    public void testCount(){
//
//        CustomList list = new CustomList(null,citylist);
//        assertEquals(1,CustomList.countCities());
//        CustomList.add(new City("Vancouver", "British Columbia"));
//        assertEquals(2,CustomList.countCities());
//
//
//    }



}
