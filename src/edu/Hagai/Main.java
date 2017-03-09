package edu.Hagai;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



	// write your code here
//        Date today = new Date();
//        System.out.println(today);
//
//        //instant a student
//        Student moshe = new Student();
//
//        //use a student method
//        moshe.print();
//
//        //instantiate a scanner
//        Scanner s = new Scanner(System.in);
//
//        //use the scanner method
//        s.nextInt();
        System.out.println();





                // instantiate a student:
                Student moshe = new Student(
                        "Moshe", "Doe", "03030405055",
                        "Moshe@gmail.com", "050-7123012", "Mesharerim 4"
                );

                moshe.print();

//                Student s = new Student();
//                s.print();

                // moshe.print();
        moshe.sayYourName();

        //this is a list of students
        ArrayList <Student>  studentList = new ArrayList<>();

        //add an item to the list
        studentList.add(moshe);
        studentList.add(new Student());

        //get item from the list
        int listSize = studentList.size();

        for (int i = 0; i < studentList.size() ; i++) {
            Student s = studentList.get(i);
            s.print();

        }



        //what is the size of the list
        studentList.size();

        //remove an item from the list
        studentList.remove(moshe);
        //remove by index
        studentList.remove(0);








            }
}
