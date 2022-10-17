package OOP.Inheritance;

public class Main {

    public static void main(String[] args) {
        // UpCasting: biến của lớp cha tham chiếu đến đối tượng của lớp con
        Elf mina = new Elf();
        Person misa = (Person) mina; // ép kiểu tường minh
        misa = mina; // ép kiểu không tường minh tường minh hay còn gọi là ép kiểu tự động
        // cả 2 cách đều được chấp nhận
        mina.taiDai();
        misa.human(); // misa không có thuộc tính taiDai();
        // Dowcasting: biến của lớp con tham chiếu đến đối tượng của lớp cha
        Person jone = new Elf();
        Elf joneElf =(Elf) jone;
        joneElf.taiDai();



    }

}
