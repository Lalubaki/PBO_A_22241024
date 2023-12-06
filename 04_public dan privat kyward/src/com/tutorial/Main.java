package com.tutorial;

class player{
    // Data member
    String name;//default,bisa dibaca dan ditulis oleh diluar class
    public int exp;//public,bisa dibaca dan ditulis oleh diluar class
    private int health;//private,hanya bisa dibaca oleh kelas itu sendiri


    // konstruktur
    player (String name, int exp, int health){
    this.name= name;
    this.exp= exp;
    this.health = health;
    }


  void display(){
    System.out.println("Hero 1: " + this.name);
    System.out.println("Hero Health : " + this.health);
    System.out.println("Hero EXP : " + this.exp);
  }

}
public class Main {
    public static void main(String[] args) {
    // membuat objek atu instansiasi objek
    player Hero_1 = new player("LaluHairumBaki", 31,72);

    //default
    System.out.println(Hero_1.name);
    Hero_1.name = "Baki";
     System.out.println(Hero_1.name);

     //public
      System.out.println(Hero_1.exp);
      Hero_1.exp =75;
       System.out.println(Hero_1.exp);
     
     //private
       Hero_1.display();
  
    }
}
