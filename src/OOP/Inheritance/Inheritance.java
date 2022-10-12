package OOP.Inheritance;

public class Inheritance extends Animal{// kế thừa
    public void dog (){
        System.out.println("Dog");
    }
    public void cat(){
        System.out.println("Cat");
    }
    public void catWalk (){
        super.animal();
        super.type  = "Fly"; // OveRight father's property
    }
    public static void main(String[] args) {
        Inheritance a = new Inheritance();
        a.catWalk();
        System.out.println(a.type);
        Inheritance a1 = new Inheritance();
        System.out.println(a1.type);
    }
}


class Animal {
    protected String type = "None";
    public void animal (){
        System.out.println("This is a Animal");
    }
}
