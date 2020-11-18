/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan57.vehicle;

/**
 *
@author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Class Skateboard
 */
public class Skateboard extends Vehicle {
    private double myBoardLegth;
    
    public Skateboard(){
        System.out.println("Skateboard");
}

    public double getMyBoardLegth() {
        return myBoardLegth;
    }

    public void setMyBoardLegth(double myBoardLegth) {
        this.myBoardLegth = myBoardLegth;
    }
    
}
