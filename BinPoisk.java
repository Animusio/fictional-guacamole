import java.util.Scanner;

public class BinPoisk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] masiv = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            masiv[i] = scanner.nextInt();
        }


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

        for(int i = 0; i < masiv.length; i++) {
            System.out.println(masiv[i]);
        }


        System.out.print("Введите число которое вам надо найти в отсортированном массиве: ");
        int nado = scanner.nextInt();
        int left = 0;
        int right = masiv.length - 1 ;
        while(left <= right){
            int mid = left +(right - left)/2;

            if(nado == masiv[mid]){
                System.out.println("Ваше число - "+nado+" находится на позиции "+(mid + 1)+" в отсортирвоанном списке.");
                break;
            }else if(masiv[mid] < nado){
                left = mid + 1;
                if(right<left){
                    System.out.println("Ващего числа нет в списке");}
            }else if(masiv[mid] > nado){
                right = mid - 1;
                if(right<left){
                    System.out.println("Ващего числа нет в списке");}
                }
            }



        }}



