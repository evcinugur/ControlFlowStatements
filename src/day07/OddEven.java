package day07;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi= input.nextInt();
        System.out.println("Sayiniz = "+sayi);
        if (sayi%2==0){
            System.out.println("Sayiniz cift sayidir.");
        } else {
            System.out.println("Sayiniz tek sayidir.");
        }
    }
}
