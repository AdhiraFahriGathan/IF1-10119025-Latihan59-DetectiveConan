/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan59.detectiveconan;

/**
 *
 * @author User
 */
public class GentaKojima extends DetectiveConan{
    
    private String karakter;
    private String hobi;
    private String namaAyah;
    
    public GentaKojima(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getNamaAyah(){
        return namaAyah;
    }
    
    public void setNamaAyah(String namaAyah){
        this.namaAyah = namaAyah;
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    public String getHobi(){
        return hobi;
    }
    
    public void setHobi(String hobi){
        this.hobi = hobi;
    }
    
    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
}
