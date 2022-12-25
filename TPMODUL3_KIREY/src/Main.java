import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int customerID, orderQty ;
            try {
                System.out.print("Enter Customer ID : ");
                customerID = userInput.nextInt();
                System.out.print("Enter how much food to made : ");
                orderQty = userInput.nextInt();

                Thread restoran = new Thread(new Restaurant());
                Thread waiters = new Thread(new Waiters(orderQty,customerID));

                restoran.start();
                waiters.start();
                restoran.join();
                waiters.join();

            }catch (Exception e){
                System.out.println("Input must be Integer");
            }
        }

    }