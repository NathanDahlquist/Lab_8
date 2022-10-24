import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        boolean done = false;
        double totalCost = 0;

        do{
            totalCost = totalCost + SafeInput.getRangedDouble(pipe,"Enter the price of the item",0.50,9.99);
            done = SafeInput.getYNConfirm(pipe,"Would you like to continue? [Y/N]");
        }while(!done);
        System.out.printf("The total price of the purchase is $%.2f%n", totalCost);
    }
}
