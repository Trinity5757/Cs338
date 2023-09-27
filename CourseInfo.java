//Title: CourseInfo
//Abstract: The purpose of the program is to use an algorithm to calculate the grade point average of a student.
//Author: Trinity Stallworth
//Date: September 12, 2023

import java.util.Scanner;

public class CourseInfo
{
    private String courseTitle;
    private String instructor;
    private int enrollment;
    private int sum;
    private double average;

    public void printInfo()
    {
        System.out.println("Course title: " + courseTitle);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment: " + enrollment);
        System.out.printf("Average: %.2f\n", average);
        System.exit(1);
    }

    public void readInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter course title: ");
        courseTitle = keyboard.nextLine( );
        System.out.print("Enter instructor name: ");
        instructor = keyboard.nextLine( );
        System.out.print("Enter enrollment: ");
        enrollment = keyboard.nextInt( );
        for(int i = 0; i < enrollment; i++)
        {

            System.out.println("Enter a score:");
            int num = keyboard.nextInt();
            sum = sum + num;
            average = (double) sum /enrollment;

        }


    }
}