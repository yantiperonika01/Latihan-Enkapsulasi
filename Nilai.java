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
public class Nilai {
 
    private int Nilaipraktek;
    private int Nilaiteori;
    
    public int getNilaipraktek(){
        return Nilaipraktek;
    }
    public void setNilaipraktek(int Nilaipraktek){
        this.Nilaipraktek= Nilaipraktek;
    }
    public int getNilaiteori(){
        return Nilaiteori;
    }
    public void setNilaiteori(int Nilaiteori){
        this.Nilaiteori= Nilaiteori;
    }
    public Nilai(){
        int p=0;
        int t=0;
    }   
    
    public int Nilaiakhir (int np,int nt){
        return ( np+nt ) /2;
    }
   
    public int getNilaiakhir(){ 
   return Nilaiakhir(Nilaipraktek, Nilaiteori);
     }  
}
    

    
        
    
    

