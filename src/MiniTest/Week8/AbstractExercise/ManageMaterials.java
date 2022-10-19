package MiniTest.Week8.AbstractExercise;

import java.time.LocalDate;
import java.util.Scanner;

public class ManageMaterials {
    Scanner sc = new Scanner(System.in);

    Material[] materials;
    int size;

    public ManageMaterials() {
        materials  = new CrispyFlour[100];
    }

    public void addAll(){

        materials[0] = new CrispyFlour("235JK4", "Bot Gao", LocalDate.now(), 2000);
        materials[1] = new CrispyFlour("FE9ADF", "Bot Nang", LocalDate.now(), 1600);
        materials[2] = new CrispyFlour("0A0DSA", "Bot Mi", LocalDate.now(), 2500);
        materials[3] = new CrispyFlour("G0ASD9", "Bot San Day", LocalDate.now(), 1000);
        materials[4] = new CrispyFlour("9H88AA", "Bot Ngo", LocalDate.now(), 700);

        materials[5] = new Meat("7G7D7D", "Thit Lon", LocalDate.now(), 100);
        materials[6] = new Meat("48SDF9", "Thit Ga", LocalDate.now(), 100);
        materials[7] = new Meat("G9A8SD", "Thit Vit", LocalDate.now(), 100);
        materials[8] = new Meat("GA0D0F", "Thit Ngan", LocalDate.now(), 100);
        materials[9] = new Meat("9AS9D8", "Thit Ngong", LocalDate.now(), 100);
    }

    public Object[] input(){

        System.out.println("Id: ");
        String id = sc.nextLine();
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Date: ");
        System.out.print("day: ");
        int day = Integer.parseInt(sc.nextLine());
        System.out.println("month: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("year: ");
        int year = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(year, month,day);
        System.out.println("Cost: ");
        int cost = Integer.parseInt(sc.nextLine());

        return new Object[]{id,name,date,cost};

    }

    public void addCrispyFlour(){
        System.out.println("Tao san pham Bot:");
        input();
        materials[size++] = new CrispyFlour((String)input()[0], (String)input()[1], (LocalDate) input()[2], (int)input()[3]);

    }
    public void addMeat(){
        System.out.println("Tao san pham Bot:");
        input();
        materials[size++] = new Meat((String)input()[0], (String)input()[1], (LocalDate) input()[2], (int)input()[3]);

    }


    public void update(int index){
        index--;
        Material update = materials[index];
        Object[] input = input();
        update.setId((String) input[0]);
        update.setName((String) input[1]);
        update.setManufacturingDate((LocalDate) input[2]);
        update.setCost((int) input[3]);
    }

    public void delete (int index){
        index--;
        System.arraycopy(materials,index+1, materials, index,size);
        size--;
    }


    public static void main(String[] args) {

    }

}
