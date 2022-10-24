import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        int favI = 0;
        double favD = 0;
        Scanner pipe = new Scanner(System.in);
        favI = SafeInput.getInt(pipe, "Enter your favorite integer");
        favD = SafeInput.getDouble(pipe, "Enter your favorite double");
        System.out.println("Your favorite integer is " + favI + " and your favorite double is " + favD);
    }
}