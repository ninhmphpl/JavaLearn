package MiniTest.Week8;

import MiniTest.Week8.InheritanceExercise.FictionBook;
import MiniTest.Week8.InheritanceExercise.ProgrammingBook;

public class InheritanceExerciseMain {
    public static void main(String[] args) {
        FictionBook[] fictionBooks = new FictionBook[5];
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];



        fictionBooks[0] = new FictionBook("928ASF", "Star War" , 30, "John", "Science Fiction" );
        fictionBooks[1] = new FictionBook("FAE999", "Titanic" , 100, "Jame", "Romantic" );
        fictionBooks[2] = new FictionBook("8FAFSA", "Romeo and Juliet" , 50, "Bob", "Romantic" );
        fictionBooks[3] = new FictionBook("AE909A", "Harry Poster" , 100, "Juliet", "Adventure" );
        fictionBooks[4] = new FictionBook("F9F8AA", "Spider Man" , 1, "Alex", "Supper Hero Action" );

        programmingBooks[0] = new ProgrammingBook("98ASD9", "Star War" , 3, "John", "English", "Main" );
        programmingBooks[1] = new ProgrammingBook("FA0SDF", "Titanic" , 10, "Jame", "Java", "Main" );
        programmingBooks[2] = new ProgrammingBook("8FAFSA", "Romeo and Juliet" , 50, "Bob", "VietNames", "Main" );
        programmingBooks[3] = new ProgrammingBook("AE329A", "Harry Poster" , 80, "Juliet", "Java", "Main" );
        programmingBooks[4] = new ProgrammingBook("F111AA", "Spider Man" , 10, "Alex", "Roma", "Main" );

        int sum = sumPriceOfBook(fictionBooks, programmingBooks);
        System.out.println("Tinh tong 10 cuon sach: " + sum);
        int sum1 = languageNumber(programmingBooks, "Java");
        System.out.println("So sach co Language la Java: " + sum1);
        int sum2 = categoryNumber(fictionBooks, "Science Fiction");
        System.out.println("So sach co Caterogy la Science Fiction: " + sum2 );
        int sum3 = priceInOfRange(fictionBooks,100);
        System.out.println("So sach co Price nho hon 100: " + sum3 );

    }

    private static int sumPriceOfBook(FictionBook[] fictionBooks, ProgrammingBook[] programmingBooks) {
        int sumPriceOf10Book = 0;
        for (FictionBook fictionBook : fictionBooks) {
            sumPriceOf10Book += fictionBook.getPrice();
        }
        for (ProgrammingBook programmingBook : programmingBooks) {
            sumPriceOf10Book += programmingBook.getPrice();
        }
        return sumPriceOf10Book;
    }
    private static int languageNumber(ProgrammingBook[] programmingBooks, String language){
        int count = 0;
        for ( ProgrammingBook a : programmingBooks){
            if (a.getLanguage().equals(language)){
                count++;
            }
        }
        return count;
    }
    private static int categoryNumber(FictionBook[] fictionBooks , String category){
        int count = 0;
        for (FictionBook a : fictionBooks){
            if (a.getCategory().equals(category))count++;
        }
        return count;
    }
    private static int priceInOfRange(FictionBook[] fictionBooks , int price){
        int count = 0;
        for (FictionBook a : fictionBooks){
            if (a.getPrice() == price)count++;
        }
        return count;
    }


}
