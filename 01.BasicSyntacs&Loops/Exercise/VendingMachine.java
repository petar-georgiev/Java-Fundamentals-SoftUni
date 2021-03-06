import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;

        String input = scanner.nextLine();
        while (!input.equals("Start")){
            double currentCoins = Double.parseDouble(input);

            if (currentCoins == 0.1 || currentCoins== 0.2 || currentCoins == 0.5 ||
            currentCoins == 1.0 || currentCoins==2.0){
                balance += currentCoins;
            }
            else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!"End".equals(product)){
            switch (product){
                case "Nuts":
                    if (balance>= 2.0){
                        balance -=2;
                        System.out.println("Purchased Nuts");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (balance>= 0.7){
                        balance -=0.7;
                        System.out.println("Purchased Water");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (balance>= 1.5){
                        balance -=1.5;
                        System.out.println("Purchased Crisps");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (balance>=0.8){
                        balance -=0.8;
                        System.out.println("Purchased Soda");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (balance>= 1.0){
                        balance -=1.0;
                        System.out.println("Purchased Coke");
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                    default:
                        System.out.println("Invalid product");
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f",balance);
    }

}

