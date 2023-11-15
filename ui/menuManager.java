package ManagerSuperCar.ui;
import java.util.Scanner;

public class menuManager {

  classifySuperCar ClassifySuperCar = new classifySuperCar();

  public int menu() {
    System.out.println("--------------------------------------------------------------");
    System.out.println("| 1. hiển thị tất cả sản phẩm                                |");
    System.out.println("| 2. thêm sản phẩm                                           |");
    System.out.println("| 3. xoá sản phẩm                                            |");
    System.out.println("| 4. sắp xếp sản phẩm theo chiều giảm dần của giá bán        |");
    System.out.println("| 5. tìm kiếm sản phẩm                                       |");
    System.out.println("| 0. Exit                                                    |");
    System.out.println("--------------------------------------------------------------");
    System.out.print("chọn chức năng bạn muốn dùng: ");
    Scanner sc = new Scanner(System.in);
    int choice;
    choice = sc.nextInt();
    return choice;
  }

  public void displayAllProducts() {
    System.out.println("Đang hiển thị tất cả sản phẩm...");
  }

  public void addProduct(){
    System.out.println("Đang thêm sản phẩm...");
    int choice;
    choice = ClassifySuperCar.classifyadd();

  }

  public void deleteProduct() {
    System.out.println("Đang xoá sản phẩm...");
    int choice;
    choice = ClassifySuperCar.classifyaDelete();
  }

  public void sortProductsByPrice() {
    System.out.println("Đang sắp xếp sản phẩm theo giá bán giảm dần...");
  }

  public void searchProduct() {
    System.out.println("Đang tìm kiếm sản phẩm...");
  }

}
