package regnos.chapter14;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example1 {
    public static void main(String[] args) {
//        byte[] bytes = {66, 97,100};
//        String s = new String(bytes);
//        System.out.println(s);
        int[] array1={10,12,3,4};
        //System.out.println(Arrays.toString(reverse(array1)));
       // builder();
        var date= "12/04/1990";
        //convert(date);
        regexLearn();
    }
      public static void regexLearn(){
//        String f = "This s**t is f****d up";
//        System.out.println(f.replaceAll("\\*", "^"));
//        System.out.println(f.replaceFirst("\\w+", "Bull"));
        String password= "ljhy6j";
        System.out.println(password.matches("([[a-zA-Z]+[A-Z]+][0-9]+){2,}"));
          System.out.println(password.matches("\\D&&[^\\w][A-Za-z0-9]+"));
          Pattern pattern = Pattern.compile("[[a-zA-Z]+[A-Z]+[0-9]+]{8,15}");
        Matcher matcher= pattern.matcher(password);
        System.out.println(matcher.matches());
    }
    public static int[] reverse(int[] array1){
        int[] arr = new int[array1.length];
        int k=0;
        for(int i= array1.length-1;i>=0;i--){
            arr[k]=array1[i];
            k++;
        }
        return arr;
    }
    public static void builder(){
       StringBuilder b = new StringBuilder(5);
       b.append("Tinuade Jones");
        System.out.println(b);
        System.out.println(b.length());
        System.out.println(b.capacity());
    }
    public static void convert(String date){
        var result= date.split("/");
        switch (result[1]) {
            case "01" -> System.out.println(result[0] + " January," + result[2]);
            case "02" -> System.out.println(result[0] + " February," + result[2]);
            case "03" -> System.out.println(result[0] + " March," + result[2]);
            case "04" -> System.out.println(result[0] + " April," + result[2]);
            case "05" -> System.out.println(result[0] + " May," + result[2]);
            case "06" -> System.out.println(result[0] + " June," + result[2]);
            case "07" -> System.out.println(result[0] + " July," + result[2]);
            case "08" -> System.out.println(result[0] + " August," + result[2]);
            case "09" -> System.out.println(result[0] + " September," + result[2]);
            case "10" -> System.out.println(result[0] + " October," + result[2]);
            case "11" -> System.out.println(result[0] + " November," + result[2]);
            case "12" -> System.out.println(result[0] + " December," + result[2]);
            default -> System.out.println("Not Applicable");
        }
    }


    private static void stringPalindrome() {
        String first ="reader";
        String f= "";
        for(int i=first.length()-1;i>=0;i-- ){
            f+=(first.charAt(i));
        }
        if(f.equals(first)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
