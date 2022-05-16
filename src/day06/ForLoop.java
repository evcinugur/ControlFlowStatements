package day06;

public class ForLoop {
    //Looping Statements yani while, do-while ve for döngüleri
    // Bunlar control flow selection ın - Akış Kontrol İfadelerinin alt basamakları
    public static void main(String[] args) {
/*
        for (int i=0; i<5;i++){
            System.out.println("Merhaba"); */

        //1-10 kadar olan sayıların toplamını bulan java programını yazınız.
        //=,+=,-=... Atama Operatörleri...
        // manuel çalıştıralım:
        //i      -->1,2,3,4,5,6,7,8,9,10,11'de döngü durur.
        //toplam -->0,1,3,6,10,15,21,28,36,45,55
/*        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
            toplam=toplam+i; //Bunu toplam +=i şeklinde de yazabiliriz.

        }
        System.out.println("Toplam= "+toplam); */

/*        //1'den 100'e kadar olna çift sayıların toplamını bulan Java programını yazınız.
        int sum=0;
        for (int i = 2; i<=100 ; i=i+2) {
            sum=sum+i; //Bunu sum +=i şeklinde de yazabiliriz.

        }
        System.out.println("Toplam= "+sum); */

        //1'den 5'e kadar olan sayıların çarpımını bulan java programı yazınız.
        // carpim   -->1 1 2 6 24 120
        // i        -->1 2 3 4 5 6'da döngü durur.
/*        int carpim = 1;
        //yukarıda sıfırdan başladık ama burada 0 ile başlayamayız çünkü 0 ile çarpılınca sonuç 0 çıkar.
        for (int i = 1; i <= 5; i++) {
            carpim = carpim * i;
        }
        System.out.println("Carpim= " + carpim);*/

        //5'den 1'e kadar olan sayıların çarpımını bulan java programı yazınız.
        // carpim   -->5 20 60 120 120
        // i        -->5 4  3  2   1   0'da döngü durur.
/*        int carpim = 1;
        //yukarıda sıfırdan başladık ama burada 0 ile başlayamayız çünkü 0 ile çarpılınca sonuç 0 çıkar.
        for (int i = 5; i >= 1; i--) {
            carpim *= i;
        }
        System.out.println("Carpim= " + carpim);*/

        //Sonsuza giren bir döngü yapalım. Aşağıdaki kodla sonsuza kadar merhaba yazacaktır.Dikkatli olmalı.
/*        for (;;){
            System.out.println("Merhaba");
        }*/

    }
}
