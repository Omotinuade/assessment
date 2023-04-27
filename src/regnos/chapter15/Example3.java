package regnos.chapter15;

import utils.AppUtils;

import java.io.*;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
       //fileInputTest();
       //fileOutputLearn();
       //objectInputStream();
        //objectOutputStream();
        //fileReader();
        //fileWriter();
        //fileInputTestToPC();
        //bufferedReader();
        bufferedWriter();
    }
    public static void fileInputTest(){
        try(FileInputStream file =
                    new FileInputStream(AppUtils.ASSET_LOCATION+"\\file.txt")){
            var b=file.readAllBytes();
            System.out.println(Arrays.toString(b));
            for (var word:b) {
                System.out.print(Character.toString(word));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void fileOutputLearn(){
        try(FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\Tinuade\\IdeaProjects\\java_classes\\src\\regnos\\chapter15\\fileOutput.txt")) {
            byte[] bytes= {87, 104, 111, 32, 103, 111, 101, 115, 32, 116, 104, 101, 114, 101, 33};
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void objectOutputStream(){
        try(ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("dog"))){
            outputStream.writeObject(new Dog("Busky", 2));
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void objectInputStream(){
        try(ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("C:\\Users\\Tinuade\\IdeaProjects\\java_classes\\dog"))){
           Dog breed= (Dog)inputStream.readObject();
            System.out.println(breed.toString());
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void fileReader(){
        char[] chars= new char[16];
        try(FileReader reader=new FileReader("C:\\Users\\Tinuade\\IdeaProjects\\java_classes\\src\\regnos\\chapter15\\file.txt")){
            var f=reader.read(chars);
            System.out.println(f);
            System.out.println(Arrays.toString(chars));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileWriter(){
        try(FileWriter writer = new FileWriter("C:\\Users\\Tinuade\\IdeaProjects\\java_classes\\src\\regnos\\chapter15\\file.txt", true)){
            writer.append("Hello, Its Me!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void fileInputTestToPC(){
        try(FileOutputStream file =
                    new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\1\\file.txt")){
            byte[] bytes= {87, 104, 111, 32, 103, 111, 101, 115, 32, 116, 104, 101, 114, 101, 33};
            file.write(bytes);
            //172.16.0.6.1
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void bufferedReader(){
        try(InputStreamReader reader= new InputStreamReader(System.in);
        BufferedReader bufferedReader= new BufferedReader(reader);
        FileWriter writer = new FileWriter(AppUtils.ASSET_LOCATION+"\\file.txt", true)){
           String input= bufferedReader.readLine();
           writer.write(input);

        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
    }
    public static void bufferedWriter(){
        String[] words = {"THIS", "DOCS", "REPRESENT", "SEMICOLON"};
        try{OutputStreamWriter writer= new OutputStreamWriter(new FileOutputStream(AppUtils.ASSET_LOCATION+"\\file.txt"));
            BufferedWriter bufferedWriter= new BufferedWriter(writer);
            bufferedWriter.write(words[0]+" "+ words[1]);
            bufferedWriter.flush();
            bufferedWriter.write(words[3]);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
