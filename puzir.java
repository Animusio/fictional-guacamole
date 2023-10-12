import java.util.Scanner;
public class puzir{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] masiv = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            masiv[i] = scanner.nextInt();
        }
        System.out.println("Отсортированный массив: ");



        boolean otsort = false;
        while(!otsort){
            otsort = true;
            for(int i = 0; i < masiv.length-1; i++){
                if(masiv[i] > masiv[i+1]){
                    int peremen = masiv[i];
                    masiv[i]=masiv[i+1];
                    masiv[i+1]= peremen;
                    otsort = false;
                }
            }
        }
        for(int i = 0; i < masiv.length; i++){
            System.out.println(masiv[i]);
        }
    }
}
