package Thread.Read1;

public class Table {
    void printTable(int n, String string) {// method không synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(string + (n * i));
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


}
