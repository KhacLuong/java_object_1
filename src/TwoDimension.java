public class TwoDimension {
    int [][] marks;
    public void storeMarks(){
        marks = new int[5][3];
        marks[0][0] =10;
        marks[0][1] =20;
        marks[0][2] =50;

        marks[1][0] =10;
        marks[1][1] =20;
        marks[1][2] =50;

        marks[2][0] =10;
        marks[2][1] =20;
        marks[2][2] =50;

        marks[3][0] =10;
        marks[3][1] =20;
        marks[3][2] =50;

        marks[4][0] =10;
        marks[4][1] =20;
        marks[4][2] =50;
    }
    public void displayMarks(){
//        System.out.println("Roll 1,mark 1: " + marks[0][0]);
//        System.out.println("Roll 1,mark 1: " + marks[0][1]);
//        System.out.println("Roll 1,mark 1: " + marks[0][2]);
        for(int i=0; i<marks.length; i++){
            for(int j=0; j<marks[i].length; j++){
                System.out.printf("Roll %d, mark %d: %d %n", i+1, j+1, marks[i][j]);
            }
            System.out.println();
        }

    }
    public void displayMarks_forEach() {
        for (int[] _mark : marks) {
            for (int k : _mark) {
                System.out.println(k);
            }
        }
    }
        public static void main(String[] args) {
            TwoDimension t = new TwoDimension();
            t.storeMarks();
            t.displayMarks();
        }
}
