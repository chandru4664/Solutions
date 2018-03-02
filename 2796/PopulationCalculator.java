package com.htc.corejava.training;
 
/**
 * @author Milind
 * Population Calculator
 */
public class PopulationCalculator {
    public static void main (String [] args) {
 
 double currentPop = 6000000; 
        double growthRate = 1;
        double annualPopIncrease;
        double estimatedPop;
         
        System.out.print ("Enter Current World Population: ");
        System.out.print ("Enter Annual Population Growth Rate: ");
        annualPopIncrease = (growthRate / 100) * currentPop;
        estimatedPop = currentPop + annualPopIncrease;
 
        System.out.println ();
 
        System.out.println("Estimated population after 10 years:    " + estimatedPop + (annualPopIncrease * 10));
 
    }
}