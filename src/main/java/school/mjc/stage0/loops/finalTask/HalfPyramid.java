package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int whiteSpaceRepeat = cathetusLength-1;
        for(int i=1; i<=cathetusLength; i++){
            System.out.println(" ".repeat(whiteSpaceRepeat)+"*".repeat(i));
            whiteSpaceRepeat--;
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
