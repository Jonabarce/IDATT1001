import java.util.Scanner;


public class Student {

private final String name;
private int totalTasks;

public Student(String name, int totalTasks){
    this.name = name;
    this.totalTasks = totalTasks;
}

public String getName(){
    return this.name;
}

public int getTotalTasks(){
    return this.totalTasks;
}

public void increaseTotalTasks(int increase){
    this.totalTasks = this.totalTasks + increase;
}

public String toString(){
    return this.name + " , " + Double.toString(this.totalTasks);
}

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println(" Please write in the name of the student ");
    String name = input.nextLine();
    System.out.println(" Please write in total tasks that the students has done ");
    int totalTasks = input.nextInt();
    Student newStudent = new Student(name, totalTasks);

    System.out.println("");

    System.out.println(" Information registered: ");
    System.out.println(" Students name: " + newStudent.getName());
    System.out.println(" Total tasks done:" + newStudent.getTotalTasks());

    System.out.println( " Lets test the program by adding total tasks done with 6 ");
    newStudent.increaseTotalTasks(6);
    System.out.println( " The total tasks done is now increased to: " + newStudent.getTotalTasks());
    System.out.println(newStudent.toString());
    System.out.println( " Test is now completed ");

}

















}
