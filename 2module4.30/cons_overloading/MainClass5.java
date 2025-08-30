class Student
{

    Student() {
        System.out.println("personal details");
        System.out.println("acedmic details");
    }
    Student(boolean exp){
        System.out.println("personal details");
        System.out.println("acedmic details");
        System.out.println("Experiece detils");
        
    }

    
}
public  class MainClass5
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        System.out.println("--------------------");
        Student s2 = new Student(true);
    }
}