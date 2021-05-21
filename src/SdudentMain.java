import java.util.Scanner;

public class SdudentMain {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner scanner= new Scanner(System.in);
        int choice =0;
        int count =0;
        do {
            System.out.println("lua chon theo huong dan duoi day");
            System.out.println("chon 1: them 10 Sinh Vien");
            System.out.println("chon 2: hien thi ten va sdt cua sinh vien");
            System.out.println("chon 3: hien thi ten van nam sinh cua sinh vien co nam sinh >1995");
            System.out.println("chon 4: hien thi sinh vien nam co tuoi lon hon 1995");
            System.out.println("thoat ra");
            System.out.println("---------------");
            System.out.println("nhap lua chon cua ban");
            System.out.println("Nhap lua cho ? ");
            choice = scanner.nextInt();

            switch (choice){
                case 1: {
                    System.out.println(" them 3 sinh vien");
                    for(int i=0; i<3; i++){
                        System.out.println();
                        System.out.printf("nhap thong tin sinh vien thu %d",i+1);
                        Student st = new Student();
                        st.addStudent();
                        students[i] =st;
                    }
                    break;
                }
                case 2:{
                    System.out.println(" ten va sdt cua sinh vien");
                    for (Student sv: students) {
                        sv.disNameAndPhone();
                        System.out.println();
                    }
                    break;
                }
                case 3:{
                    System.out.println(" ten va nam sinh cua sinh vien sau nam 1993");
                    for (Student sv:students) {
                        if(sv.getBirth_years()>1993){
                            sv.disNameAndbirth_years();
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("cac sinh vien nam sinh sau nam 1995");
                    for(Student sv:students){
                        if(sv.getBirth_years()>1995 && sv.getGender()=="M"){
                            sv.disNameAndPhone();
                        }
                    }
                    break;
                }
                case 5:{
                    System.out.println("ban da thoat ra");
                }
                default:{
                    System.out.println(" vui long chon tu 1-5, moi ban chon lai");
                }
            }


        }while (choice !=5);

    }
}
