//Title: GameCar
//Abstract: The purpose of the program is to use an algorithm to compare two racing cars. One of which is decided by user input.
//Author: Trinity Stallworth
//Date: September 12, 2023

import java.util.Scanner;

public class GameCar
{

    private String name;
    private  String color;
    private int distance;

    public GameCar()
    {
    }

    public GameCar(String myBuddy, String red, int i)
    {
        this.name = myBuddy;
        this.color = red;
        this.distance = i;

    }

    public void moveForward(int i)
    {

        distance += i;
    }

    public void moveBackward(int i)
    {


        distance -= i;
    }


    public void getCarInfo() //print everything
    {
        Scanner shut = new Scanner(System.in);
        System.out.println("Enter the car name: ");
        name = shut.next();
        System.out.println("Enter the color: ");
        color = shut.next();
        System.out.println("Enter the starting position: ");
        distance = shut.nextInt();
    }

    public void race(GameCar car2)
    {
       if (car2.distance > distance )
       {
           System.out.println(car2.name + " Win: " + name + " (" + distance + ") vs. " + car2.name + " (" +car2.distance + ")");
       }
       else if (car2.distance < distance)
       {
           System.out.println(name + " Win: " + name + " (" + distance + ") vs. " + car2.name + " (" +car2.distance + ")");
       }
       else
        {
            System.out.println("Tie: " + name + " (" + distance + ") vs. " + name + " (" + distance + ")");
        }
    }

    public boolean equals(GameCar car2)
    {
       if (name.equals(car2.name) && (color.equals(car2.color)) && distance == car2.distance)
       {
           return true;
       }
       return false;
    }

    public void setColor(String Carcolor)
    {
        color = Carcolor;
    }

    public void setCar(String CarName, String Carcolor, int CarDistance)
    {

        name = CarName;
        color = Carcolor;
        distance = CarDistance;
    }
}