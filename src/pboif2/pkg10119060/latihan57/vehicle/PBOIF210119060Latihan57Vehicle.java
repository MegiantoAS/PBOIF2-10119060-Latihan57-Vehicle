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
 Deskripsi    : Program Vehicle
 */
public class PBOIF210119060Latihan57Vehicle {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //Bicycle
        Bicycle objBicycle = new Bicycle();
        
        objBicycle.setMyBrand("Trek Bike");
        System.out.println("Brand : "+objBicycle.getMyBrand());
        
        objBicycle.setMyModel("7.4FX");
        System.out.println("Model : "+objBicycle.getMyModel());
        
        objBicycle.setMyGearCount(23);
        System.out.println("Jumlah Gear : "+objBicycle.getMyGearCount());
        System.out.println("");
        //Sjkateboard
        Skateboard objSkateboard = new Skateboard();
        
        objSkateboard.setMyBrand("Ally Skate");
        System.out.println("Barand : "+objSkateboard.getMyBrand());
        
        objSkateboard.setMyModel("Rocket");
        System.out.println("Model : "+objSkateboard.getMyModel());
        
        objSkateboard.setMyBoardLegth(54.5);
        System.out.println("Panjanganya Board : "+objSkateboard.getMyBoardLegth());
    }
    
}
