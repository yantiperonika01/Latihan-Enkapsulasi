/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_enkapsulasi;

/**
 *
 * @author ITB INDONESIA
 */
public class Latihan_Enkapsulasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Nilai n = new Nilai();
      n.setNilaipraktek(8);
      n.setNilaiteori(6);
      
      
      System.out.println("Nilaipraktek:" + n.getNilaipraktek());
      System.out.println("Nilaiteori:" + n.getNilaiteori());
      System.out.println("Nilaiakhir:" + n.getNilaiakhir());
      
      
    }
    
}
