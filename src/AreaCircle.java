public class AreaCircle {
    public  final  float PI= 3.14f;
    private float rad;
    public float area(){
        float a= PI*rad*rad;
        return a;
    }
    public void setRad(float rad){
        this.rad = rad;
    }

    public static void main(String[] args) {
        AreaCircle c= new AreaCircle();
        c.setRad(3.89f);
        float a= c.area();
        System.out.printf("dien tich hinh tron  ban kinh %f la %f: ",c.rad,a);
    }
}
