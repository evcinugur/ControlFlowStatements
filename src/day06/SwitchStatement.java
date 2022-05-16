package day06;

public class SwitchStatement {
    public static void main(String[] args) {
        //switch...case
        // Bunlar control flow selection ın - Akış Kontrol İfadelerinin
        // alt basamağı olan Selection Statementlerden diğerleri de if,if-else,if-elseif, else dir.

 /*       int dayNumber = 11; //Buradaki rakamı değiştirerek switch-case ve default u test edebiliriz.
        switch (dayNumber) {
            case 1:
                System.out.println("Pazartesi");
                break; //her birinde break olmazsa break çıkana kadar yazar.
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Yanlis girildi"); */

/*        int dayNumber = 11; //Buradaki rakamı değiştirerek switch-case ve default u test edebiliriz.
        switch (dayNumber) {
            case 1:
                //her birinde break olmazsa break çıkana kadar yazar.
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekend");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong case"); */
        int k1 = 15;
        int k2 = 10;

        switch (k1 + k2) {
            case 15:
                System.out.println("Kargo icin uygundur.");
                break;
            case 20:
                System.out.println("Kargo icin uygun degil.");
                break;
            default:
                System.out.println("Girilen verilerle hesaplama yapilamaz.");
        }
    }
}
