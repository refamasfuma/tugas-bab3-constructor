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
}