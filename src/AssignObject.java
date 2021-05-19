public class AssignObject {
    public static void main(String[] args) {
     Employee2 emp2 = new Employee2();
     emp2.setName("nam ha");
     Employee2 emp3 = new Employee2();
     emp3 = emp2;
     emp2.setName(" nguyen le");
        emp3.setName(" nguyen nam");
        System.out.println("name Emp2:" + emp2.getName());
        System.out.println("name Emp3:" + emp3.getName());
    }
}
