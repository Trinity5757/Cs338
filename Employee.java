import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name = null, next = null, answer, name1;
        int idnum, search =0;
        boolean done = false, done2 = false, done3 = false;
        ArrayList<Integer> idnumlist = new ArrayList<Integer>(20);
        ArrayList<String> namelist = new ArrayList<String>(20);

        while (!done)
        {
            System.out.println("Input an ID number: ");
            idnum = kb.nextInt();
            idnumlist.add(idnum);
            System.out.println("Input a name: ");
            name = kb.next();
            namelist.add(name);
            System.out.print("More employees? (y/n) ");
            answer = kb.next();
            if (!(answer.equalsIgnoreCase("y")))
            {
                done = true;
            }
        }
        System.out.println("The list contains:");
        for (int i = 0; i < idnumlist.size(); i++)
        {
            System.out.println(idnumlist.get(i) + " " + namelist.get(i));
        }

        while (!done2)
        {
            System.out.println("Type the employee ID number and name to search");
            System.out.println("ID number: ");
            search = kb.nextInt();
            System.out.println("Name:");
            name1 = kb.next();
            System.out.print("Another search? (y/n) ");
            answer = kb.next();
            if (idnumlist.contains(search) && namelist.contains(name1))
            {

                System.out.println(search + " " + name1 + " is an employee");

            } else {

                System.out.println(search + " " + name1 + " is not an employee");

            }
            if (!(answer.equalsIgnoreCase("y")))
            {
                done2 = true;
            }
        }
        while (!done3)
        {
            System.out.println("Enter the ID number of employee to be fired: ");
            search = kb.nextInt();
            System.out.println("Enter their name: ");
            name1 = kb.next();
            if (idnumlist.removeAll(Collections.singleton(search)) && namelist.removeAll(Collections.singleton(name1)) )
            {
                System.out.println(search + " " + name1 + " has been fired. (Bye!)");
                System.out.println("The employee list contains:");
                for (int i = 0; i < idnumlist.size(); i++)
                {
                    System.out.println(idnumlist.get(i) + " " + namelist.get(i));
                }
            } else
            {
                System.out.println(search + " " + name1 + " does not exist in the system.");
            }
            System.out.print("Fire another? (y/n)");
            answer = kb.next();
            if (!(answer.equalsIgnoreCase("y")))
            {
                done3 = true;
            }
        }

        }
    }

