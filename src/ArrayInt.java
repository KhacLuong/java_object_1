import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInt {
    int a;
    Scanner scanner =new Scanner(System.in);
    public void enterValue(int  arr[],int n){
       for (int i=0; i<n; i++) {
           int a;
           System.out.printf("nhap gia tri thu %d:",i+1);
          a =  scanner.nextInt();
          arr[i]=a;
       }
    }
    public int sumArr(int[] arr){
        int sum =0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
    public int subArr(int[] arr){
        int sub =arr[0];
        for(int i=1; i<arr.length; i++){
            sub-=arr[i];
        }
        return sub;
    }
    public int mulArr(int[] arr){
        int mul =1;
        for(int a:arr){
            mul*=a;
        }
        return mul;
    }
    public float divArr(int[] arr){
        float div =arr[0];
        for(int i=1; i<arr.length;i++){
            div/=(float)arr[i];
        }
        return div;
    }

    public static void main(String[] args) {
        ArrayInt c=new ArrayInt();
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap du lieu cho mang");
        System.out.println("nhap so luong  phan tu trong mang:\n n=");
        n = scanner.nextInt();
        System.out.println("nhap lan luot cac phan tu trong mang");
        int[] arr= new int[n];
        c.enterValue(arr,n);
        System.out.println();
        int sum = c.sumArr(arr);
        System.out.printf("tong cua mang ban  vua nhap: %d",sum);
        System.out.println();
        int sub = c.subArr(arr);
        System.out.printf("hieu cua mang ban  vua nhap: %d",sub);
        System.out.println();
        int mul = c.mulArr(arr);
        System.out.printf("tich cua mang ban  vua nhap: %d",mul);
        System.out.println();
        float div = c.divArr(arr);
        System.out.printf("thuong cua mang ban  vua nhap: %f", div);
    }

}
