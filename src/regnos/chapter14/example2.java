package regnos.chapter14;

public class example2 {
    public static void main(String[] args) {
        char[] chars = {66, 97, 100};

        String s = new String(chars);
        System.out.println(s);
        String d = "Deer";
        String z= "derr";
        d.compareTo("dear");
        z.indexOf('r');
        d.substring(1, 2);
        System.out.println(d.replace('D', 'B'));

    }


}
