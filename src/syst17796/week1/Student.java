/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796.week1;

/**
 * A class to model students. Students can study. They have a name and ID
 * @author Khang 2020
 */
public class Student {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    private String name;
    private String studentID;
    
    public Student(String givenName, String studentID){
        name = givenName;
        this.studentID = studentID;
    }
    
    /**
     * a method that returns true if a student studied and false otherwise.
     * @return students did study or not.
     */
    public boolean didStudy(){
        return true;
    }
    
    
}
