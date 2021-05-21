import java.util.Scanner;

public class Student {
    private  String full_name;
    private int age;
    private String address;
    private int birth_years;
    private  String gender;
    private String phone_number;
    private String fb_link;
    Scanner scanner = new Scanner(System.in);

    public int getBirth_years() {
        return birth_years;
    }

    public String getGender() {
        return gender;
    }

    /**
     * addition Student
     */
    public void addStudent(){
        System.out.println("enter Fullname:");
        this.full_name = scanner.nextLine();
        System.out.println("enter Age:");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter Address:");
        this.address = scanner.nextLine();
        System.out.println("enter Birth_years:");
        this.birth_years = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter Gender:");
        this.gender = scanner.nextLine();
        System.out.println("enter Phone_number:");
        this.phone_number = scanner.nextLine();
        System.out.println("enter Fb_link:");
        this.fb_link = scanner.nextLine();
    }
    public void disNameAndPhone(){
        System.out.printf("Fullname: %s\n phone_number: %s\n", full_name, phone_number);
    }
    public void disNameAndbirth_years(){
        System.out.printf("Fullname: %s\n birth_years: %d\n", full_name, birth_years);
    }

}
