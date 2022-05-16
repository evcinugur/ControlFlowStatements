package day07;

import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = (int) Math.round(Math.random() * 10); //round yuvarlama işlevini görüyor.
        //(int) yazmamızın nedeni long olması biz de bunu int olarak tanımaya zorluyoruz.
        System.out.println("Bir sayi tuttum. Lutfen tahmin ediniz. (3 Hakkiniz var)");

        int tahmin;
        for (int i = 0; i < 3; i++) { //3 tahmin olduğu için 3 giriyoruz.
            System.out.println((i + 1) + ". tahmininiz: ");
            tahmin = input.nextInt();
            if (sayi == tahmin) {
                System.out.println("Bildiniz. Tebrikler...");
                break;
            }
        }
    }
}
