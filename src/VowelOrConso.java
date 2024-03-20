package src;

import java.util.Scanner;
//user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input.
public class VowelOrConso {
     void vowlConso(char k){
        boolean b=Character.isLetter(k); //validating the input character is alphabet and storing in local variable
         if(!b){//out put message if input value is not character
             System.out.println("Entered value is not a alphabets");
         }
        else if( b  && k=='a'||k=='e'||k=='i'||k=='o'||k=='u'){//checking input character is vowel and local variable condition is true
            System.out.println("Input letter is Vowel");
        }
        else{
             System.out.println("Input letter is Consonant");;
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in); //instantiate the scanner class
        System.out.println("Please enter any letter: ");
        VowelOrConso voc= new VowelOrConso(); //instantiate /vowelOrConso class to call the method
        voc.vowlConso(scanner.next().charAt(0)); // calling method and passed the parameter from scanner class
    }
}
