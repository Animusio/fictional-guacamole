import java.util.Scanner;
public class second {
    public static void main(String[] args) {

        System.out.println("Привет!");

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float fir = scan.nextFloat();

        System.out.println("Введите оператор: ");
        char oper = scan.next().charAt(0);

        System.out.println("Введите второе число: ");
        float sec = scan.nextFloat();

        float res = 0;

        if(oper=='+') {
            res = fir + sec;
            System.out.println(fir+" + "+sec+" = "+ res);
        } else if (oper=='-') {
            res = fir - sec;
            System.out.println(fir+" - "+sec+" = "+ res);
        } else if (oper=='*') {
            res = fir * sec;
            System.out.println(fir+" * "+sec+" = "+ res);
        }else if (oper=='/') {
            res = fir / sec;
            System.out.println(fir+" / "+sec+" = "+ res);
        }


    }
}
