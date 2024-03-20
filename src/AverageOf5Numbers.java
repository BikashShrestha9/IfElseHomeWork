package src;

import java.util.Scanner;
//input any five number and then find average of five numbers
public class AverageOf5Numbers {
    void average(int a, int b, int c, int d, int e){
        //calculating and printing out average value of input value
        System.out.println("Average of entered numbers is: "+((double)a+b+c+d+e)/5);
    }
    public static void main(String[] args){
        AverageOf5Numbers av = new AverageOf5Numbers();//instantiate AverageOf5Numbers class
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter 5 numbers to find the average: ");
        //calling the method and passing the parameter from scanner class
        av.average(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(), scanner.nextInt());
    }
}
