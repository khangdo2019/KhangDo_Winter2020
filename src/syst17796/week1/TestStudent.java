/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796.week1;
import java.util.Scanner;
/**
 * A class that creates an array of Students, iterate over the array and prints
 * each student's name and ID
 * @author Admin
 */
public class TestStudent {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to input the number of student
        /*
        System.out.print("Please input the number of students: ");
        int num = input.nextInt();
        */
        Student[] studentList = new Student[5];
        
        //Make up 5 students to put inside
        studentList[0] = new Student("Superman", "007");
        studentList[1] = new Student("Batman", "100");
        studentList[2] = new Student("Wonder woman", "420");
        studentList[3] = new Student("James Bond", "100");
        studentList[4] = new Student("Joker", "200");
        
        //Print their names
        for(Student s: studentList){
            System.out.println(s.getName());
        }
    }
}
