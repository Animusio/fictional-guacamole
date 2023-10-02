import java.util.Scanner;
public class first {
    public static void main(String[] args) {

        System.out.println("Привет!");

        System.out.println("Введи своё имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Введи свой возраст: ");
        byte age = scan.nextByte();

        System.out.println("Введи свой вес: ");
        float weight = scan.nextFloat();

        System.out.println("Приятно познакомится "+name);
        System.out.println("Ваш вес "+ weight);
        System.out.println("Ваш возраст "+ age);


        }
    }