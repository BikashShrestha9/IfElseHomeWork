package src;

import java.util.Scanner;
//input any two numbers and then print their interchanged value
public class InterchangeValue {
    void swapValue(int a, int b){
        System.out.print("Before swapping numbers: "+a + " and "+ b+"\n");
        int temp=a; //creating local variable and storing variable 'a' value
            a=b; //assigning variable 'b' value to variable 'a'
            b=temp; // assigning temp value to variable 'b'
        System.out.print("After swapping numbers: "+a + " and "+ b);
    }
    public static void main(String[] argos) {
        InterchangeValue interchange= new InterchangeValue();//instantiate InterchangeValue class
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Enter your swapping numbers : ");
        interchange.swapValue(scanner.nextInt(),scanner.nextInt());//calling the method and passing the parameter from scanner class
    }
}
