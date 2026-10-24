package bulaklak_week3_expert;
import java.util.Scanner;
public class BULAKLAK_WEEK3_EXPERT {
    public static void main(String[] args) {
        Scanner flower = new Scanner(System.in);

        String flowerCorrectUser = "Bulaklak";
        String flowerCorrectPin = "2026";

        System.out.print("Enter username: ");
        String flowerUser = flower.nextLine();

        System.out.print("Enter 4-digit PIN: ");
        String flowerPin = flower.nextLine();

        if (flowerUser.equals(flowerCorrectUser)) {
            if (flowerPin.equals(flowerCorrectPin)) {

                System.out.print("Enter account balance: ");
                double flowerBalance = flower.nextDouble();

                String flowerTier;
                double flowerDailyLimit;

                if (flowerBalance < 10000) {
                    flowerTier = "Bronze";
                    flowerDailyLimit = 5000;
                } else if (flowerBalance < 50000) {
                    flowerTier = "Silver";
                    flowerDailyLimit = 10000;
                } else if (flowerBalance < 100000) {
                    flowerTier = "Gold";
                    flowerDailyLimit = 25000;
                } else {
                    flowerTier = "Platinum";
                    flowerDailyLimit = 50000;
                }

                System.out.println("Account Tier: " + flowerTier);

                System.out.print("Enter withdrawal amount: ");
                double flowerWithdrawal = flower.nextDouble();

                double flowerFeeRate;

                switch (flowerTier) {
                    case "Bronze":
                        flowerFeeRate = 0.02;
                        break;
                    case "Silver":
                        flowerFeeRate = 0.015;
                        break;
                    case "Gold":
                        flowerFeeRate = 0.01;
                        break;
                    default:
                        flowerFeeRate = 0.005;
                        break;
                }

                double flowerFee = flowerWithdrawal * flowerFeeRate;
                double flowerTotal = flowerWithdrawal + flowerFee;

                if (flowerWithdrawal <= 0) {
                    System.out.println("DENIED: Invalid withdrawal amount.");
                } else if (flowerWithdrawal > flowerDailyLimit) {
                    System.out.println("DENIED: Daily withdrawal limit exceeded.");
                } else {
                    if (flowerTotal <= flowerBalance) {
                        System.out.println("APPROVED");
                        System.out.println("Withdrawal: " + flowerWithdrawal);
                        System.out.println("Transaction Fee: " + flowerFee);
                        System.out.println("Total Deduction: " + flowerTotal);
                        System.out.println("Remaining Balance: " + (flowerBalance - flowerTotal));
                    } else {
                        System.out.println("DENIED: Insufficient balance including transaction fee.");
                    }
                }

            } else {
                System.out.println("DENIED: Incorrect PIN.");
            }
        } else {
            System.out.println("DENIED: Incorrect username.");
        }

        flower.close();
    }
    
}
