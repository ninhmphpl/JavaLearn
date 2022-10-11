package OOP.Inheritance;

public class Inheritance extends Animal{// kế thừa
    public void dog (){
        System.out.println("Dog");
    }
    public void cat(){
        System.out.println("Cat");
    }
    public static void main(String[] args) {
        Inheritance a = new Inheritance();
        a.animal();
        a.cat();
    }
}


class Animal {
    public void animal (){
        System.out.println("This is a Animal");
    }
}
