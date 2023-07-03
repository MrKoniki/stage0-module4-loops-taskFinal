package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String side = "";

        for(int i = 1; i < cathetusLength + 1; i++) {
            side = "";
            for(int j = 1; j < cathetusLength + 1; j++) {
                if (j > cathetusLength - i) {
                    side = side + "*";
                } else {
                    side = side + " ";
                }
            }
            System.out.println(side);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
