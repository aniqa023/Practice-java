import java.util.Scanner;
public class StudentApp {
    public static void main (String [] args)
    {
        Scanner input=new Scanner(System.in);
        int total=0;
        int gradeCounter=0;

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
       //date
       System.out.println("Enter date of birth: ");
       System.out.println("Enter month: ");
       int birthMonth=input.nextInt();
       System.out.println("Enter day: ");
       int birthDay=input.nextInt();
       System.out.println("Enter year: ");
       int birthYear=input.nextInt();
       Date birthDate=new Date(birthMonth,birthDay,birthYear);
       //admission
       System.out.println("Enter Admission Date:");
       System.out.print("Enter Month: ");
       int admissionMonth=input.nextInt();
       System.out.print("Enter Day: ");
       int admissionDay=input.nextInt();
       System.out.print("Enter Year: ");
       int admissionYear=input.nextInt();
       Date admissionDate=new Date(admissionMonth,admissionDay,admissionYear);

       //Entry Time
        System.out.println("Enter Entry Time : ");
        System.out.println("Enter hour : ");
        int hour = input.nextInt();
        System.out.println("Enter Minute : ");
        int minute = input.nextInt();
        System.out.println("Enter Second: ");
        int second = input.nextInt();
        Time2 entryTime = new Time2(hour, minute, second);

       input.nextLine();
     Student s1=new Student(id,name,grade,birthDate,admissionDate,entryTime);
     s1.display();

    total=total+s1.getGrade();
      gradeCounter++;      
    }
    
    if (gradeCounter!=0)
    {
     double average=(double)total/gradeCounter;

    System.out.println("\nGRADE REPORT");
    System.out.println("Total of the "+gradeCounter +"grades enterd is "+total);
    System.out.printf("Class average is %.2f%n",average); 
    System.out.println("/nNumber of students who recieve each grade: ");
    Student.getGradeCounter();
    }
    else {
        System.out.println("No grades were entered.");
    }
    input.close();
    }
}
