package bulaklak_week3_intermidiate;

public class BULAKLAK_WEEK3_INTERMIDIATE {
    public static void main(String[] args) {

        double flowerPurchaseAmount = 2500;
        double flowerdiscount;

        if (flowerPurchaseAmount >= 5000) {
            flowerdiscount = 0.15;
        } else if (flowerPurchaseAmount >= 3000) {
            flowerdiscount = 0.10;
        } else if (flowerPurchaseAmount >= 1000) {
            flowerdiscount = 0.05;
        } else {
            flowerdiscount = 0.0;
        }

        double flowerDisAmount = flowerPurchaseAmount * flowerdiscount;
        double flowerfprice = flowerPurchaseAmount - flowerDisAmount;

        System.out.println("Purchase Amount: " + flowerPurchaseAmount);
        System.out.println("Discount: " + (flowerdiscount * 100) + "%");
        System.out.println("Discount Amount: " + flowerDisAmount);
        System.out.println("Final Price: " + flowerfprice);
    }
    
}
