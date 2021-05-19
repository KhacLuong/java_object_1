public class Calculator2 {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }


    public float div(int a, int b) {
        return (float)a / b;
    }

    public int changeValue(Employee2 emp){
        emp.setName("new name");
        System.out.println("name:" + emp.getName());
        return 0;
    }
    public int changeValue(int a) {
        a = a + 20;
        System.out.println("a = " + a);
        return a;
    }


    public static void main(String[] args) {
        Calculator2 c = new Calculator2();
        int num1 = 10;
        int num2 = 15;
        int add = c.add(num1, num2);
        int sub = c.sub(num1, num2);
        int mul = c.mul(num1, num2);
        float div = c.div(num1, num2);
        System.out.printf(" add : %d\n", add);
        System.out.printf(" sub : %d\n", sub);
        System.out.printf(" mul : %d\n", mul);
        System.out.printf(" div : %f\n", div);

        Employee2 emp1 = new Employee2();
        emp1.setName("name 1");
        System.out.println("name 1: " + emp1.getName());
        c.changeValue(emp1);
        System.out.println("name 1 = " + emp1.getName());

        System.out.println("-------------");
        c.changeValue(num1);



    }
}
