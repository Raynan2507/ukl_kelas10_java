/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asesmen2;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Asesmen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tiga angka:");

        double angka1 = input.nextDouble();
        double angka2 = input.nextDouble();
        double angka3 = input.nextDouble();
        
         double rataRata = (angka1 + angka2 + angka3) / 3;

        System.out.println("Rata-rata nilai: " + rataRata);
        
        if (rataRata >= 10 && rataRata <= 99) {
            System.out.println("Nilai puluhan");
        } else if (rataRata >= 100 && rataRata <= 999) {
            System.out.println("Nilai ratusan");
        } else if (rataRata >= 1000 && rataRata <= 9999) {
            System.out.println("Nilai ribuan");
        } else {
            System.out.println("Rata-rata di luar kategori yang ditentukan.");
        }

        input.close();
    }
    
}
