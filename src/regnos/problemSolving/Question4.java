package regnos.problemSolving;

public class Question4 {
    public static void main(String[] args) {
        String word = "VENTURES";
        for(int i=0; i < word.length(); i=i+2){
            System.out.println(word.substring(i, i+2));
        }
    }
}
