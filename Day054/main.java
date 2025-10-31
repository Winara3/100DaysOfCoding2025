package Day054;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner w = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int a = w.nextInt();

        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Nilai i= " + i);
        }
    }
}
