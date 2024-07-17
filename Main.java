//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Q1
Book book1 = new Book("Dream book",10.0,"jhon");
Movie movie1 = new Movie("home alone",19.0,"mark");
        System.out.println("--------------Book--------------");
        System.out.println("Book Name: " + book1.getName());
        System.out.println("Book Author: " + book1.getAuthor());
        System.out.println("Book Price: " + book1.getPrice());
        System.out.println("Book Discount: " + book1.getDiscount());

        System.out.println("--------------Movie--------------");
        System.out.println("Movie Name: " + movie1.getName());
        System.out.println("Movie Director: " + movie1.getDirector());
        System.out.println("Movie Price: " + movie1.getPrice());
        System.out.println("Movie Discount: " + movie1.getDiscount());

            System.out.println("--------------Q2--------------");
        //Q2
            MovablePoint point = new MovablePoint(0, 0, 4, 8);

            System.out.println("Initial Position: " + point);

            point.moveUb();

            System.out.println("After moving up: " + point);

            point.moveDown();

            System.out.println("After moving down: " + point);

            point.moveLeft();

            System.out.println("After moving left: " + point);

            point.moveRight();

            System.out.println("After moving right: " + point);
    }

    }
