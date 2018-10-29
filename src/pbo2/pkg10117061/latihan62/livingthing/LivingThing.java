/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan62.livingthing;

/**
 *Nama      : Fachrian Harits P
 *Kelas     : IF-2
 *NIM       : 10117061
 *Deskripsi : Program untuk menampilkan kata-kata
 * 
 */
public abstract class LivingThing {

    public void walk(String nama) {
        System.out.println(nama + " Sedang berjalan");
    }

    public void breath(String nama) {
        System.out.println(nama+" Bernafas");
    }

    public void  eat(String nama){
        System.out.println(nama+" Makan");
    }

}
