import java.util.Scanner;


public class Student {
    
    private  String firstName;
    private  String lastName;
    private String  name;
    private String studentId;
    private int gradeYear;
    private int id;
    private  String course;
    private static int tuitionFees;
    private static int courseCost;
   Student(){
       course=null;
       tuitionFees=0;
       courseCost=5500;
       id=1000;
       Scanner input=new Scanner(System.in);
       
       System.out.print("ENTER YOUR FIRST NAME : ");
       this.firstName=input.next();
       
       System.out.print("ENTER YOUR LAST NAME : ");
       this.lastName=input.next();
       
       System.out.print("ENTER YOUR GARDE YEAR   : ");
       this.gradeYear=input.nextInt();
       
       
 
   }
   void course(){
       
       while(1!=0){
           Scanner input=new Scanner(System.in);
       System.out.print("ENTER YOUR COURSE Q TO QUIT : ");
       String courses=input.nextLine();
       if(!courses.equals("Q")){
          
            course=course+"\n"+courses;
           tuitionFees=tuitionFees+courseCost;
       } else {
           
          break;
       }
       }
       
   }
   
 void setValue(){
      id++;
      this.studentId=gradeYear+"-"+id;
      this.name=firstName+" "+lastName;
      course();
 }
   void getValue(){
       setValue();
       
       System.out.println(" YOUR FIRST NAME : "+name);
       System.out.println(" STUYDENT ID : "+studentId);
       System.out.println(" YOUR COURSE : "+course);
       System.out.println(" PER COURSE COST : "+courseCost);
       System.out.println(" YOUR TUITION FEES : "+tuitionFees);
       
       
   }
    
}

public class StudentData {
    public static void main(String[] args) {
        Student st=new Student();
        st.getValue();
    }
}
