package src;

import java.util.Scanner;
//input enter any two number and ask user to enter their symbol (+, -, /, *) find addition, subtraction, multiplication
// and division according to their symbol (using if else)
public class FindAdiSubMultDiv {
    Scanner scanner = new Scanner(System.in); //instantiated scanner class
     void cal(int a, int b){
         System.out.println("Please choose an operator: +, -, * or / ");
        char operator=scanner.next().charAt(0);//storing user input parameter in local variable
        if(operator =='+'){//addition if input operator is +
            System.out.println(a+" + "+b+"= "+(a+b));
        }
        else if(operator=='-'){//Subtraction if input operator is -
            System.out.println(a+" - "+b+"= "+(a-b));
        }
        else if(operator=='*'){//Multiplication if input operator is *
            System.out.println(a+" * "+b+"= "+(a*b));
        }
        else if(operator=='/'){//Division if input operator is /
            System.out.println(a+" / "+b+"= "+(double)a/b);
        }
        else{
            System.out.println("please input the operator");
        }
    }

    public static void main(String[] args){
        System.out.println("Please enter two numbers: ");
        FindAdiSubMultDiv fd= new FindAdiSubMultDiv();//instantiate the class
        fd.scanner = new Scanner(System.in);//calling scanner class
        fd.cal(fd.scanner.nextInt(), fd.scanner.nextInt());//calling the method and passing the parameter from scanner class

    }

}
