package src;

import java.util.Scanner;

//input student name, roll no, 3 subjects marks and find out total, percentage and result if he is pass or fail on basis of percentage (pass>=35) and also give them grade
//>= 80 A+
//>= 60 A
//>= 50 B
// >= 35 C
public class TotalPercentageWithGrade {
    static void resultAndGrade(String name, int rollNo, float math, float sci, float geo){
        String grade="";//empty local variable to store the grade
        String result="";// empty local variable to store the result
        float totalPercentage= ((math+sci+geo)/300)*100; //calculating the percentage with full marks for each subject is 100 and storing in the variable
        if(totalPercentage>=80){
            result="Pass";
            grade="A+";
        }
        else if(totalPercentage>=60){
            result="Pass";
            grade="A";
        }
        else if(totalPercentage>=50){
            result="Pass";
            grade="C";
        }
        else if(totalPercentage>=35){
            result="Pass";
            grade="C";
        }
        else{
            result="Fail";
            grade = " ";
        }
        System.out.println("Student name: "+name+"\n"+"Roll Num: "+rollNo+ "\n"+"Result: "+result+"\n"+ "Grade: "+grade);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//instantiate scanner class
        System.out.println("Please enter Name, roll number, marks for math, science and geography: ");
        //calling the method and passing the parameter from scanner class
        resultAndGrade(scanner.nextLine(), scanner.nextInt(),scanner.nextFloat(),scanner.nextFloat(),scanner.nextFloat());
    }
}
