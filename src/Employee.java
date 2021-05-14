import java.util.Scanner;

public class Employee {
    String employeeName;
    String employeeAddress;
    String employeePhone;
    int employeeBirthday;
    int employeeJoinYear;
    public Employee() {

    }

    public Employee(int id) {
        employeeJoinYear = id;
    }
    void displayEmployeeInformation(){
        System.out.println("Name : "+ employeeName);
        System.out.println("Address: "+ employeeAddress);
        System.out.println("Age: "+ employeePhone);
        System.out.println("Age: "+ employeeBirthday);
        System.out.println("Age: "+ employeeJoinYear);
    }
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua nhan vien: ");
        employeeName = scanner.nextLine();

        System.out.println("Nhap dia chi cua nhan vien: ");
        employeeAddress = scanner.nextLine();

        System.out.println("Nhap so dien thoai  cua nhan vien: ");
        employeePhone = scanner.nextLine();

        System.out.println("Nhap nam sinh cua nhan vien: ");
        employeeBirthday = scanner.nextInt();

        System.out.println("Nhap nam vao cong ty cua nhan vien: ");
        employeeJoinYear = scanner.nextInt();
    }
    void changeAddress(String newAddress){
        employeeAddress = newAddress;
    }
    void changeAddressInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap lai dia chi moi: ");
        employeeAddress = scanner.nextLine();
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("nhap Thong tin Nhan vien");
        emp1.input();
        System.out.println("Thong tin Nhan vien");
        emp1.displayEmployeeInformation();
        System.out.println("------------------");
        System.out.println("sua doi dia chi");
        emp1.changeAddress("HCM");
        System.out.println("------------------");
        emp1.displayEmployeeInformation();
        System.out.println("---------");
        emp1.changeAddressInput();
        System.out.println("---------");
        emp1.displayEmployeeInformation();
    }


}
