package src;

import java.util.Scanner;
//input sales id, seller's name, sales amount, salary basic and then find this sales commission
//sales amount >= 50,000 35%
//sales amount >= 30,000 20%
//>= 20,000 10% >= 10,000 5% < 10,000 2%
public class FindCommission {
    static void findSalesCommission(int sid, String name, double sales, double basSal ){
        double comm;//declaring local variable
        if(sales>=50000) {
            comm = (sales * 0.35);//calculating percentage over 50k and storing in local variable
        }
            else if(sales>=30000){
                comm=sales*0.20; // calculating percentage over 30k and storing in local variable
            }
            else if(sales>=20000){
                comm=sales*0.10;//calculating percentage over 20k and storing in local variable
            }
            else if(sales>=10000){
                comm=sales*0.05;//calculating percentage over 10k and storing in local variable
            }
        else{
            comm=sales*0.02;//calculating percentage for < 10k and storing in local variable
        }
        System.out.println("Sales commission for seller "+sid+" Name "+name+" is " +comm+"\n Gross salary is "+ (basSal+comm));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter sales id, seller's name, sales amount and basic salary: ");
        //calling method and passed parameter from scanner class
        findSalesCommission(scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextDouble());
    }
}
