import java.util.*;

class Student{
    private String name;
    private int rollno;
    private String grade;

    public Student(String name,int rollno,String grade){
        this.name=name;
        this.rollno=rollno;
        this.grade=grade;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public int getRollno(){
        return rollno;
    }
    public void setRollno(){
        this.rollno=rollno;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(){
        this.grade=grade;
    }
}

class StudentManagementSystem{
    private Student[] students;
    private int maxSize;
    private int currentSize;

    public StudentManagementSystem(int maxSize){
        this.maxSize=maxSize;
        this.students=new Student[maxSize];
        this.currentSize=0;
    }
    public void addStudent(Student student){
        if (currentSize<maxSize){
            students[currentSize++]=student;
            System.out.println("Student is added Successfully.");
        }
        else{
            System.out.println("Sorry..! Maximum number of student reached.");
        }
    }
    public void removeStudent(int rollno){
        for(int i=0;i<currentSize;i++){
            if(students[i].getRollno()==rollno){
                for (int j=i;j<currentSize-1;j++){
                    students[j]=students[j+1];
                }
                students[currentSize-1]=null;
                currentSize--;
                System.out.println("Student is removed Successfully.");
                return;
            }
        }
        System.out.println("Student is not found.");
    }
    public Student searchStudent(int rollno){
        for(int i=0;i<currentSize;i++){
            if (students[i].getRollno()==rollno){
                return students[i];
            }
        }
        return null;
    }
    public void displayAllStudents(){
        System.out.println("List of Students:");
        for (int i=0;i<currentSize;i++){
            System.out.println("Name:"+ students[i].getName()+",Rollnumber:"+students[i].getRollno()+",Grade:"+students[i].getGrade());
        }
    }
}
class taskfive{
    public static void main(String[] args){
        StudentManagementSystem sms=new StudentManagementSystem(100);
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println("STUDENT MANAGEMENT SYSTEM:");
            System.out.println("1.Add a new student");
            System.out.println("2.Remove a student");
            System.out.println("3.Search a student");
            System.out.println("4.Display all students");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");

            int  choice=scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1: 
                System.out.println("Enter Student name:");
                String name=scanner.next();
                System.out.println("Enter Student rollno:");
                int rollno=scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter student Grade");
                String grade= scanner.next();
                sms.addStudent(new Student(name,rollno,grade));
                break;

                case 2:
                    System.out.println("Enter rollno of the student to remove:");
                    int rollToremove = scanner.nextInt();
                    scanner.nextLine();
                    sms.removeStudent(rollToremove);
                    break;

                case 3:
                    System.out.println("Enter rollno of the student to search:");
                    int rollTosearch= scanner.nextInt();
                    scanner.nextLine();
                    Student searchedStudent =sms.searchStudent(rollTosearch);
                    if (searchedStudent!=null){
                        System.out.println("Student  found!");
                    }
                    else{
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    sms.displayAllStudents();
                    break;

                case 5:
                    System.out.println("Exiting..");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Invalid choice!(Your choice should between 1 and 5)");
            }
        }
    }
}