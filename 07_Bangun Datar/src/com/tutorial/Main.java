package com.tutorial;

//Super class BangunDatar
class BangunDatar {
    public float hitungLuas() {
        return 0;
    }

    public float hitungKeliling() {
        return 0;
    }
} 
//Subclass Persegi
class Persegi extends BangunDatar {
    private float sisi;

    public Persegi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    public float hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public float hitungKeliling() {
        return 4 * sisi;
    }
}

// subclas PersegiPanjang
class PersegiPanjang extends BangunDatar {
    private float Panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.Panjang = Panjang;
        this.lebar = lebar;
    }

    @Override
    public float hitungLuas() {
        return Panjang * lebar;
    }

    @Override
    public float hitungKeliling() {
        return 2 * (Panjang + lebar);

    }
}

// Subclass Segitiga
class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisi1;
    private float sisi2;
    private float sisi3;


    public Segitiga(float alas, float tinggi, float sisi1, float sisi2, float sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public float hitungLuas() {
        return 0.5f *alas *tinggi;
    }

    @Override
    public float hitungKeliling(){
        return sisi1 + sisi2 + sisi3;
    }
}

//Subclass Lingkaran 
class Lingkaran extends BangunDatar {
    private float jariJari;

    public Lingkaran(float jariJari){
        this.jariJari = jariJari;
    }

    @Override
    public float hitungLuas() {
        return  (float) (2 * Math.PI * jariJari * jariJari);
    }

    @Override
    public float hitungKeliling() {
        return (float) (Math.PI * jariJari);
    }
}
// Contoh Penggunaan
public class Main {

    public static void main(String[] args){
        Persegi persegi = new Persegi(5);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling() );

        PersegiPanjang PersegiPanjang = new PersegiPanjang(4, 6);
        System.out.println("Luas Persegi Panjang: " + PersegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + PersegiPanjang.hitungKeliling());

        Segitiga Segitiga = new Segitiga(3, 4, 5, 5, 5);
        System.out.println("Luas Segitiga: " + Segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + Segitiga.hitungKeliling());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());


    }
}
