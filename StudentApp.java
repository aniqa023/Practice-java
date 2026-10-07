import java.util.Scanner;
public class StudentApp {
    public static void main (String [] args)
    {
        Scanner input=new Scanner(System.in);
        int total=0;
        int gradeCounter=0;
        int aCount=0;
        int bCount=0;
        int cCount=0;
        int dCount=0;
        int fCount=0;
        System.out.println("How many Students do you want to enter: ");
        int numOfStudent = input.nextInt();
        input.nextLine();
        while(gradeCounter < numOfStudent){
       System.out.println("Enter Student information:"+(gradeCounter +1));
       System.out.println("Enter Student id: ");
       String id=input.nextLine(); 
       System.out.println("Enter Student Name: ");
       String name=input.nextLine(); 
       System.out.println("Enter Student grade: ");
       int grade=input.nextInt(); 
       input.nextLine();
     Student s1=new Student(id,name,grade);
     s1.display();
    total=total+s1.getGrade();

    if (s1.getLetterGrade()=='A')
      {
        aCount++;
      }            
    else if (s1.getLetterGrade()=='B')
      {
        bCount++;
      }     
    else if (s1.getLetterGrade()=='C')
      {
        cCount++;
      }     
    else if (s1.getLetterGrade()=='D')
      {
        dCount++;
      }  
    else 
      {
        fCount++;
      }    
      gradeCounter++;      

    }
    if (gradeCounter!=0)
    {
     double average=(double)total/gradeCounter;

    System.out.println("GRADE REPORT");
    System.out.println("Total of the "+gradeCounter +"grades enterd is "+total);
    System.out.printf("Class average is %.2f%n",average); 
    System.out.println("/nNumber of students who recieve each grade: ");
    System.out.println("A: "+aCount);
    System.out.println("B: "+bCount);
    System.out.println("C: "+cCount);
    System.out.println("D: "+dCount);
    System.out.println("F: "+fCount);
    }
    else {
        System.out.println("No grades were entered.");
    }
    input.close();
    }
}
