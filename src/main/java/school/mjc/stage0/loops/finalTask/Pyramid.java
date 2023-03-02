package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int whiteSpaceRepeat = cathetusLength-1;
        String prevNums = "";
        for(int i=1; i<=cathetusLength; i++){
            if(prevNums==""){
                System.out.println(" ".repeat(whiteSpaceRepeat)+i+" ".repeat(whiteSpaceRepeat));
                prevNums="1";
            }
            else{
                System.out.println(" ".repeat(whiteSpaceRepeat)+i+prevNums+i+" ".repeat(whiteSpaceRepeat));
                prevNums = i+prevNums+i;
            }
            whiteSpaceRepeat--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(4);
    }
}
