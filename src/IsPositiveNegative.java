package src;

import java.util.Scanner;
//input any number and fid our if it is positive , negative or zero
public class IsPositiveNegative {

    static void findPosNegZero(int a){
        if(a>0){
            System.out.println("Entered Value is positive ");
        }
        else if(a<0){
            System.out.println("Entered Value is negative ");
        }
        else{
            System.out.println("Entered value is zero ");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter the value: ");
        findPosNegZero(scanner.nextInt());//calling the method and passing the parameter from scanner class
    }
}
