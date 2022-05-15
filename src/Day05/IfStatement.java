package Day05;

public class IfStatement {
    public static void main(String[] args) {
        int yas=28;

        //Yetişkin olup olmama
        if (yas>=18) {
            System.out.println("Kisi yetiskindir.");
        }else {
            System.out.println("Yetiskin degildir.");
        }

        //Yaşı 70 den büyük 18 den küçük olma durumu
        if (yas<18 | yas>=70){
            System.out.println("Sosyal yardim alabilir.");
        }else {
            System.out.println("Sosyal yardim alamaz.");
        }
    }
}
