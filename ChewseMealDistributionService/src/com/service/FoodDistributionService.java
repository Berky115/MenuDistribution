package com.service;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class FoodDistributionService {

    /**
     * Standard util logger implemented for scenarios a user may want to be made aware of
     */

    private static final Logger LOGGER = Logger.getLogger(FoodDistributionService.class.getName());


    /**
     * distributeFood is designed to take in a variety of ratio's and return the best possibly distribution
     * given the quantity allotted.
     */

    public HashMap distributeFood(HashMap<Integer, Integer> customerRequest, int quantity) {

        //menu to be returned to user
        HashMap<Integer, Integer> menuDistribution = new HashMap<>();

        /**
         *  Handling of invalid inputs
         */
        if (customerRequest.size() == 0) {
            LOGGER.warning("No menu items specified");
            return menuDistribution;
        } else if (quantity < 0) {
            LOGGER.warning("Invalid quantity");
            return menuDistribution;
        } else {

            /**
             *  generate 'quantity' for ratio division. Ex: 1/3 of 15 is 5.
             */

            Integer entryQuantity = setEntryQuantity(customerRequest, quantity);

            for (Map.Entry<Integer, Integer> menuEntry : customerRequest.entrySet()) {
                Integer menuItem = menuEntry.getKey();

                /**
                 *  allocation for food ratio is equivalent to ratio indicated times entry quantity
                 */

                int allocation = entryQuantity * menuEntry.getValue();
                if (quantity - allocation >= 0) {
                    menuDistribution.put(menuItem, allocation);
                    quantity = quantity - allocation;
                } else {
                    //handle cases where quantity is lacking
                    menuDistribution.put(menuItem, quantity);
                    quantity = 0;
                    LOGGER.warning("Lack of meal quantity to fulfill desired ratio for entry " + menuItem);
                }
            }
            return menuDistribution;
        }
    }

    private Integer setEntryQuantity(HashMap<Integer, Integer> customerRequest, int quantity) {
        Integer entryQuantity = 0;
        for (Map.Entry<Integer, Integer> entry : customerRequest.entrySet()) {
            entryQuantity = entryQuantity + entry.getValue();
        }

        if (quantity > 0) {
            if (quantity % entryQuantity > 0) {
                entryQuantity = quantity / entryQuantity;
                entryQuantity++;
            } else {
                entryQuantity = quantity / entryQuantity;
            }
        } else {
            entryQuantity = 0;
        }
        return entryQuantity;
    }
}
