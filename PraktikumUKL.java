/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumukl;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class PraktikumUKL {

    
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> dataAngka = new ArrayList<>();
    static ArrayList<String> dataString = new ArrayList<>();
    
    public static void data(int id) {
        switch (id) {
            case 1:
                dataAngka.add(1);
                dataString.add("Galuh");
                dataAngka.add(1);
                dataString.add("Sawojajar");
                break;
            case 2:
                dataAngka.add(2);
                dataString.add("Indro");
                dataAngka.add(3);
                dataString.add("Kedung Kandang");
                break;
            case 3:
                dataAngka.add(3);
                dataString.add("Jedi");
                dataAngka.add(2);
                dataString.add("Ijen");
                break;
            case 4:
                dataAngka.add(4);
                dataString.add("Kanu");
                dataAngka.add(3);
                dataString.add("Dinoyo");
                break;
            default:
                System.out.println("ERROR : ID Tidak Ditemukan");
        }
    }
    
    public static int hitungTagihan(int pemakaian, int golongan) {
        int tagihan = 0, biayaAdmin = 13000;;
        if (pemakaian == 0) {
            return tagihan + biayaAdmin;
        }
        int perKwh = 0;
        switch (golongan) {
            case 1:
                perKwh = 1000;
                break;
            case 2:
                perKwh = 1300;
                break;
            case 3:
                perKwh = 1500;
                break;
            default:
                System.out.println("ERROR : Golongan tidak terdaftar");
        }
        tagihan = pemakaian * perKwh;
        if (tagihan < 50000) {
            tagihan = 50000;
        }
        tagihan += biayaAdmin;
        
        return tagihan;
    }
    
    public static void main(String[] args) {
        boolean lagi = true, lagi2 = true;
        String jawab;
        int id;
        int pemakaian;
        while (lagi == true) {  
            lagi2 = true;
            while (lagi2 == true) {                
                dataAngka.clear();
                dataString.clear();
                
                System.out.print("Masukkan id pelanggan : ");
                id = scan.nextInt();
                System.out.print("Masukkan pemakaian pelanggan(kwh) : ");
                pemakaian = scan.nextInt();
                
                data(id);
                if (dataAngka.isEmpty()) {
                    break;
                } else {
                }
                int tagihan = hitungTagihan(pemakaian, dataAngka.get(0));
                
                System.out.println("ID Pelangganc\t\t: " + dataAngka.get(0)
                        + "\nNama Pelanggan\t\t: " + dataString.get(0)
                        + "\nGolongan Pelanggan\t: " + dataAngka.get(1)
                        + "\nAlamat Pelanggan\t: " + dataString.get(1)
                        + "\nTagihan\t\t\t: Rp." + tagihan + ",00");
                lagi2 = false;
            }
            
            System.out.print("Ingin menghitung tagihan lagi? (ya/tidak) : ");
            scan.nextLine();
            jawab = scan.nextLine();
            if (jawab.equalsIgnoreCase("ya")) {
                lagi = true;
            }else {
                lagi = false;
            }
 
        }
    }
}


