public class Employee
 {
    private String  id;
    private String name;
    private String  branch;
    private double salary;

    public Employee()
    {
        salary=0;
    }

    public Employee(double salary)
    {
      this.salary=salary;
      System.out.println("EMPLOYEE salary: " +getSalary());
    }
    public Employee (String name,double salary )
    {
        this.name= name;
        this.salary= salary;

    }

    public Employee (String id,String name,String branch,double salary )
    {
        this.id=id;
        this.name= name;
        this.branch=branch;
        this.salary= salary;
      System.out.println("Id: "+getId());  
      System.out.println ("Name: "+getName ());
      System.out.println("Branch :"+getBranch());
      System.out.println("Salary: "+getSalary());
      
    }
    
    public void setId(String id)
    {
        this.id=id;
    }
    public String getId()
    {
    return id;
    }
 public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
    return name;
    }
 public void setBranch(String branch)
    {
        this.branch=branch;
    }
    public String getBranch()
    {
    return branch;
    }
 public void setSalary(double salary)
    {
        this.salary=salary;
    }
 public double getSalary()
    {
    return salary;
    }

    public void display ()
    {
        System.out.println("EMPLOYEE'S INFERMATION: ");
        System.out.println("EMPLOYEE Id: " +getId());
        System.out.println("EMPLOYEE Name: "+getName());
        System.out.println("EMPLOYEE BranchId: "+getBranch());
        System.out.println("EMPLOYEE Salary: "+getSalary());  
        
    }
}
