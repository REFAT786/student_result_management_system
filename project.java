
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

interface Student {

	public void setInformation(String Name,String Id);//overloading
    public void setInformation(Float Attendence,Float perfomance,Float Quiz1,Float Quiz2);//overloading
    public void Display();

}

class MidTerm implements Student {


    Scanner input = new Scanner(System.in);

//ENCAPSULATION
    public String Name;
    public String Id;
    public float Attendence = (float) 0.00;
   
    public float perfomance = (float) 0.00;
    
    public float Quiz1 = (float) 0.00;
    public float Quiz2 = (float) 0.00;
 
    public float MidExam = (float) 0.00;
 
    public float MidTotal = (float) 0.00;
 
    public float MidCal = (float) 0.00;

    MidTerm() { //constractor
		
		//inputs..

        System.out.print("ENTER STUDENT NAME : ");
        Name = input.next();
        
        System.out.print("ENTER STUDENT ID : ");
        Id = input.next();

        System.out.println(" ...MID TERM... ");

        System.out.print("ENTER STUDENT ATTENDENCE NUMBER : ");
        Attendence = input.nextFloat();
         if(Attendence>10||Attendence<0)
        {throw new ArithmeticException("ATEENDENCE NUMBER IS OUT OF 10");}
   
        System.out.print("ENTER STUDENT PERFOMANCE NUMBER : ");
        perfomance = input.nextFloat();
        if(perfomance>10||perfomance<0)
        {throw new ArithmeticException("PERFORMANCE NUMBER IS OUT OF 10");}

        System.out.print("ENTER STUDENT QUIZ 1 NUMBER : ");
        Quiz1 = input.nextFloat();
       if(Quiz1>20||Quiz1<0)
        {throw new ArithmeticException("QUIZ 1 NUMBER IS OUT OF 20");}

        System.out.print("ENTER STUDENT QUIZ 2 NUMBER : ");
        Quiz2 = input.nextFloat();
        if(Quiz2>20||Quiz2<0)
        {throw new ArithmeticException("QUIZ 2 NUMBER IS OUT OF 20");}
      
        System.out.print("ENTER STUDENT MID EXAM NUMBER : ");
        MidExam = input.nextFloat();
       if(MidExam>40||MidExam<0)
        {throw new ArithmeticException("MID TERM     NUMBER IS OUT OF 40");}

        System.out.println("\n");
		
		//function call
		
		setInformation( Name, Id);
        setInformation( Attendence, perfomance, Quiz1, Quiz2);

        MidCalculation();
      

    }
	
	//polymorphism
	 @Override
     public void setInformation(String Name,String Id){
         this.Name=Name;
         this.Id=Id;
     }
    @Override
     public void setInformation(Float Attendence,Float perfomance,Float Quiz1,Float Quiz2){
         this.Attendence=Attendence;
         this.perfomance=perfomance;
         this.Quiz1=Quiz1;
         this.Quiz2=Quiz2;
         
     }

    
    public void MidCalculation() {
		
		
		
        try {

            MidTotal = Attendence + Quiz1 + Quiz2 + perfomance + MidExam;
            MidCal = (float) (MidTotal * 0.4);

        } catch (Exception e) {

            System.out.println(e);
        }

    }
	
