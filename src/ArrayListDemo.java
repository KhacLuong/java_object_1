import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(100);
        marks.add(30);
        marks.add(70);
        for(int i =0; i<marks.size(); i++){
            int value = (int)marks.get(i);
            System.out.printf("gia tri thu %d la: %d %n",i+1,value);
        }
        marks.remove(1);
        System.out.println("=================");
        for(int i =0; i<marks.size(); i++){
            int value = (int)marks.get(i);
            System.out.printf("gia tri thu %d la: %d %n",i+1,value);
        }
    }
}
