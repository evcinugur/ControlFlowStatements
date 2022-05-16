package day07;

import java.util.Scanner;

public class ScannerUsage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); //new operatörü bir nesne oluşturmak içindir.
        //input içinde bir nesne var anlamına gelir.
        System.out.println("Lutfen isminizi giriniz: ");
        String adSoyad=input.nextLine(); //adSoyad yazıp ismi string metodu içinde tutarız.
        System.out.println("Merhaba "+adSoyad);
    }
}
