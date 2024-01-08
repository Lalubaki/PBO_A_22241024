package com.tutorial;

// Super class
class Pelanggan {
    String nama;
    double totalbelanja;

     void display(){
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Total Belanja : " + totalbelanja);
    }
}

class Member extends Pelanggan{
     double diskon;

    double HitungDiskon() {
        if (totalbelanja > 499999) {
            return 0.1 * totalbelanja;
        } else if (totalbelanja > 100000 && totalbelanja < 500000) {
            return 0.05 * totalbelanja;
        } else {
            return 0.03 * totalbelanja;
        }
    }
    
    double diskonpersen() {
        return (HitungDiskon()/totalbelanja) * 100;
    }

    double HitungBelanja() {
        return (this.totalbelanja-HitungDiskon());
    }
    
    @Override
    void display() {
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Total Belanja : " + totalbelanja);
        System.out.println("Diskon: " + HitungDiskon());
        System.out.println("Hitung Belanja: " + HitungBelanja());
    }
}

class NonMember extends Pelanggan{
    double diskon;

    double HitungDiskon() {
        if (totalbelanja > 100000) {
            return 0.03 * totalbelanja;
        } else {
            return 0;
        }
    }
    
    double diskonpersen() {
        return (HitungDiskon()/totalbelanja) * 100;
    }

    double HitungBelanja() {
        return (this.totalbelanja-HitungDiskon());
    }
    
    @Override
    void display() {
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("Total Belanja : " + totalbelanja);
        System.out.println("Diskon: " + HitungDiskon());
        System.out.println("Hitung Belanja: " + HitungBelanja());
    }
}

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        member.nama = "Baki";
        member.totalbelanja = 500000;
        member.display();

        NonMember nonmember = new NonMember();
        nonmember.nama = "Baki";
        nonmember.totalbelanja = 50000;
        nonmember.display();
    } 
}