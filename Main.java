import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 > sayi2) {
            System.out.println("Lütfen birinci sayıyı küçük giriniz.");
        }
        else {
            int i = sayi1;
            while (i <= sayi2){
                if(i % 2 == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}