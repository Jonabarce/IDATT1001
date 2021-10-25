import java.util.GregorianCalendar;
import java.util.Scanner;


public class ArbTaker {
    private final Person personalia;
    private final int nrWorker;
    private final int startedWorking;
    private static double monthlySalary;
    private static double taxRate;
    GregorianCalendar Calendar = new GregorianCalendar();


    public ArbTaker(Person personalia, int nrWorker, int startedWorking, double monthlySalary, double taxRate){
        this.personalia = personalia;
        this.nrWorker = nrWorker;
        this.startedWorking = startedWorking;
        this.monthlySalary = monthlySalary;
        this.taxRate = taxRate;

    }


    public Person getPersonalia() {
        return personalia;
    }

    public int getNrWorker(){
        return nrWorker;
    }

    public int getStartedWorking(){
        return startedWorking;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getTaxRate(){
        return taxRate;
    }

    public void setNewSalary(double newSalary){
        this.monthlySalary = newSalary;
    }

    public void setNewTaxRate(double newTaxRate){
        this.taxRate = newTaxRate;
    }

    private double getTaxPerMonth(){
        double tax = (this.getMonthlySalary()) * (this.getTaxRate() / 100);
        return tax;
    }

    private double getannualSalary(){
        double salary = this.getMonthlySalary() * 12;
        return salary;
    }

    private double gettaxPerYear(){
        double tenMonths = this.getTaxPerMonth() * 10;
        double taxDeductions = tenMonths + (this.getTaxPerMonth() * 0.5);
        return taxDeductions;
    }

    private String getName(){
        String name = this.getPersonalia().getLastName() + " , " + this.getPersonalia().getFirstName();
        return name;
    }

    private int getAge(){
        int yearNow = Calendar.get(java.util.Calendar.YEAR);
        int age = yearNow - this.getPersonalia().getYearBirth();
        return age;
    }

    private int getannualEmployee(){
        int yearNow = Calendar.get(java.util.Calendar.YEAR);
        int annualEmployee = yearNow - this.getStartedWorking();
        return annualEmployee;
    }

    private boolean getemployeeMoreThen(int totalYears){
        boolean moreThen = false;
        if(this.getannualEmployee() >= totalYears){
            moreThen = true;
        }
        return moreThen;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;

        System.out.println(" Write in first name ");
        String firstName = input.nextLine();
        System.out.println(" Write in last name ");
        String lastName = input.nextLine();
        System.out.println(" Write in date of birth ");
        int yearBirth = input.nextInt();

        Person person = new Person(firstName, lastName, yearBirth);

        System.out.println(" Write in employee number ");
        int nrWorker = input.nextInt();
        System.out.println(" Write in year of employment ");
        int startedWorking = input.nextInt();
        System.out.println(" Write in Monthlysalary ");
        double monthlySalary = input.nextDouble();
        System.out.println(" Write in taxrate ");
        double taxRate = input.nextDouble();

        ArbTaker arbTaker = new ArbTaker(person, nrWorker, startedWorking, monthlySalary, taxRate);

        while (go) {
          showMenu(arbTaker);
       }
    }
    public static void showMenu(ArbTaker arbTaker){
        Scanner input = new Scanner(System.in);
        boolean run = true;

        while (run){
            System.out.println("");
            System.out.println( " Press 1 to change total monthlysalary");
            System.out.println( " Press 2 to change the taxrate ");
            System.out.println( " Press 3 to print out all data ");

            int menuInput = input.nextInt();

            if (menuInput == 1){
                System.out.println( " Write in new monthlysalary ");
                double newSalary = input.nextDouble();
                arbTaker.setNewSalary(newSalary);
                System.out.println( " The new monthlysalary is: " + arbTaker.getMonthlySalary());

            }
            if (menuInput == 2){
                System.out.println( " Write in the new taxrate ");
                double newTaxRate = input.nextDouble();
                arbTaker.setNewTaxRate(newTaxRate);
                System.out.println( " The new taxrate is: " + arbTaker.getTaxRate());

            }
            if (menuInput == 3){
                System.out.println( "" );
                System.out.println( " Name: " + arbTaker.getName());
                System.out.println( " Age: " + arbTaker.getAge());
                System.out.println( " Tax per month: " + arbTaker.getTaxPerMonth());
                System.out.println( " Tax per year: " + arbTaker.gettaxPerYear());
                System.out.println( " Gross salary per year: " + arbTaker.getannualSalary());
                System.out.println( " Year employed: " + arbTaker.getannualEmployee());
                System.out.println( " Employed more than 10 years: " + arbTaker.getemployeeMoreThen(10)); //dette blir nå totalYears


            }else{
                System.out.println(" Please press a number from 1 to 3 ");
            }

        }


    }

}



