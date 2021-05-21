import java.util.Scanner;

public class SinhVien {
    private String name;
    private int age;
    private String address;
    private int birth_years;
    private String gender;
    private String phone;
    private  String facebook_link;

    public void addSinhVien(){
        Scanner scanner = new Scanner(System.in);
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
    public void  changephone(){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter new phone_number");
        this.phone = scanner.nextLine();
    }
//    void addStudent(){
//    }

    public static void main(String[] args) {
        int choice;
        SinhVien Sv1 = new SinhVien();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("lua chon theo huong dan duoi day");
            System.out.println("chon 1: them Sinh Vien");
            System.out.println("chon 2: hien thi thong tin sinh vien");
            System.out.println("chon 3: thay doi so dien thoai");
            System.out.println("chon 4: thoat ra");
            System.out.println("---------------");

            System.out.println("nhap lua chon cua ban");
            choice =scanner.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("them sinh vien");
                    Sv1 = new SinhVien();
                    Sv1.addSinhVien();
                    break;
                }
                case 2: {
                    System.out.println("hieb thi thong tin sinh vien");
                    Sv1.displaySinhVien();
                    break;
                }
                case  3:{
                    System.out.println(" thay so dien thoai");
                    Sv1.changephone();
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
