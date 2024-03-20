package src;

import java.util.Scanner;
//Input any alphabet from a to f and print their city name accordingly (use if else)
// any other alphabet should be invalid entry
public class CityNames {
    static void a2fCityNames(char k){
        //printing city name as per the input alphabets
        if(k=='a'||k=='A'){
            System.out.println("Ahmedabad");
        }
        else if(k=='b'||k=='B'){
            System.out.println("Bristol");
        }
        else if(k=='c'||k=='C'){
            System.out.println("Copenhagen");
        }
        else if(k=='d'||k=='D'){
            System.out.println("Delhi");
        }
        else if(k=='e'||k=='E'){
            System.out.println("Edinburgh");
        }
        else if(k=='f'||k=='F'){
            System.out.println("Frankfurt");
        }
      else{//printing message if input value is not a to f
            System.out.println("Please enter alphabets a to f only");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter employ id, name and basic salary: ");
        a2fCityNames(scanner.next().charAt(0));//calling the method and passing the parameter from scanner class
    }
}
