import java.util.Scanner;

public class Employeee {

        String employeeName;
        String employeeAddress;
        String employeePhone;
        int employeeBirthday;
        int employeeJoinYear;
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

//            System.out.println("nhap Thong tin Nhan vien");
//            emp1.input();
//            System.out.println("Thong tin Nhan vien");
//            emp1.displayEmployeeInformation();
//            System.out.println("------------------");
//            System.out.println("sua doi dia chi");
//            emp1.changeAddress("HCM");
//            System.out.println("------------------");
//            emp1.displayEmployeeInformation();
//            System.out.println("---------");
//            emp1.changeAddressInput();
//            System.out.println("---------");
//            emp1.displayEmployeeInformation();

            do{
                Employeee emp = new Employeee();
                Scanner scanner = new Scanner(System.in);
                System.out.println("ban lua chon theo huong dan duoi day");
                System.out.println("chon 1: de them nhan vien");
                System.out.println("chon 2: de xem thong tin nhan vien");
                System.out.println("chon 3: de thay doi dia chi nhan vien");
                System.out.println("chon 4: de thoat ra ngoai");
                System.out.println();
                int choice = scanner.nextInt();

                switch(choice){
                    case 1:{
                        System.out.println("them nhan vien");
                        emp.input();
                        System.out.println("Thong tin Nhan vien ban vua nhap");
                        emp.displayEmployeeInformation();
                        break;
                    }
                    case 2:{
                        System.out.println("Thong tin Nhan vien");
                        emp.displayEmployeeInformation();
                        break;
                    }
                    case 3:{
                        System.out.println("thay doi dia chi nhan vien");
                        emp.changeAddressInput();
                        System.out.println("Thong tin Nhan vien sau khi thay doi dia chi");
                        emp.displayEmployeeInformation();
                        break;
                    }
                    case 4:{
                        break;
                    }
                    default:{
                        System.out.println("ban lua chon chua dung, moi ban thuc hien lai");
                                break;
                    }
                }
                if(choice==4){
                    System.out.println("ban da thoat ra");
                    break;
                }else {
                    System.out.println("chon 0 de ket thuc");
                    System.out.println("chon 1 de thuc hien tiep");
                    int choice2 = scanner.nextInt();
                    if(choice2==0){
                        System.out.println("ban da thoat ra");
                        break;
                    }else {

                    }
                }

            }while(true);

        }
}
