import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class SinhVien3main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien2[] sinhViens = new SinhVien2[30];
        int choice =0;
        int count =0;
        do {
            System.out.println("lua chon theo huong dan duoi day");
            System.out.println("chon 1: them Sinh Vien");
            System.out.println("chon 2: hien thi thong tin sinh vien");
            System.out.println("chon 3: thay doi so dien thoai");
            System.out.println("chon 4: thoat ra");
            System.out.println("---------------");
            System.out.println("nhap lua chon cua ban");
            choice = scanner.nextInt();
            SinhVien2 sv = new SinhVien2();
            switch (choice){
                case 1: {
                    System.out.println("them sinh vien moi");
                    sv.addSinhVien();
                    sinhViens[count] = sv;
                    count++;
                    break;
                }
                case 2:{
                    System.out.println(" thong tin  cac sinh vien");
                    for (int i=0; i<sinhViens.length && i< count; i++){
                        sinhViens[i].displaySinhVien();
                        System.out.println();
                    }
//                    for (SinhVien2 _sv: sinhViens) {
//                        _sv.displaySinhVien();
//                        System.out.println();
//                    }
                    break;

                }
                case 3:{
                    System.out.println("thay doi so dien thoai");
                    System.out.println("so dien thoai cua nguoi can thay doi");
                    scanner.nextLine();
                    String phone = scanner.nextLine();
                    for (int i=0; i<sinhViens.length && i< count; i++){
                        if(sinhViens[i].getPhone().equals(phone)){
                            System.out.println(" nhap so dien thoai moi");
                            String newphone = scanner.nextLine();
                            sinhViens[i].changephone(newphone);
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("ban da thoat ra");
                    break;
                }
                default:{
                    System.out.println("vui long chon tu 1-4, moi ban chon lai");
                    break;
                }
            }
        }while (choice!=4);
    }
}
