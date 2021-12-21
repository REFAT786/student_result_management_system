import java.util.Scanner;

class MidExam {

    public String Name;
    public int Id;
    public int Attendence;
    public int Quiz1;
    public int Quiz2;
    public int perfomance;
    public int Mid;
    public int MidTotal;
    public float MidCal = (float) 0.00;

    MidExam() {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER STUDENT NAME : ");
        Name = input.next();
        System.out.println("ENTER STUDENT ID : ");
        Id = input.nextInt();
        System.out.println("ENTER STUDENT ATTENDENCE NUMBER : ");
        Attendence = input.nextInt();
        System.out.println("ENTER STUDENT QUIZ 1 NUMBER : ");
        Quiz1 = input.nextInt();
        System.out.println("ENTER STUDENT QUIZ 2 NUMBER : ");
        Quiz2 = input.nextInt();
        System.out.println("ENTER STUDENT PERFOMANCE NUMBER : ");
        perfomance = input.nextInt();
        System.out.println("ENTER STUDENT MID EXAM NUMBER : ");
        Mid = input.nextInt();
        DisplayMid();
    }

    void MidCalculation() {
        MidTotal = Attendence + Quiz1 + Quiz2 + perfomance + Mid;
        MidCal = (float) (MidTotal * 0.4);
    }

    void DisplayMid() {
        MidCalculation();
        System.out.println("STUDENT NAME : " + Name);
        System.out.println("STUDENT ID : " + Id);
        System.out.println("ATTENDENCE NUMMBER : " + Attendence);
        System.out.println("QUIZ 1 : " + Quiz1);
        System.out.println("QUIZ 2 : " + Quiz2);
        System.out.println("PERFOMANCE: " + perfomance);
        System.out.println("TOTAL NUMER :" + MidTotal);
        System.out.println("40% : " + MidCal);

    }

}


class FinalExam extends MidExam {

    public int Final;
    public int FinalTotal;
    public float FinalCal = (float) 0.00;
    public float Result = (float) 0.00;

    FinalExam() {
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER STUDENT ATTENDENCE NUMBER : ");
        Attendence = input.nextInt();
        System.out.println("ENTER STUDENT QUIZ 1 NUMBER : ");
        Quiz1 = input.nextInt();
        System.out.println("ENTER STUDENT QUIZ 2 NUMBER : ");
        Quiz2 = input.nextInt();
        System.out.println("ENTER STUDENT PERFOMANCE NUMBER : ");
        perfomance = input.nextInt();
        System.out.println("ENTER STUDENT Final EXAM NUMBER : ");
        Final = input.nextInt();
        DisplayFinal();
    }

    void FinalCalculation() {
        FinalTotal = Attendence + Quiz1 + Quiz2 + perfomance + Mid;
        FinalCal = (float) (FinalTotal * 0.6);
    }

    void DisplayFinal() {
        FinalCalculation();
        
        System.out.println("ATTENDENCE NUMMBER : " + Attendence);
        System.out.println("QUIZ 1 : " + Quiz1);
        System.out.println("QUIZ 2 : " + Quiz2);
        System.out.println("PERFOMANCE: " + perfomance);
        System.out.println("TOTAL FINAL NUMER :" + FinalTotal);
        System.out.println("60% : " + FinalCal);

    }

    void Result() {

        Result = (FinalCal + MidCal);
        
        if(Result>=0&&Result<50){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = F");
        }
        else if(Result>=50&&Result<55){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = D");
        }
        else if(Result>=55&&Result<60){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = D+");
        }
        else if(Result>=60&&Result<65){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = D");
        }
        else if(Result>=65&&Result<70){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = D");
        }
        else if(Result>=70&&Result<75){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = D");
        }
        else if(Result>=75&&Result<80){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = D");
        }
        else if(Result>=80&&Result<85){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = D");
        }
        else if(Result>=85&&Result<90){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = A");
        }
        else if(Result>=90&&Result<100){
            System.out.println("Total resul = "+Result);
            System.out.println("YOUR GRADE = A+");
        }
        else {
             System.out.println("ERROR!!");
        }
    }
}



public class StudentManagement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // MidExam M = new MidExam();

        FinalExam F = new FinalExam();
        F.Result();

    }

}