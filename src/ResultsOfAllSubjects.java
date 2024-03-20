package src;

import java.util.Scanner;

public class ResultsOfAllSubjects {
    static void resultAndGrade(String name, int rollNo, float math, float sci, float geo){
        final int totalMarks=100; // local variable to calculate percentage of each subject
        String grade=""; //empty local variable to store the grade
        String result=""; //empty local variable to store the grade
        float totalPercentage = ((math+sci+geo)/300)*100; // calculating percentage among 3 subjects
        //checking each subjects has over 35 % marks and assigning marks and grade
        if((math/totalMarks)*100>35 && (sci/totalMarks)*100>35 && (geo/totalMarks)*100>35 && totalPercentage>80){
            result="Pass";
            grade="A+";
        }
        else if((math/totalMarks)*100>35 && (sci/totalMarks)*100>35 && (geo/totalMarks)*100>35 && totalPercentage>60){
            result="Pass";
            grade="A";
        }
        else if((math/totalMarks)*100>35 && (sci/totalMarks)*100>35 && (geo/totalMarks)*100>35 && totalPercentage>50){
            result="Pass";
            grade="C";
        }
        else if((math/totalMarks)*100>35 && (sci/totalMarks)*100>35 && (geo/totalMarks)*100>35 && totalPercentage>35){
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
