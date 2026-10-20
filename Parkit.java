import java.util.Scanner;
public class Parkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total=0;
        do {
            System.out.print("Jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi * 3000;
                    System.out.print("harga parkir mobil: Rp" + (durasi * 3000) + "\n");
                }
                else {
                    total += durasi * 2000;
                    System.out.print("harga parkir motor: Rp" + (durasi * 2000) + "\n");
                }
            }
        } while (jenis != 0);
        System.out.println("Total biaya parkir: Rp" + total);
        sc.close();
    }
}