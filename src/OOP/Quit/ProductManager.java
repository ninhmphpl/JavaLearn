package OOP.Quit;

import java.util.Objects;
import java.util.Scanner;

public class ProductManager {
    public Product[] productArray = new Product[100];
    static int numberProduct = 0;
    public void addProduct (String name, int price, String description){
        productArray[numberProduct++] = new Product(name,price,description);
    }

    public void updateProduct(int index){
        Scanner input = new Scanner(System.in);
        System.out.print("Set Name: ");
        String name = input.nextLine();
        System.out.println("Set Price");
        int price = input.nextInt();
        input.nextLine();
        System.out.println("set Description");
        String description = input.nextLine();
        if (!Objects.equals(name, "")){
        productArray[index].setName(name);
        }
        if (price != 0){
            productArray[index].setPrice(price);
        }
        if (!Objects.equals(description, "")){
            productArray[index].setDescription(description);
        }
    }

    public void deleteProduct(int index){
        for (int i = index ; i < numberProduct; i ++){
            productArray[i] = productArray[i+1];
        }
    }

    public void displayProduct(){
        System.out.printf("%-30s %-20s %s %n","name","price","description");
        for (Product product : productArray){
            if (product != null){
            System.out.printf("%-30s %-20d %s %n",product.getName(),product.getPrice(),product.getDescription());

            }
        }
    }

    public void displayMaxPriceProduct(){
        int maxPrice = 0;
        Product maxPriceProduct = null;
        for (int i = 0 ; i < productArray.length; i ++){
            if (productArray[i] != null){
                if (productArray[i].getPrice() > maxPrice ){
                    maxPrice = productArray[i].getPrice();
                    maxPriceProduct = productArray[i];
                }
            }
        }
        System.out.println("Max Price Product: ");
        System.out.printf("%s , %d , %s%n",maxPriceProduct.getName(),maxPriceProduct.getPrice(),maxPriceProduct.getDescription());
    }
}
