import java.util.Scanner;
public class EmployeeApp 
{
  public static void main (String [] args)
  {
   Employee e1 = new Employee("101","NRBC","S10",20000);
   
   e1.display();
   
   Scanner input=new Scanner(System.in);

   Employee e2=new Employee();

   System.out.println("Enter your id: ");
   e2.setId(input.nextLine());

   System.out.println("Enter your name: ");
   e2.setName(input.nextLine());

   System.out.println("Enter your Branch_id: ");
   e2.setBranch(input.nextLine());

   System.out.println("Enter your salary: ");
   e2.setSalary(input.nextDouble());

   e2.display();

input.close();
  }     
}
