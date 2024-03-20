package src;

import java.util.Scanner;
//Then the program will show if the person is eligible to vote. A person who is eligible to vote must
// be older than or equal to 18 years old.
public class VotingEligibility {
    static void isEligibleToVote(int a){
        if(a>=18){//condition to check if input value is over 18
            System.out.println("You are eligible ot vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter your age: ");
        isEligibleToVote(scanner.nextInt());//calling the method and passing the parameter from scanner class
    }
}
