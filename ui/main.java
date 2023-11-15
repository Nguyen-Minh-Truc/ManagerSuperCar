package ManagerSuperCar.ui;
import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        menuManager menuManager = new menuManager();
        int choice;
        
         do {
            choice = menuManager.menu();
            switch (choice) {
                case 1:
                    menuManager.displayAllProducts();
                    break;
                case 2:
                    menuManager.addProduct();
                    break;
                case 3:
                    menuManager.deleteProduct();
                    break;
                case 4:
                    menuManager.sortProductsByPrice();
                    break;
                case 5:
                    menuManager.searchProduct();
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

        } while (choice != 0);
    }
}

