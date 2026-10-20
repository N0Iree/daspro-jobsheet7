import java.util.Scanner;
public class Siakadfor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi=0, terendah=100;
        byte lolos=0, tidak=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
        nilai = sc.nextDouble();
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }
        if (nilai > 60 ) {
            lolos++;
        } else {
            tidak++;
        }
        }
        System.out.println("Mahasiswa lulus " + lolos);
        System.out.println("Mahasiswa tidak lulus " + tidak);
        System.out.println("Nilai tertinggi:" + tertinggi);
        System.out.println("Nilai terendah:" + terendah);
        sc.close();
    }
    
}