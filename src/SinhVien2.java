import java.util.Scanner;

public class SinhVien2 {
    private String name;
    private int age;
    private String address;
    private int birth_years;
    private String gender;
    private String phone;
    private  String facebook_link;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    Scanner scanner = new Scanner(System.in);
    public void addSinhVien(){
        System.out.println("enter name: ");
        this.name = scanner.nextLine();
        System.out.println("enter address: ");
        this.address = scanner.nextLine();
        System.out.println("enter phone_number: ");
        this.phone = scanner.nextLine();
        System.out.println("enter gender: ");
        this.gender = scanner.nextLine();
        System.out.println("enter facebook_link: ");
        this.facebook_link = scanner.nextLine();
        System.out.println("enter birth_years: ");
        this.age = scanner.nextInt();
    }
    public void displaySinhVien(){
        System.out.printf("Name: %s\n Age: %d\n Address: %s\n Birth_years: %d\n Gender: %s\n Phone: %s\n facebook_link: %s\n",name, age, address, birth_years, gender, phone, facebook_link);
    }
    public void changephone(String newphone){
        phone =newphone;
    }
}
