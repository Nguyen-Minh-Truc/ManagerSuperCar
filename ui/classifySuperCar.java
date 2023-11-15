package ManagerSuperCar.ui;
import java.util.Scanner;

public class classifySuperCar {
    public int classifyadd(){
    System.out.println("--------------------------------------------------------------");
    System.out.println("| 1. Porsche                                                 |");
    System.out.println("| 2. Rolls-Royce                                             |");
    System.out.println("| 3. Ferrari                                                 |");
    System.out.println("| 4. Mercedes                                                |");
    System.out.println("| 5. Lamborghini                                             |");
    System.out.println("| 0. Exit                                                    |");
    System.out.println("--------------------------------------------------------------");
    System.out.print("chọn hãng xe bạn muốn thêm: ");
    int choice;
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();
    return choice;
    }

    public int classifyaDelete(){
    System.out.println("--------------------------------------------------------------");
    System.out.println("| 1. Porsche                                                 |");
    System.out.println("| 2. Rolls-Royce                                             |");
    System.out.println("| 3. Ferrari                                                 |");
    System.out.println("| 4. Mercedes                                                |");
    System.out.println("| 5. Lamborghini                                             |");
    System.out.println("| 0. Exit                                                    |");
    System.out.println("--------------------------------------------------------------");
    System.out.print("chọn hãng xe bạn muốn xoá: ");
    int choice;
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();
    return choice;
    }
}
