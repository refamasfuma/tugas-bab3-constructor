//Bismilah
import java.util.ArrayList;
public class Olah_Data {
    ArrayList <Data_Karyawan> Karyawan;
    public Olah_Data(){
     Karyawan = new ArrayList<Data_Karyawan>();
    } 
    public void IsiDataKaryawan (Data_Karyawan ... x){
        for (int i = 0; i<x.length;i++)
        Karyawan.add(x[i]);
    }
    public void get(){
        for (Data_Karyawan semua : Karyawan) {
            semua.OutputKaryawan();
        }
    } 
    public void get(int nik){
        for (Data_Karyawan sama : Karyawan) {
            if (sama.getNik() == nik){
                sama.OutputKaryawan();
            }
        }
    }
    public void get(String apa, int nilai){
        int i=0;
        for (Data_Karyawan cek : Karyawan) {
            i=i+1;
            switch (apa) {
                case "Gaji Pokok" : 
                    if (nilai == cek.getGpok()){
                        cek.OutputKaryawan();
                    } else {
                        System.out.printf("Nilai Gajih Pokok untuk Karyawan NIK %d Tidak Cocok\n\n",(100+i));
                    } break;
                case "Tunjangan" : 
                    if (nilai == cek.getTun()){
                        cek.OutputKaryawan();
                    } else {
                        System.out.printf("Nilai Tunjangan untuk Karyawan NIK %d Tidak Cocok\n\n",(100+i));
                    } break;
                case "Bonus" : 
                    if (nilai == cek.getBon()){
                        cek.OutputKaryawan();
                    } else {
                        System.out.printf("Nilai Bonus untuk Karyawan NIK %d Tidak Cocok\n\n",(100+i));
                    } break;
                case "Denda" : 
                    if (nilai == cek.getDen()){
                        cek.OutputKaryawan();
                    } else {
                        System.out.printf("Nilai Denda untuk Karyawan NIK %d Tidak Cocok\n\n",(100+i));
                    } break;
                default : System.out.printf("Kategori %s untuk Karyawan NIK %d tidak sesuai .. \n\n",apa,(100+i));
            }
        }
    }
    public void get(String apa,String tanda,int nilai){
        int i=0;
        for (Data_Karyawan cek : Karyawan){
            i=i+1;
            switch (apa) {
                case "Gaji Pokok" : 
                    if (tanda=="<"){
                        if (nilai < cek.getGpok()){
                            cek.OutputKaryawan();
                        }
                    } else if (tanda==">"){
                        if (nilai > cek.getGpok()){
                            cek.OutputKaryawan();
                        } 
                    } else if (tanda=="<="){
                        if (nilai <= cek.getGpok()){
                            cek.OutputKaryawan();
                        }
                    } else if (tanda==">="){
                        if (nilai >= cek.getGpok()) 
                            cek.OutputKaryawan();
                    }break;
                case "Tunjangan" :
                    if (tanda=="<"){
                        if (nilai < cek.getTun())
                            cek.OutputKaryawan();
                    } else if (tanda==">"){
                        if (nilai > cek.getTun())
                            cek.OutputKaryawan();
                    } else if (tanda=="<="){
                        if (nilai <= cek.getTun())
                            cek.OutputKaryawan();
                    } else if (tanda==">="){
                        if (nilai >= cek.getTun())
                            cek.OutputKaryawan();
                    }break;
                case "Bonus" : 
                    if (tanda=="<"){
                        if (nilai < cek.getBon())
                            cek.OutputKaryawan();
                    } else if (tanda==">"){
                        if (nilai > cek.getBon())
                            cek.OutputKaryawan();
                    } else if (tanda=="<="){
                        if (nilai <= cek.getBon())
                            cek.OutputKaryawan();
                    } else if (tanda==">="){
                        if (nilai >= cek.getBon())
                            cek.OutputKaryawan();
                    }break;
                case "Denda" : 
                    if (tanda=="<"){
                        if (nilai < cek.getDen())
                            cek.OutputKaryawan();
                    } else if (tanda==">"){
                        if (nilai > cek.getDen())
                            cek.OutputKaryawan();
                    } else if (tanda=="<="){
                        if (nilai <= cek.getDen())
                            cek.OutputKaryawan();
                    } else if (tanda==">="){
                        if (nilai >= cek.getDen())
                            cek.OutputKaryawan();
                    }break;
                default : System.out.printf("Kategori %s untuk Karyawan NIK %d tidak sesuai .. \n\n",apa,(100+i));
            }
        }
    }
}
