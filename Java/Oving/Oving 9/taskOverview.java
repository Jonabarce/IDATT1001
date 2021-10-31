import java.util.ArrayList;
import java.util.Scanner;



public class taskOverview {
    private static ArrayList<Student> students = new ArrayList<Student>();
    private static int totalStudents = 0;



public taskOverview(){
    students = new ArrayList<Student>();
}

public static int getTotalStudents(){
    return students.size();
}

public int getTotalTasksStudent(Student student){
    int total = student.getTotalTasks();
    return total;
}

public void increaseTotalTasksStudent(Student student, int increase ){
    student.increaseTotalTasks(increase);
}

public static void newStudent(String name, int totalTasks){
    boolean nameTrue = false;
    for(int i = 0; i < getTotalStudents(); i++){
        if(students.get(i).getName().equals(name)){ //bruker forløkke for å gå igjennom alle registrerte studenter
            nameTrue = true;                        //så bruker jeg equals for å sjekke om navnet som nå blir registert samsvarer med tidligere navn registert
        }
    }
    if(!nameTrue){
        Student newStudent = new Student(name, totalTasks);
        students.add(newStudent);
    }else{
        System.out.println( " Error! This name does already exist ");
    }
}

public static int studentId(String name){
    int index = -1;
    for(int i = 0; i < getTotalStudents(); i++){
        if(students.get(i).getName().equals(name)){
            index = i;
            break;
        }
    }
    return index;
}

public static void writeOutAll(){
    if(getTotalStudents() < 1){
        System.out.println( " Error! There are none students registered. Maybe try add some first");
    } else {
        System.out.println(" Here are the students: ");
        for(int i = 0; i < getTotalStudents(); i++){
            Student student = students.get(i);
            System.out.println( " Name: " + student.getName() + ", Total tasks " + student.getTotalTasks());
        }

    }
}
@Override
public String toString(){
    String text = "";
    for(int i = 0; i < getTotalStudents(); i++){
        text = text + students.get(i).toString() + " | ";
        }
    return text;
    }

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println( " Press 1 to continue or press 2 to quit ");
    int choice = input.nextInt();

    if(choice == 1){
        boolean go = true;
        while(go){
            System.out.println( " What would you like to do? ");
            System.out.println("");
            System.out.println(" Press 1 to register a new student ");
            System.out.println(" Press 2 to find total students registered ");
            System.out.println(" Press 3 to find total tasks approved for one specific student ");
            System.out.println(" Press 4 to increase total tasks approved for one specific student ");
            System.out.println(" Press 5 to print out all registered students ");
            System.out.println(" Press 6 to Exit ");
            int choice2 = input.nextInt();

            if(choice2 == 1){
                System.out.println(" Please write in the name of the student ");
                input.nextLine();
                String name = input.nextLine();
                System.out.println(" Please write in total tasks that the students has done ");
                int totalTasks = input.nextInt();
                newStudent(name,totalTasks);
            }

            if(choice2 == 2){
                System.out.println(" Total students registered is: " + getTotalStudents());
            }

            if(choice2 == 3){
                System.out.println(" Please write in the students name");
                input.nextLine();
                String name = input.nextLine();
                int id = studentId(name);

                try{
                    Student student = students.get(id);
                    System.out.println(" Student: " + student.getName() + " \n Has done: " + student.getTotalTasks() + " Tasks ");
                } catch (IndexOutOfBoundsException e){
                    System.out.println(" Error! This student does not exist. Press 2 in the menu to see all the students ");
                    System.out.println( " Or press 1 to add a new student ");
                }
            }

            if(choice2 == 4){
                System.out.println(" Please write in the students name");
                input.nextLine();
                String name = input.nextLine();
                int id = studentId(name);

                try{
                    System.out.println(" What would you like to increase the total tasks done with? ");
                    int increase = input.nextInt();
                    Student student = students.get(id);
                    student.increaseTotalTasks(increase);
                    System.out.println(" Total tasks done now is: " + student.getTotalTasks());
                }catch(IndexOutOfBoundsException e){
                    System.out.println(" Error! This student does not exist. Press 2 in the menu to see all the students ");
                    System.out.println( " Or press 1 to add a new student ");
                }
            }

            if(choice2 == 5){
                writeOutAll();
            }

            if(choice2 == 6){
                go = false;
                System.out.println(" Exiting the program....");
            }


        }
    }
}

}
