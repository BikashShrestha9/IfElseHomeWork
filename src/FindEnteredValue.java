package src;

import java.util.Scanner;
// Enter any value and the find out if it is number (0-9) or an alphabet or symbol
public class FindEnteredValue {
    static void isNumAlphaSymbol(char k){
       if(Character.isLetter(k)){ //validating if input value is alphabets
           System.out.println("Input value "+k+" is alphabet");
       }
       else if (Character.isDigit(k)) { //validating if input value is numbers
           System.out.println("Input value "+k+" is number");
       }
       else{
           System.out.println("Input value "+k+" is symbol ");
       }
    }
    public static void main(String[] args){

        System.out.println("Please entered only one character: ");
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        isNumAlphaSymbol(scanner.next().charAt(0)); //calling the method and passed the parameter from scanner class.
    }
}
