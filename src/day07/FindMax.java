package day07;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1=input.nextInt();                      //int ve nextInt yerine double ve nextDouble tanımlarız.
        System.out.println("Ikinci sayiyi giriniz: ");
        int sayi2=input.nextInt();

        if (sayi1>sayi2){
            System.out.println("Birinci sayi buyuktur.");
        } else if (sayi1<sayi2) {
            System.out.println("Ikinci sayi buyuktur.");
        }else {
            System.out.println("Iki sayi birbirine esittir.");
            //Tabi burada kesirli sayılar için de bir çalışma yapmadık.
        }
    }
}
