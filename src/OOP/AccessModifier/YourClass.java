package OOP.AccessModifier;

public class YourClass extends MyClass{

    public static void main(String[] args) {
        MyClass a = new MyClass() {
            public void animalSound() {
                System.out.println("Uuu Oaa");
            }
            public void animalWalk() {
                System.out.println("Walk by Feet");
            }
        };
        a.animalSound();
        a.animalWalk();
    }
    public void animalSound() {
        System.out.println("You a Dog");
    }
    public void animalWalk() {
        System.out.println("Fly Ha ha ha");
    }
}
