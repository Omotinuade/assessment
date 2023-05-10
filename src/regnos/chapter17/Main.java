package regnos.chapter17;

import regnos.chapter17.functionalInterface.consumerSample.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Zainab", 20);
        Student student2 = new Student("Sam", 25);
        Student student3 = new Student("nike", 15);
        Student student4 = new Student("Tinuade", 20);
        Student student5 = new Student("Michael", 27);

//        Comparator<Student>comparator = (s1, s2)-> {
//            if(s1.getAge() < s2.getAge()) return 1;
//            else if (s2.getAge() < s1.getAge()) return -1;
//            else if(s1.getAge()== s2.getAge()){
//               if(s1.getName().compareTo(s2.getName())> 0) {
//                   return 1;
//               }
//               else {
//                   return -1;
//               }
//            }
//            return 0;
//        };

        Comparator<Student> studentComparator = Comparator.comparingInt(Student::getAge).thenComparing(Student::getName);

        Comparator<Student> comparator = (s1,s2)-> s1.getAge()- s2.getAge();

        List<Student> students =new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.sort(studentComparator);

        System.out.println(students);


    }
}
