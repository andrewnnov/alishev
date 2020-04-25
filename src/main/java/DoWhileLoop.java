import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("введи 5");
            value = sc.nextInt();

        } while (value != 5);
        System.out.println("Вы ввели 5");
    }
}
