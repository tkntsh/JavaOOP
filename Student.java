/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Ntokozo
 */
public class Student 
{
    private String studentName;
    private int studentNumber;
    private long regYear;
    private String faculty;
    private String department;

    public Student(String studentName, int studentNumber, long regYear, String faculty, String department) 
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.regYear = regYear;
        this.faculty = faculty;
        this.department = department;
    }

    public String getStudentName() 
    {
        return studentName;
    }

    public int getStudentNumber() 
    {
        return studentNumber;
    }

    public long getRegYear() 
    {
        return regYear;
    }

    public String getFaculty() 
    {
        return faculty;
    }

    public String getDepartment() 
    {
        return department;
    }

    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public void setStudentNumber(int studentNumber) 
    {
        this.studentNumber = studentNumber;
    }

    public void setRegYear(long regYear) 
    {
        this.regYear = regYear;
    }

    public void setFaculty(String faculty) 
    {
        this.faculty = faculty;
    }

    public void setDepartment(String department) 
    {
        this.department = department;
    }

    @Override
    public String toString() 
    {
        return "Student{" + "studentName=" + studentName 
                + ", studentNumber=" + studentNumber 
                + ", faculty=" + faculty + '}';
    }
}
