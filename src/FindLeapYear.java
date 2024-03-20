package src;
import java.util.Scanner;

//to input any year like 1989 and find out if it is leap year
public class FindLeapYear {
    static void findLeapYear(int a ){
        if(a % 4 == 0 && a % 100 !=0 || a % 400 == 0){//applying finding leap year formula
            System.out.println(a +" is a leap year");
        }
        else{
            System.out.println(a + " is not a leap year");
        }
    }
    public static void main(String[] argos) {
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Enter 4 digits year to find the leap year : ");
        findLeapYear(scanner.nextInt());//calling the method and passing the parameter from scanner class
    }
}