package bulaklak_week3_advances;
import java.util.Scanner;
public class BULAKLAK_WEEK3_ADVANCES {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        String flowercorrectUser = "Bulaklak";
        String flowercorrectPass = "DIT2-7";
        boolean flowerAcc = true;

        System.out.print("Enter username: ");
        String flowerUser = sc.nextLine();

        if (flowerUser.equals(flowercorrectUser)) {
            System.out.print("Enter password: ");
            String flowerPass = sc.nextLine();

            if (flowerPass.equals(flowercorrectPass)) {
                if (flowerAcc) {
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Account is locked.");
                }
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Incorrect username.");
        }

        sc.close();
    }
    
}
