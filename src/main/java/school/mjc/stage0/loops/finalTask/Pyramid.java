package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String str;
        int num;
        String regex = ".*\\d.*";

        for (int i = 0; i < cathetusLength; i++) {
            str = "";
            num = i + 1;

            for (int j = 1; j < cathetusLength * 2; j++) {
                if (j >= cathetusLength - i && j <= cathetusLength + i) {
                    str = str + num;
                    num = j >= cathetusLength ? num + 1 : num - 1;
                } else if (!str.matches(regex)) {
                    str = str + " ";
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