    @Override
  public void Display() { //OVERRIDING

        MidCalculation();
        System.out.println("STUDENT NAME : " + Name);
        System.out.println("STUDENT ID : " + Id);

        System.out.println("MID TERM ATTENDENCE NUMBER : " + Attendence);
        System.out.println("MID TERM PERFOMANCE: " + perfomance);
        System.out.println("MID TERM QUIZ 1 : " + Quiz1);
        System.out.println("MID TERM QUIZ 2 : " + Quiz2);
        System.out.println("MID TERM TOTAL NUMBER :" + MidTotal);
        System.out.println("MID TERM 40% : " + MidCal);
        System.out.println("\n");

    }
     

}



 class FinalTerm extends MidTerm  { //inheritance

    Scanner input = new Scanner(System.in);

//ENCAPSULATION

    public float FinalExam = (float) 0.00;
    public float FinalTotal = (float) 0.00;
    public float FinalCal = (float) 0.00;
    public float Result = (float) 0.00;

    FinalTerm() {

			//inputs 
			
        System.out.println(" ...FINAL TERM... ");
        System.out.print("ENTER STUDENT ATTENDENCE NUMBER : ");
        Attendence = input.nextFloat();
       if(Attendence>10||Attendence<0)
        {throw new ArithmeticException("ATEENDENCE NUMBER IS OUT OF 10");}

        System.out.print("ENTER STUDENT PERFOMANCE NUMBER : ");
        perfomance = input.nextFloat();
       if(perfomance>10||perfomance<0)
        {throw new ArithmeticException("PERFORMANCE NUMBER IS OUT OF 10");}

        System.out.print("ENTER STUDENT QUIZ 1 NUMBER : ");
        Quiz1 = input.nextFloat();
       if(Quiz1>20||Quiz1<0)
        {throw new ArithmeticException("QUIZ 1 NUMBER IS OUT OF 20");}

        System.out.print("ENTER STUDENT QUIZ 2 NUMBER : ");
        Quiz2 = input.nextFloat();
          if(Quiz2>20||Quiz2<0)
        {throw new ArithmeticException("QUIZ 2 NUMBER IS OUT OF 20");}

        System.out.print("ENTER STUDENT Final EXAM NUMBER : ");
        FinalExam = input.nextFloat();
         if(FinalExam>40||FinalExam<0)
        {throw new ArithmeticException("FINAL TERM NUMBER IS OUT OF 40");}

        System.out.println("\n");

		// function call
        FinalCalculation();
       

    }
	

    void FinalCalculation() {
		

        try {
            FinalTotal = Attendence + Quiz1 + Quiz2 + perfomance + FinalExam;
            FinalCal = (float) (FinalTotal * 0.6);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
	  public  void Display() //OVERRIDING
	   {
        FinalCalculation();

        System.out.println("FINAL TERM ATTENDENCE NUMBER : " + Attendence);
        System.out.println("FINAL TERM  PERFOMANCE: " + perfomance);
        System.out.println("FINAL TERM QUIZ 1 : " + Quiz1);
        System.out.println("FINAL TERM QUIZ 2 : " + Quiz2);
        System.out.println("FINAL TERM TOTAL NUMBER :" + FinalTotal);
        System.out.println("FINAL TERM 60% : " + FinalCal);
        System.out.println("\n");

    }


     void file() {

        File file = new File("studentResultSystem.txt");
        try {
            FileWriter fwrite;
            fwrite = new FileWriter(file, true);

            Result = (FinalCal + MidCal);

            if (Result >= 0 && Result < 50) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = F");
                String a = "YOUR GRADE = F";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 50 && Result < 60) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = D");
                String a = "YOUR GRADE = D";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 60 && Result < 65) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = D+");
                String a = "YOUR GRADE = D+";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 65 && Result < 70) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = C");
                String a = "YOUR GRADE = C";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 70 && Result < 75) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = C+");
                String a = "YOUR GRADE = C+";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 75 && Result < 80) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = B");
                String a = "YOUR GRADE = B";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 80 && Result < 85) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = B+");
                String a = "YOUR GRADE = B+";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 85 && Result < 90) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = A");
                String a = "YOUR GRADE = A";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else if (Result >= 90 && Result < 100) {
                System.out.println("Total result = " + Result);
				System.out.println("YOUR GRADE = A+");
                String a = "YOUR GRADE = A+";
                fwrite.write("\n" + "NAME : " + Name + "\t" + "ID : " + Id +  "\t" + "MID TERM : " + MidCal + "\t" + "\t" + "FINAL TERM : " + FinalCal + "\t"  + "TOTAL RESULT : " + Result + "\t" + a + "\n");
            } else {
                System.out.println("ERROR!!");
            }

            fwrite.close();

			System.out.println("\n");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}



  class project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        FinalTerm F;
        
		
        
			try{
            
			while(true){
                
             System.out.println(" \n ");
        System.out.println("    .....WELCOME TO STUDENT RESULT FORM.....    ");
        System.out.println("ENTER USER NAME  : ");
        String user = input.next();
        System.out.println("PASSWORD  : ");
        String pass = input.next();

        if (user.equals("refat") && pass.equals("1234")) {

            while (1 != 0) {
                System.out.println("0)exit\t1)add student information\t2)display student information");
                System.out.print("please choose your option : ");
                int option = input.nextInt();
                switch (option) {
                    case 0:
                        System.exit(0);
                        break;

                    case 1:

                        System.out.println("HOw many student information you want to store : ");
                        int n = input.nextInt();

                        int i = 0;
                        while (i < n) {
                            F = new FinalTerm();
                            F.file();
                            i++;
                        }

                        break;
                    case 2:
                        File file = new File("studentResultSystem.txt");
                        try {
                            Scanner scanner = new Scanner(file);
                            while (scanner.hasNext()) {
                                String text = scanner.nextLine();
                                System.out.println(text);
                            }
                            scanner.close();
                            input.nextLine();
                        } catch (IOException e) {
                            System.out.println(e);
                        }

                        break;
                    default:
                        System.out.println("WROUNG OPTION!!");

                        break;

                }

            }

        } else {
            if (!user.equals("refat")) {
                System.out.println("WOUNG USER NAME!!");
                System.out.println("PLEASE TRY AGAIN LATER");

            } else if (!pass.equals("1234")) {
                System.out.println("WOUNG PASSWORD!!");
                System.out.println("PLEASE TRY AGAIN LATER");
            } else {
                System.exit(0);
            }

        }}
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
