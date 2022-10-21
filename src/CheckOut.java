import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double totalCost = 0;
        boolean moreItems = false;

        do
        {
            itemCost = SafeInput.getRangedDouble(in, "What is the price of your item?", 0.50, 9.99);
            totalCost += itemCost;

            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");

        }while(moreItems == true);

        System.out.printf("Your total cost is: " + "%.2f", totalCost);
    }
}
