/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pak_robertto_pemprograman;

/**
 *
 * @author erinda aurelia
 */
class Mahasiswa{
    String nama;
    String nim;
    String jenis_kelamin;
    String tahun_masuk;   
}
public class UTS_PAK_ROBERTTO_PEMPROGRAMAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa MahasiswaITBI = new Mahasiswa();
        MahasiswaITBI.nama = "Novaliza";
        MahasiswaITBI.nim ="23100001";
        MahasiswaITBI.jenis_kelamin ="perempuan";
        MahasiswaITBI.tahun_masuk ="2023";
        
        System.out.println ("nama"+MahasiswaITBI.nama);
        System.out.println ("nim"+MahasiswaITBI.nim);
        System.out.println ("jenis_kelamin"+MahasiswaITBI.jenis_kelamin);
        System.out.println ("tahun_masuk"+MahasiswaITBI.tahun_masuk);
        



        
    }
    
}
