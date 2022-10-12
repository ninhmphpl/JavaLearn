package OOP.Quit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner input = new Scanner(System.in);
        //Menu
        while (true){
            System.out.println("1.Add Product");
            System.out.println("2.Delete Product");
            System.out.println("3. Display Product");
            System.out.println("4. Max Price Product");
            System.out.println("Another key: Exit System");

            System.out.print("Input your Choice: ");
            int choice = input.nextInt();
            System.out.println("==========================");
            switch (choice){
                case 1:
                    System.out.print("Name Product:");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.print("Price Product: ");
                    int price = input.nextInt();
                    System.out.print("Description Product: ");
                    input.nextLine();
                    String description = input.nextLine();
                    productManager.addProduct(name, price, description);
                    break;
                case 2:
                    System.out.print("Index Product to Delete:");
                    int index = input.nextInt();
                    productManager.deleteProduct(index);
                    break;
                case 3:
                    productManager.displayProduct();
                    break;
                case 4:
                    productManager.displayMaxPriceProduct();
                    break;
                default:
                    System.exit(0);
            }
        System.out.println("===============");
        }

    }

}
