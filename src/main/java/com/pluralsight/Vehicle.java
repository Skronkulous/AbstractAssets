package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset{
    String makeModel;
    int year, odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        try{
            makeModel.toLowerCase();
            int currentYear = Year.now().getValue();
            int vehicleAge = currentYear - year;
            double value = 0;
            boolean isHondaToyota = false;
            if(makeModel.contains("honda") || makeModel.contains("toyota"))
                isHondaToyota = true;
            switch(vehicleAge){
                case 0,1,2,3:
                    if(isHondaToyota || odometer < 100000){
                        value = originalCost * (1 - (.03 * vehicleAge));
                        break;
                    }
                    else{
                        value = (originalCost * (1 - (.03 * vehicleAge))) * .75;
                        break;
                    }
                case 4,5,6:
                    if(isHondaToyota || odometer < 100000){
                        value = originalCost * (1 - (.06 * vehicleAge));
                        break;
                    }
                    else{
                        value = (originalCost * (1 - (.06 * vehicleAge))) * .75;
                        break;
                    }
                case 7,8,9,10:
                    if(isHondaToyota || odometer < 100000){
                        value = originalCost * (1 - (.08 * vehicleAge));
                        break;
                    }
                    else{
                        value = (originalCost * (1 - (.08 * vehicleAge))) * .75;
                        break;
                    }
                default:
                    if(isHondaToyota || odometer < 100000){
                        value = 1000;
                        break;
                    }
                    else{
                        value = 750;
                        break;
                    }
            }
            return value;
        }
        catch(Exception e){
            System.out.println("Input error, please try again.");
            e.printStackTrace();
            return 0.00;
        }
    }
}
