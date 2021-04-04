/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bambam
 */
public class Kubus extends BangunRuang{
    
    private int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    
    @Override
    double volume() {
        return sisi*sisi*sisi;
    }

    @Override
    double keliling() {
        return sisi*12;
    }
    
    void tampilkan(){
        System.out.println("Volume Kubus : " + volume());
        System.out.println("Keliling Kubus : " + keliling());
    }
}
