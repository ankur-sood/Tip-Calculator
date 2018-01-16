package ca.ankur.tipcalculator;

/**
 * Created by Ankur Sood on 7/4/2017.
 */

public class CalculatorModel {


    private double amount; // bill amount
    private int percentage; // tip percentage
    private int number; // number of people


    public CalculatorModel(double amount, int percentage, int number) {
        this.amount = amount;
        this.percentage = percentage;
        this.number = number;
    }


    public double getTotal() {

        return (this.amount * (100 + this.percentage)) / 100.0;

    }

    public double getPerPerson() {

        return (((this.amount * (100 + this.percentage)) / 100.0) / this.number);

    }

}