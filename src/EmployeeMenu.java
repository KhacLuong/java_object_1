import java.util.Scanner;

public class EmployeeMenu {

    public static void main(String[] args) {
        int choice;
        Employee2 epm1 =new Employee2();
        do{
            System.out.println("lua chon theo huong dan duoi day");
            System.out.println("chon 1: them nhan vien");
            System.out.println("chon 2: hien thi thong tin nhan vien");
            System.out.println("chon 3: thay doi dia chi");
            System.out.println("chon 4: thoat ra");
            System.out.println("---------------");
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap lua chon cua ban");
            choice =scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("them nhan vien");
                     epm1 = new Employee2();
                     epm1.addEmployee();
                     break;
                }
                case 2: {
                    System.out.println("hieb thi thong tin nhan vien");
                    epm1.displayEmployee();
                    break;
                }
                case  3:{
                    System.out.println(" thay doi dia chi");
                    epm1.changeAddress();
                    break;
                }
                case 4:{
                    System.out.println("thoat ra");
                    break;
                }
                default:{
                    System.out.println("chon sai, vui long chon lai tu 1-4");
                }
            }

        }while (choice!=4);
        System.out.println("ket thuc chuong trinh");
    }
}
