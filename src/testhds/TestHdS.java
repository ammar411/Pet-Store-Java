/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testhds;

/**
 *
 * @author Ammar
 */
public class TestHdS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          HotDogStand stand1 = new HotDogStand(1, 10);
        HotDogStand stand2 = new HotDogStand(2, 15);
        HotDogStand stand3 = new HotDogStand(3, 5);

     
        stand1.justSold();
        stand2.justSold();
       
       stand3.justSold();
 
        

        System.out.printf("Hot Dog Stand %d sold %d hot dogs%n", stand1.getIdNumber(), stand1.getHotDogsSold());
        System.out.printf("Hot Dog Stand %d sold %d hot dogs%n", stand2.getIdNumber(), stand2.getHotDogsSold());
        System.out.printf("Hot Dog Stand %d sold %d hot dogs%n", stand3.getIdNumber(), stand3.getHotDogsSold());
    }
    
}
