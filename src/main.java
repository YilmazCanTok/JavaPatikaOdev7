
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kademe;
        System.out.println("****************************************************");
        System.out.println("Yıldızlarla Elmas Oluşturma");
        System.out.println("----------------------------------------------------");
        System.out.print("Kademe Sayısını Yazınız : ");
        kademe = scanner.nextInt();
        for (int i = 0; i <= kademe; i++) {
            for (int j = 1; j <=kademe-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)+1 ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = kademe; i >= 0; i--) {
            for (int j = kademe-i; j >=0 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
}
