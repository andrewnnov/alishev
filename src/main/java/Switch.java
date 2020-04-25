import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи возраст: ");
        int age = sc.nextInt();

        switch (age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            default:
                System.out.println("Не повезло");

        }



    }
}
