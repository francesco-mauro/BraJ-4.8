import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String infoTitle;
//        int infoPages;
//
//        System.out.println("Inserisci il titolo del libro");
//        infoTitle = scanner.nextLine();
//
//        System.out.println("Inserisci il numero di pagine del libro");
//        infoPages = scanner.nextInt();

        Book book1 = new Book("The Fellowship of the ring", 423);
        Book book2 = new Book("The two Towers", 354);
        Book book3 = new Book("The return of the King", 416);

        Book[] books = {book1, book2, book3};



        for (Book book: books){
            System.out.println(book.displayInfo());
        }


        scanner.close();
    }
}
