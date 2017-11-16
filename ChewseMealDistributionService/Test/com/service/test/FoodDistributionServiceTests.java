package com.service.test;

import com.service.FoodDistributionService;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class FoodDistributionServiceTests {

    FoodDistributionService foodDistributionService = new FoodDistributionService();

    @Test
    public void noInput(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        HashMap<Integer,Integer> ExpectedMenu = new HashMap<>();

        assertEquals(ExpectedMenu , foodDistributionService.distributeFood(inputMenu,1));
    }

    @Test
    public void noQuantity(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();
        expectedMenu.put(1,0);

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,0));
    }

    @Test
    public void singleItem(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();
        expectedMenu.put(1,2);

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,2));
    }


    @Test
    public void negativeQuantity(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,-2));
    }

    @Test
    public void evenRatio(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);
        inputMenu.put(2,2);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();
        expectedMenu.put(1,5);
        expectedMenu.put(2,10);

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,15));

    }

    @Test
    public void unevenRatio(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);
        inputMenu.put(2,1);
        inputMenu.put(3,1);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();
        expectedMenu.put(1,4);
        expectedMenu.put(2,4);
        expectedMenu.put(3,3);

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,11));
    }

    @Test
    public void multipleRecordEntry(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);
        inputMenu.put(1,1);
        inputMenu.put(2,1);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();
        expectedMenu.put(1,8);
        expectedMenu.put(2,7);

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,15));
    }

    @Test
    public void largeRecordEntry(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);
        inputMenu.put(2,1);
        inputMenu.put(3,1);
        inputMenu.put(4,1);
        inputMenu.put(5,1);
        inputMenu.put(6,1);
        inputMenu.put(7,1);
        inputMenu.put(8,1);
        inputMenu.put(9,1);
        inputMenu.put(10,1);
        inputMenu.put(11,1);
        inputMenu.put(12,1);
        inputMenu.put(13,1);
        inputMenu.put(14,1);
        inputMenu.put(15,1);
        inputMenu.put(16,1);
        inputMenu.put(17,1);
        inputMenu.put(18,1);
        inputMenu.put(19,1);
        inputMenu.put(20,1);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();
        expectedMenu.put(1,1);
        expectedMenu.put(2,1);
        expectedMenu.put(3,1);
        expectedMenu.put(4,1);
        expectedMenu.put(5,1);
        expectedMenu.put(6,1);
        expectedMenu.put(7,1);
        expectedMenu.put(8,1);
        expectedMenu.put(9,1);
        expectedMenu.put(10,1);
        expectedMenu.put(11,1);
        expectedMenu.put(12,1);
        expectedMenu.put(13,1);
        expectedMenu.put(14,1);
        expectedMenu.put(15,1);
        expectedMenu.put(16,1);
        expectedMenu.put(17,1);
        expectedMenu.put(18,1);
        expectedMenu.put(19,1);
        expectedMenu.put(20,1);

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,20));
    }


    @Test
    public void lackOfQuantity(){

        HashMap<Integer,Integer> inputMenu = new HashMap<>();
        inputMenu.put(1,1);
        inputMenu.put(2,1);
        inputMenu.put(3,1);
        inputMenu.put(4,1);
        inputMenu.put(5,1);

        HashMap<Integer,Integer> expectedMenu = new HashMap<>();
        expectedMenu.put(1,1);
        expectedMenu.put(2,1);
        expectedMenu.put(3,1);
        expectedMenu.put(4,0);
        expectedMenu.put(5,0);

        assertEquals(expectedMenu , foodDistributionService.distributeFood(inputMenu,3));
    }

}
