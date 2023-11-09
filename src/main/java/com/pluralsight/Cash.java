package com.pluralsight;

public class Cash extends Asset{
    double cashUnderBed = 10000000.00;

    public Cash(String description, String dateAcquired, double originalCost, double cashUnderBed) {
        super(description, dateAcquired, originalCost);
        this.cashUnderBed = cashUnderBed;
    }
    
    public double getValue(){
        return cashUnderBed;
    }
}
