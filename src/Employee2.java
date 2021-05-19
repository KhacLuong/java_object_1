
import java.util.Scanner;

public class Employee2 {
    private String name;
    private String address;
    private String phone;
    private int birth_years;
    private int join_year;
    public String getName(){
        return this.name;
    }
    public void setName(String name1){
        this.name = name1;
    }
    void addEmployee(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name: ");
        this.name = scanner.nextLine();
        System.out.println("enter address: ");
        this.address = scanner.nextLine();
        System.out.println("enter phone_number: ");
        this.phone = scanner.nextLine();
        System.out.println("enter birth_years: ");
        birth_years = scanner.nextInt();
        System.out.println("enter join_years: ");
        join_year = scanner.nextInt();
    }
    void displayEmployee(){
        System.out.printf("Name: %s\n Address: %s\n Phone: %s\n Birth_years: %d\n join_years: %d %n\n",name, address, phone, birth_years, join_year);
    }
    void  changeAddress(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter new Address");
        address = scanner.nextLine();
    }

    public static void main(String[] args) {
        Employee2 emp1 = new Employee2();
        emp1.addEmployee();
        emp1.displayEmployee();
        emp1.changeAddress();
        emp1.displayEmployee();
    }
}
