/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Entities.Student;
import java.util.Scanner;

/**
 *
 * @author Ntokozo
 */
public class MyFriends 
{
    private Student[] studentArray;
    int size = 0;
    
    public void fillArray()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many students would you like to enter?: ");
            size = sc.nextInt();
            
            if(size>0)
            {
                for(int i = 0; i<size; i++)
                {
                    Scanner scLine = new Scanner(System.in);
                    System.out.println("Enter:\nStudent name: ");
                    String studentName = scLine.nextLine();
                    System.out.println("\nStudent no.: ");
                    int studentNumber = scLine.nextInt();
                    System.out.println("\nRegistration year: ");
                    long regYear = scLine.nextLong();
                    System.out.println("\nFaculty: ");
                    String faculty = scLine.nextLine();
                    System.out.println("\nDepartment: ");
                    String department = scLine.nextLine();
                    
                    Student friendInput = new Student(studentName, studentNumber, regYear, faculty, department);
                    studentArray[i] = friendInput;
                    
                    i++;
                }
            }
            else
            {
                System.out.println("Error! Enter a valid input.");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error occured!!!");
        }
    }
    
    public static void main(String[] args)
    {
        MyFriends friendArray = new MyFriends();
        friendArray.fillArray();
        int comSci = 0;
        
        for (int i=0;i<friendArray.studentArray.length;i++)
        {
            if (friendArray.studentArray[i].getDepartment().equalsIgnoreCase("Computer Science"))
            {
                comSci++;
            }
        }
        System.out.println("Number of Computer Science Students you are friends with: " + comSci);

        if (comSci>=(friendArray.studentArray.length/2))
        {
            System.out.println("You... need more friends...");
        }
        else
        {
            System.out.println("Nice, diversity is good");
        }
    }
}
