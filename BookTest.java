import java.util.Scanner;
public class BookTest {
    public static void main(String[] args){
        System.out.println("Please enter the detail of ");
        Scanner input = new Scanner(System.in);
        PrintBook printBook1 = new PrintBook("Harry Potter", 1995, "Jk Rowling",
                "1111111112221", "Penguin", 450);

        System.out.println(printBook1.toString());

        AudioBook audioBook1 = new AudioBook("automic habits", 2010, " John Paul",
                "112212122111111",39,110, "John Paul");
        System.out.println(audioBook1.toString());

    }
}
