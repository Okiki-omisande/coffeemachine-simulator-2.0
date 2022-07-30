import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static Seller Seller = new Seller("bola",0);
    static User user = new User("david",700);

    static  CoffeeMachine coffeeMachine = new CoffeeMachine(1000,1000,100,10);
    public static void main(String[] args) {

          do {
              System.out.println("\nWelcome to Coffee Hub");
              System.out.println("Enter" + "\n1- for Seller View" + "\n2- Customer View" + "\n3- Exit");
              int choice = input.nextInt();
              switch (choice) {
                  case 1:
                      SellerView();
                      break;

                  case 2:
                      UserView();
                      break;
                  case 3:
                      System.exit(0);
                      break;
              }
          }
          while (true);
        }

    public static void SellerView() {
        System.out.println("Enter your name: ");
        Seller.setName(input.next());
        Seller.setTotalSales(0);
        System.out.println("Welcome " + Seller.getName());
        System.out.println("Input 1- Fill, 2- Clean Machine, " +
                "3- Check Available Resources, 4- Check Sales Earnings, 5- Exit");

        switch (input.nextInt()) {
            case 1:
                CoffeeMachine.fillMachine(coffeeMachine);
                break;
            case 2:
                CoffeeMachine.Clean(coffeeMachine);
                break;
            case 3:
                CoffeeMachine.showAvailableSupply(coffeeMachine);
                break;
            case 4:
               checkSales();
               break;
            case 5:
               shutDown();
                break;
        }
    }
    public static void UserView()  {
        System.out.println("Enter your name: ");
        user.setName(input.next());
        System.out.println("Welcome " + user.getName());
        System.out.println("Input 1- to buy a coffee, 2- to check available resource, 3- to exit");
        switch (input.nextInt()) {
            case 1:
               CoffeeMachine.buy(coffeeMachine);
                break;

            case 2:
                CoffeeMachine.showAvailableSupply(coffeeMachine);
                break;

            case 3:
              shutDown();
              break;
        }
    }
    public static void checkSales() throws NullPointerException {
        System.out.printf("today, you've sold coffee worth $%d%n",Seller.getTotalSales());
    }
    public static void shutDown() {
        System.out.println("Shutting down...");
        System.exit(0);
    }
}
