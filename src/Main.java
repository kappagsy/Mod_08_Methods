import java.util.Scanner;
public class Main
{
    //Class variables go here and are visible to the methods below main

    public static void main(String[] args) //public means it is accessible
    {
        Scanner console = new Scanner (System.in);
        sayHello(); //Prints Hello one time
        System.out.println("\n spacer \n");
        sayHello(10);
        sayMsg("LIFE IS AMAZING!", 35);

       int myFav = getRangedInt(console, "Enter your favorite integer", 1, 100);
       int myFavDoubled = doubleIt(myFav);
       System.out.println("Doubled is: " + myFavDoubled);

       int year = getInt(console, "Enter your year of birth");
        System.out.println("You said the year is: " + year);



    }

  // User defined methods go here and are static
    public static void sayHello()
    {
        System.out.println("Hello");  // first line is called method signature
    }

    public static void sayHello(int times)
    {
        for(int rep=0; rep < times; rep++)
        {
            System.out.println("Hello");
        }
    }
    public static void sayMsg(String msg, int times)
    {
        for(int rep=0; rep < times; rep++)
        {
            System.out.println(msg);
        }
    }

    public static int doubleIt(int toBeDoubled)
    {
        int doubledVal = toBeDoubled * 2;
        return doubledVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = low - 1;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said the value is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your the value is " + retVal + " but that is out of range [" + low + " - " + high +"]");
                }
            }
                else
                {
                    trash = pipe.nextLine();
                    System.out.println("You must enter an integer not " + trash);
                }

        } while(!done);

        return retVal;
    }


    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }

        } while(!done);

        return retVal;
    }
}