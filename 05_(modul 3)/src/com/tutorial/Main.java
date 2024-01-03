package com.tutorial;


class Pegawai {
    public String nama ;
    public String jabatan;
    public float pajak;
    public float gajipokok;
    public float gajibersih;

Pegawai(String nama, String jabatan, float pajak, float gajipokok) {
    this.nama = nama;
    this.jabatan = jabatan;
    this.pajak = pajak/100;
    this.gajipokok = gajipokok;

}
public float setPajak(float pajak){
    return this.pajak = pajak/100;
}

public float gajibersih() {
    return this.gajipokok -(this.gajipokok*this.pajak);
}

public void display(){
    System.out.println("nama karyawan:" + this.nama);
    System.out.println("jabatan:" + this.jabatan);
    System.out.println("gaji bersih:" + this.gajibersih());
}
}
public class Main {

    public static void main(String[] args){
        Pegawai gaji = new Pegawai("lalu baki", "Dosen", 10, 3500000);
        gaji.display();
        gaji.setPajak(30);
        gaji.display();
    }
}
