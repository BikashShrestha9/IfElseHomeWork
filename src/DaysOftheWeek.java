package src;

import java.util.Scanner;
//input any number, the print Day name of the week accordingly
public class DaysOftheWeek {
    void findDays(int a){
        //condition to print out days of the week if user input value 1 -7
        if(a==1){
            System.out.println("Monday");
        }
        else if(a==2){
            System.out.println("Tuesday");
        }
        else if(a==3){
            System.out.println("Wednesday");
        }
        else if(a==4){
            System.out.println("Thursday");
        }
        else if(a==5){
            System.out.println("Friday");
        }
        else if(a==6){
            System.out.println("Saturday");
        }
        else if(a==7){
            System.out.println("Sunday");
        }
        else{// print out message if input value is not with in the above limit
            System.out.println("Please enter value 1-7");
        }
    }
    public static void main(String[] args){
        DaysOftheWeek dw= new DaysOftheWeek();//instantiate the DaysOftheWeek class
        Scanner scanner = new Scanner(System.in); //instantiate the scanner class
        System.out.println("Please enter the number from 1 to 7");
        dw.findDays(scanner.nextInt());//calling method and passed the parameter value from scanner class
    }
}
