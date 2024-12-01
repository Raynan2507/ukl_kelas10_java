package rekapnilai;
import java.util.Scanner;

public class RekapNilai {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Jumlah Siswa : ");
        int jumlahSiswa = scanner.nextInt();
        double [] nilai = new double[jumlahSiswa];
        double totalNilai = 0;
        
    
    for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Nilai Siswa Ke " + (i + 1) + ":");
            nilai[i] = scanner.nextDouble();
            totalNilai += nilai[i];
}
    double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Nilai Total Ujian : " + totalNilai);
        System.out.println("Jumlah Siswa : " + jumlahSiswa );
    System.out.println("Rata rata nilai ujian: " + rataRata);
}
}