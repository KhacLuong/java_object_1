public class OneDimension {
    int[] marks;
    public void storeMarks(){
        marks = new int[4];
        marks[0]=40;
        marks[1]=20;
        marks[2]=60;
        marks[3]=80;
    }
    public void displayMarks(){
//        System.out.println("Roll 1,mark : " + marks[0]);
//        System.out.println("Roll 2,mark : " + marks[1]);
//        System.out.println("Roll 3,mark : " + marks[2]);
//        System.out.println("Roll 4,mark : " + marks[3]);

        int n =marks.length;
        for(int i =0; i<n; i++){
            System.out.println("Mark" + i+ ":" + marks[i]);
        }
        int j=0;
        while (j< marks.length){
            System.out.println("Mark" + j+ ":" + marks[j]);
            j++;
        }

        for(int k:marks){
            System.out.println("Mark: "+k);
        }
    }
    public void displayMarks_While(){
//
        int j=0;
        while (j< marks.length){
            System.out.println("Mark" + j+ ":" + marks[j]);
            j++;
        }

    }
    public void displayMarks_forEach(){
        for(int k:marks){
            System.out.println("Mark: "+k);
        }
    }

    public static void main(String[] args) {
        OneDimension o = new OneDimension();
        o.storeMarks();
        o.displayMarks();

    }
}
