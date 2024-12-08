
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testhds;

/**
 *
 * @author Ammar
 */
public class HotDogStand {
  
 
    private int idNumber;
    private int hotDogsSold;

    public HotDogStand(int idNumber, int hotDogsSold) {
        this.idNumber = idNumber;
        this.hotDogsSold = hotDogsSold;
    }

    public void justSold() {
        hotDogsSold++;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getHotDogsSold() {
        return hotDogsSold;
    }

    

   

}
