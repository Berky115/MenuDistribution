package com.app;

import com.service.FoodDistributionService;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String args[]) throws IOException {

        FoodDistributionService foodDistributionService= new FoodDistributionService();
        HashMap<Integer,Integer> inputMenu = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your menu and ratio in a comma delimited list. Example: 1:2,2:3,3:1...");
        String menu=sc.next();
        System.out.println("Enter your total meal quantity");
        String quantity=sc.next();

        menu.trim();
        List<String> items = Arrays.asList(menu.split(","));

        for(String entry : items) {
            List<String> tmp = Arrays.asList(entry.split(":"));
            inputMenu.put(Integer.parseInt(tmp.get(0)),Integer.parseInt(tmp.get(1)));
        }

        HashMap<Integer,Integer> finalMenu = foodDistributionService.distributeFood(inputMenu,Integer.parseInt(quantity));
        System.out.println(finalMenu);
    }
}
