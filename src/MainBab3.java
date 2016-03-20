// Bismillah awali dengan doa 
import java.util.Scanner;
public class MainBab3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Data_Karyawan k1 = new Data_Karyawan ("Paijo",101,2000,1000,500,200);
        Data_Karyawan k2 = new Data_Karyawan ("Lala",102,1750,900,500,200);
        Data_Karyawan k3 = new Data_Karyawan ("Lulu",103,2150,1000,300,375);
        Data_Karyawan k4 = new Data_Karyawan ("Sabar",104,1500,750,600,200);
        Data_Karyawan k5 = new Data_Karyawan ("Sule",105,2500,850,500,300);
        Data_Karyawan k6 = new Data_Karyawan ("Paiman",106,1500,350,450,250);
        Data_Karyawan k7 = new Data_Karyawan ("Paninim",107,2000,1000,500,200);
        Data_Karyawan k8 = new Data_Karyawan ("Sutiman",108,1500,1250,500,300);
        Data_Karyawan k9 = new Data_Karyawan ("Raja",109,1000,1000,500,200);
        Data_Karyawan k10 = new Data_Karyawan ("Harry",110,2250,1000,200,200);
        Olah_Data db = new Olah_Data();
        db.IsiDataKaryawan(k1,k2,k3,k4,k5,k6,k7,k8,k9,k10);
        System.out.printf("%-10s PT GONOGINI %10s\n","=====","=====");
        System.out.printf("%-20s : \n\n","Semua Karyawan");
        db.get();
        System.out.printf("%-10s NEXT %10s\n","=====","=====");
        System.out.printf("%-20s : \n\n","Karyawan Dari NIK");
        System.out.printf("%-20s : ","Masukan NIK Karyawan");
        int NIK = in.nextInt();
        db.get(NIK);
        System.out.printf("%-10s NEXT %10s\n","=====","=====");
        System.out.printf("%-20s : \n\n","Menurut Yang Peroleh Karyawan :");
        System.out.printf("%-32s : ","Masukan Kategori Untuk Karyawan");
        String kategori = in.nextLine(); kategori = in.nextLine();
        System.out.printf("%-32s : ","Masukan Nilai Dari Kategorinya");
        int nilai = in.nextInt();
        db.get(kategori,nilai);
        System.out.printf("%-10s NEXT %10s\n","=====","=====");
        System.out.printf("%-20s : \n\n","Menurut Yang Peroleh Karyawan :");
        db.get("Tunjangan","<",1000);
    }
}
