import java.util.Scanner;

public class SinhVien2Main {
    public static void main(String[] args) {
        int choice =0;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        SinhVien2[] sinhViens = new SinhVien2[30];

        do{
            System.out.println("lua chon theo huong dan duoi day");
            System.out.println("chon 1: them Sinh Vien");
            System.out.println("chon 2: hien thi thong tin sinh vien");
            System.out.println("chon 3: thay doi so dien thoai");
            System.out.println("chon 4: thoat ra");
            System.out.println("---------------");
            System.out.println("nhap lua chon cua ban");
            System.out.println("Nhap lua cho ? ");
            choice = scanner.nextInt();
            SinhVien2 sv = new SinhVien2();
            switch (choice){
                case 1: {
                    System.out.println("them sinh vien");
                    sv.addSinhVien();
                    sinhViens[count]=sv;
                    count++;
                    break;
                }
                case 2: {

                     for(int i = 0; i < sinhViens.length && i < count; i++){
                       SinhVien2 _sv = sinhViens[i];
                        System.out.println("thong tin sin h vien");
                        _sv.displaySinhVien();
                    }

                    break;
                }
                case  3: {
                    System.out.println("muon thay doi so dien thoai cua sinh vien ten gi");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    for(int i = 0; i <=sinhViens.length && i < count; i++) {
                        SinhVien2 _sv = sinhViens[i];
                        if (_sv.getName().equals(name)) {
                            System.out.println("SDT moi la gi ?");
                            String newphone = scanner.nextLine();
                            _sv.changephone(newphone);
                            break;
                        }
                    }
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
