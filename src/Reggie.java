import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        boolean done = false;
        do {
            boolean menuDone = false;
            String ssn = SafeInput.getRegExString(pipe, "Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
            String mID = SafeInput.getRegExString(pipe, "Enter your bearcats M#", "(M|m)\\d{5}");
            do {
                String response = SafeInput.getRegExString(pipe, "[Open-Save-View-Quit]", "[OoSsVvQq]");
                switch (response) {
                    case "O", "o" -> menuDone = true;
                    case "S", "s" -> System.out.println("Data saved");
                    case "V", "v" -> System.out.println("Your ssn is " + ssn + ", and your bearcats M# is " + mID);
                    case "Q", "q" -> {
                        System.out.println("Goodbye!");
                        menuDone = true;
                        done = true;
                    }
                }
            }while (!menuDone);
        }while (!done);
    }
}
