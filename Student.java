public class Student {
    private String id;
    private String name;
    private int grade;
    private char letterGrade;
    private double average;

    private static int aCount=0;
    private static int bCount=0;
    private static int cCount=0;
    private static int dCount=0;
    private static int fCount=0;

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
     public void setLetterGrade(int grade)
    {
        if (grade >= 90){
            letterGrade= 'A';
            aCount++;
        }
        else if (grade >= 80){
            letterGrade= 'B';
            bCount ++;
        }
        else if (grade >=70){
            letterGrade= 'C';
            cCount++;
        }
        else if (grade >= 60){
            letterGrade= 'D';
            dCount++;
        }
        else{
            letterGrade= 'F';
            fCount++;
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

    public void setGradeCounter(char letterGrade)
    {
        if (letterGrade=='A'){
            aCount++;
        }
        else if (letterGrade=='B'){
            bCount++;
        }
        else if (letterGrade=='C'){
            cCount++;
        }
        else if (letterGrade=='D'){
            dCount++;
        }
        else {
            fCount++;
        }
    }

    public static void getGradeCounter()
    {
        System.out.println("A:"+aCount);
        System.out.println("B:"+bCount);
        System.out.println("C:"+cCount);
        System.out.println("D:"+dCount);
        System.out.println("F:"+fCount);
    }

    public void display ()
    {
        System.out.println("Student id: "+getId());
        System.out.println("Student name: "+getName());
        System.out.println("Student grade: "+getGrade());
        System.out.println("Student lettergrade: "+getLetterGrade());
    }

}
