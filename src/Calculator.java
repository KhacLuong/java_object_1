public class Calculator {
    public int add(int num1, int num2){
       return num1+num2;

    }
    public int sub(int num1, int num2){
        return  num1-num2;

    }
    public int mul(int num1, int num2){
        return  num1*num2;

    }
    public float div(int num1, int num2){
        return (float)num1/num2;

    }


    public static void main(String[] args) {
        Calculator c = new Calculator();
        int add = c.add(10, 12);
        int sub = c.sub(10,20);
        int mul = c.mul(10,20);
        float div= c.div(10,20);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

    }
}
