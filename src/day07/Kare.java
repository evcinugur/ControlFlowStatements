package day07;

import java.util.Scanner;

public class Kare {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Karenin Kenar Uzunlugunu Giriniz: ");
        //println halinde sayıyı alta atar; yanına alsın istersek yukarıda sadece print yeterli...
        int kenar=input.nextInt();
        System.out.println("Menu");
        System.out.println("-----------------------");
        System.out.println("1. Alan Hesapla");
        System.out.println("2. Cevre Hesapla");
        System.out.println("Seciminiz: ");
        int secim=input.nextInt();
        switch (secim){
            case 1:
                int alan=kenar*kenar;
                System.out.println("Alan = "+alan);
                break;

            case 2:
                int cevre=4*kenar;
                System.out.println("Cevre = "+cevre);
                break;

            default:
                System.out.println("Yanlis Secim Yaptiniz.");
                break;
        }
    }
}
