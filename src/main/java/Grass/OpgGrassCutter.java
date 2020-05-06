package Grass;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OpgGrassCutter {

    double grassSpeedPerDay = 0.8;
    double grassHeightNow;
    double grassHeightToBeCut = 10.0;
    double days;

    public void whenToCutGrass(double grassHeightNow, double grassHeightToBeCut) {
        days = ((grassHeightToBeCut - grassHeightNow) / grassSpeedPerDay);
    }

    public double userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How 'high' is your grass? ");
        try{
            grassHeightNow = scan.nextDouble();

        } catch (InputMismatchException e){
            System.out.println("Try using numbers with coma instead of dot.");
        }
        return grassHeightNow;
    }

    public void display() {
        if(grassHeightNow>0 && grassHeightNow<grassHeightToBeCut){
            System.out.printf("If your grass is %.2f cm right now, you should cut it again in %s days.", grassHeightNow, (int)days);
        } else if (grassHeightNow==grassHeightToBeCut){
            System.out.println("If it's not raining, you should definitely cut it today!");
        } else if(grassHeightNow<=0){
            System.out.println("Are you sure you don't have asphalt?");
        } else if (grassHeightNow>grassHeightToBeCut){
            System.out.println("You lazy bum, you should already have cut it.");
        } else {
            System.out.println("Illegal operation");
        }
    }
}

