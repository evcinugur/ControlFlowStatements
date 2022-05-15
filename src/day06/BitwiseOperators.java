package day06;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Bitwise Operators - Bitlerle işlem yapan operatörler.
        //&,|,^, ~,<<,>>,>>>
        int x=5;//Binary sayısı 00000101
        int y=7;//Binary sayısı 00000111
        int r=x&y;//Karşılaştrm 00000101 çıkar. 0-1 aslında doğru yanlış üzerinden yürür.
        //x ve y sayısını karşılaştırırsak bunu bitler üzerinden true False karşılaştırmasına sokar.
        System.out.println(r);

        int a=64;//Binary sayısı01000000
        int b=7;//Binary sayısı 00000111
        int r2=a&b;//Karşılaştır00000000 olduğu için ve bağlacında sonuç 0 olur.
        int r3=a|b;//Karşılaştrm01000111 veya olduğu için veya ile binary sisteminde sonuç 71 olur.
        //x ve y sayısını karşılaştırırsak bunu bitler üzerinden true False karşılaştırmasına sokar.
        System.out.println(r2);
        System.out.println(r3);

        int sayi=128;//10000000 binary sıralaması böyle iken bunu sayi>>1 ile bir sayı sağa kaydır deriz.
        sayi= sayi>>1;//O zaman 01000000 en sondaki 0 kayar ve düşer. 2^8 iken 2^7 olur. Yani sonuç 64.
        System.out.println(sayi);

        int say=7;//00000111 binary sıralaması böyle iken bunu sayi>>1 ile bir sayı sağa kaydır deriz.
        say= say>>1;//O zaman 00000011 en sondaki 1 kayar ve düşer. 2^0*1 + 2^1*2 = Yani sonuç 3.
        System.out.println(say);

        say=say<<2;
        System.out.println(say);

    }
}
