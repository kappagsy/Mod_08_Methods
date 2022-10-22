import java.util.Scanner;
public class Main
{
    //Class variables go here and are visible to the methods below main

    public static void main(String[] args) //public means it is accessible
    {
        Scanner in = new Scanner(System.in);

       // int favNum = SafeInput.getRangedInt(in, "Enter your fav num ", 1, 10);
       // int anyInt = getInt(in, "Enter an int");
        // double salary = getDouble(in, "Enter your salary");
        //System.out.println("You said your salary was: " + salary);
        //double tax = getRangedDouble(in, "Enter your tax ", 100, 10000);
        //System.out.println("You said your tax was " + tax);
        String msg = getNonZeroLength(in, "Enter any string other than zero length ");
        System.out.println("Msg is " + msg);

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

        String ssn = SafeInput.getRegExString(console, "Enter your SSN ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You SSN is: " + ssn);
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

    /**
     * Get an integer value within a specified range of low-high
     *
     * @param pipe Scanner to use for console input
     * @param prompt String that tells the user what to input
     * @param low Low value for a range low-high
     * @param high High value for a range low-high
     * @return On int within the low-high range, only have this if you have a non-void function
     */
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

    /**
     * Use Scanner to get an int from the console with no constraints
     *
     * @param pipe Scanner to use for console input
     * @param prompt String prompt to tell the user what to input
     * @return an integer value
     */
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
            else //don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }

        } while(!done);

        return retVal;
    }

    /**
     * Use Scanner to get a double from the console with no constraints
     *
     * @param pipe Scanner to use for console input
     * @param prompt String prompt to tell the user what to input
     * @return a double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else //don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double not " + trash);
            }

        } while(!done);

        return retVal;
    }

    /**
     * Get an integer value within a specified range of low-high
     *
     * @param pipe Scanner to use for console input
     * @param prompt String that tells the user what to input
     * @param low Low value for a range low-high
     * @param high High value for a range low-high
     * @return On int within the low-high range, only have this if you have a non-void function
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = low - 1;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said the value is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said the value is " + retVal + " but that is out of range [" + low + " - " + high +"]");
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

    /**
     * Get an arbitrary String of at least one character in length
     *
     * @param pipe Scanner to use for input
     * @param prompt Message for user about what to input
     * @return Returns a String entered by user of at least one character
     */
    public static String getNonZeroLength(Scanner pipe, String prompt)
    {
            String retVal = "";
            boolean done = false;

            do
            {
                System.out.print(prompt + ": ");
                retVal = pipe.nextLine();
                if(retVal.length()>0)
                {
                    done = true;
                }
                else //don't have an int
                {
                    System.out.println("You must enter at least one character ");
                }

            } while(!done);

            return retVal;
    }

    /**
     *
     * @param pipe
     * @param prompt
     * @return
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
     String respYN="";
      boolean retVal = false;
      boolean done = false;

      do
      {
          System.out.print(prompt + "[Y/N]: ");
          respYN = pipe.nextLine();

          if(respYN.equalsIgnoreCase("Y"))
          {
              retVal = true;
              done = true;
          }
          else if (respYN.equalsIgnoreCase("N"))
          {
             retVal = false;
             done = true;
          }
          else
          {
              System.out.println("You must enter [Y/N]: ");
          }
      }while(!done);

      return retVal;

    }

    /**
     *
     * @param pipe Scanner to use for input
     * @param prompt Message for user about what to input
     * @return Returns the String entered by user centered in the "Pretty Header"
     */
    public static String prettyHeader(Scanner pipe, String prompt)
    {
        String retVal = "";
        boolean done = false;

        System.out.print(prompt + ": ");
        retVal = pipe.nextLine();

        for (int x=1; x<=60; x++)
        {
            for (int c=1; c<=2; c++)
            {
                System.out.print("*");
            }
        }
        System.out.println();


        return retVal;

    }
}
