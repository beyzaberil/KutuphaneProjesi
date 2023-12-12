import java.util.Scanner;

public class Ders1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int bakiye = 1000;
        int islem;


        System.out.println("1: Bakiye Görüntüle");
        System.out.println("2: Para Yatırma");
        System.out.println("3: Para Çekme");
        System.out.println("4: Sistemi Kapat");

        islem = scan.nextInt();
        switch(islem){
            case 1:
                System.out.println("Bakiyeniz: " + bakiye + " tl dir");
                break;
            case 2:
                System.out.println("Ne kadar yatırmak istiyorsunuz?");
                int miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Yeni Bakiyeniz:" + bakiye + " tl dir.");
                break;
            case 3:
                System.out.println("Ne kadar çekeceksiniz?");
                miktar = scan.nextInt();
                if(miktar > bakiye){
                    System.out.println("Bakiye Yetersiz.");
                }
                else {
                    bakiye -= miktar;
                    System.out.println("Yeni Bakiyeniz: " + bakiye + " tl dir.");
                }
                break;

            case 4:
                System.out.println("Sistemden çıkılıyor");
                break;

            default:
                System.out.println("Geçersiz işlem girişi yapıldı.");
                break;



        }

        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");


    }
}
