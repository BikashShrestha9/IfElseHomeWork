package src;
import java.util.Scanner;
//Input any alphabet in uppercase and print it in lowercase
public class PrintLowercase {
     static void upperToLowerCase(char a) {
        boolean b=Character.isLetter(a);//validating input value is alphabets
        if (!b) {//printing out message if not alphabets
            System.out.println("Input value is not a alphabets");
        }
        else{
            String st=String.valueOf(a);//converting character variable to string
            System.out.println(st.toLowerCase());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter the value: ");
        upperToLowerCase(scanner.next().charAt(0));//calling the method and passing the parameter from scanner class
    }
}
