import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.print("Lütfen kilonuzu giriniz: ");
        Scanner scanner = new Scanner(System.in);
        int kilo = scanner.nextInt();
        System.out.print("Lütfen boyunuzu giriniz (örneğin: 1,62): ");
        double boy = scanner.nextDouble();
        double bki = kilo / (boy * boy);
        System.out.println("beden kitle indeksiniz: " + bki );
    }
}