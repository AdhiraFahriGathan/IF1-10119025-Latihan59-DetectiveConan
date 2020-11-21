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
public class SonokiSuzuki extends DetectiveConan{
    
    private String namaAyah;
    private String namaIbu;
    private String profesiAyah;
    private String profesiIbu;
    private String karakter;
    private String keterangan;
    
    public SonokiSuzuki(String nama, String profesi, String status, String peran, int umur, String jenisKelamin){
        super(nama,profesi,status,peran,umur,jenisKelamin);
    }
    
    public String getNamaAyah(){
        return namaAyah;
    }
    
    public void setNamaAyah(String namaAyah){
        this.namaAyah = namaAyah;
    }
    
    public String getNamaIbu(){
        return namaIbu;
    }
    
    public void setNamaIbu(String namaIbu){
        this.namaIbu = namaIbu;
    }
    
    public String getProfesiAyah(){
        return profesiAyah;
    }
    
    public String getProfesiIbu(){
        return profesiIbu;
    }
    
    public void setProfesiIbu(String profesiIbu){
        this.profesiIbu = profesiIbu;
    }
    public void setProfesiAyah(String profesiAyah){
        this.profesiAyah = profesiAyah;
    }
    
    public String getKarakter(){
        return karakter;
    }
    
    public void setKarakter(String karakter){
        this.karakter = karakter;
    }
    
    @Override
    public void tampilKeterangan(String keterangan){
        System.out.println("Keterangan\t: " + keterangan);
    }
}
