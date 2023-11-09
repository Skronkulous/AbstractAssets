package com.pluralsight;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        int temp = 1;
        ArrayList<Asset> assetList = new ArrayList<Asset>();
        Vehicle myFirstCar = new Vehicle("my first car", "01/11/2019", 6000.00, "Honda Civic", 2005, 90000);
        assetList.add(myFirstCar);
        Vehicle myNewCar = new Vehicle("my most recent car", "04/18/2022", 120000.00, "Tesla Model Y", 2019, 100000);
        assetList.add(myNewCar);
        House myOldHouse = new House("the house that i recently moved from", "01/23/2018", 100000, "123 Gumdrop Ln", 2, 3000, 4000);
        assetList.add(myOldHouse);
        House myNewHouse = new House("the house that i recently moved into", "03/16/2023", 500000, "321 Candycane St", 1, 6000, 10000);
        assetList.add(myNewHouse);

        System.out.println("My Asset List: ");
        for(Asset asset: assetList){
            System.out.println("Asset " + temp + ": " + asset.getDescription() + " | " + asset.getDateAcquired() + " | " + asset.getOriginalCost() + " | " + asset.getValue());
            temp++;
        }
    }
}
