package src;

import java.util.Scanner;
//Input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary HRA = basic salary 10%
//DA = Basic salary 8%
//TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA -PF
public class FindSalary {

    static void salary(int empid, String name, double basSal){

        if(basSal>0){
            double HRA= basSal*0.10;
            double DA=basSal*0.8;
            double TA=basSal*0.9;
            double PF=basSal*0.20;
            double gross=(basSal+HRA+DA+TA)-PF;
            System.out.println("HRA salary: "+HRA+"\n"+ "DA salary: "+DA+"\n"+ "TA salary: "+ TA+"\n"+"PF salary= "+PF+"\n"+"Gross salary= "+gross);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter employ id, name and basic salary: ");
        salary(scanner.nextInt(), scanner.next(), scanner.nextDouble());//calling the method and passing the parameter from scanner class
    }
}
