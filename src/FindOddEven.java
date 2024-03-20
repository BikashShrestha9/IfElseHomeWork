package src;

import java.util.Scanner;

public class FindOddEven {

//Input any two number and find out its odd or even use turnery operator (? :)
    static void isOddEven(int a, int b){
        var l=(a%2 == 0) ? "even":"odd";
        var m=(b%2 == 0) ? "even":"odd";

        System.out.println(a+" is "+l+"number" +"\n"+b+" is "+m+" number");
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter the two numbers: ");
        isOddEven(scanner.nextInt(), scanner.nextInt());//calling the method and passing the parameter from scanner class
    }

}
