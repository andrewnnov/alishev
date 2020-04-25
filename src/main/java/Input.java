import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        String s = new String("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите что-нибудь");
        String str = sc.nextLine();
        System.out.println("Вы ввели: " + str);
    }
}
