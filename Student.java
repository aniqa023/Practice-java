public class Student {
    private String id;
    private String name;
    private int grade;
    private char letterGrade;
    private double average;

    public Student (String id ,String name,int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        setLetterGrade();
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
    public void setGrade(int grade)
    {
        this.grade=grade;
        setLetterGrade();
    }
    public int getGrade()
    {
        return grade;
    }
     public void setLetterGrade()
    {
        if (grade >= 90){
            letterGrade= 'A';
        }
        else if (grade >= 80){
            letterGrade= 'B';
        }
        else if (grade >=70){
            letterGrade= 'C';
        }
        else if (grade >= 60){
            letterGrade= 'D';
        }
        else{
            letterGrade= 'F';
        }
    }
    public char getLetterGrade()
    {
        return letterGrade;
    }
    public void setAverage(double average)
    {
        this.average=average;
    }
    public double getAverage ()
    {
        return average;
    }

    public void display ()
    {
        System.out.println("Student id: "+getId());
        System.out.println("Student name: "+getName());
        System.out.println("Student grade: "+getGrade());
        System.out.println("Student lettergrade: "+getLetterGrade());
    }

}
