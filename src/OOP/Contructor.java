package OOP;

public class Contructor {
    String name;
    int age;
    String addres;
    public Contructor(String nameInput, int ageInput, String addresInput){
        name = nameInput;
        age = ageInput;
        addres = addresInput;
    }

    public static void main(String[] args) {
        Contructor newContructor = new Contructor("ninh", 10, "hoa binh");
        System.out.println(newContructor.name);
        System.out.println(newContructor.addres);

    }
}
