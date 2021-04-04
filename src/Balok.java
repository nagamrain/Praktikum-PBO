/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bambam
 */
public class Balok extends BangunRuang {
    private int panjang, lebar, tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    double volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    double keliling() {
        return (panjang+lebar+tinggi)*4;
    }
    
    void tampilkan(){
        System.out.println("Volume Balok : " + volume());
        System.out.println("Keliling Balok : " + keliling());
    }
}
