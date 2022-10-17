package OOP.Abstract.Practice.AnimalAndEdible;

public class Chickken extends Animal implements Edible{

    @Override
    public void makeSoundS() {
        System.out.println("Cuc ta Cuc tac");
    }

    @Override
    public void howToEat() {
        System.out.println("Nau, Nuong, Rang gung");
    }
}
