/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package syst17796.week1;

/**
 *
 * @author Admin
 */
public class ParttimeStudent extends Student{
    
    private double wage;
    
    /**
     * Creates name for student 
     * @return the name
     */    
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Sets name for students
     * @param givenName the name to set
     */
    @Override
    public void setName(String givenName) {
        super.setName(givenName);
    }

    /**
     * @return the studentID
     */
    @Override
    public String getStudentID() {
        return super.getStudentID();
    }
    
    /**
     * @param studentID the studentID to set
     */
    @Override
    public void setStudentID(String studentID) {
        super.setStudentID(studentID);
    }

    /**
     * @return the wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    
}
