/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasGUI;

/**
 *
 * @author KomangRyan
 */
public class mobilTransport extends Mobil{
    protected double tarif;
    
    public mobilTransport(){
        super();
        this.tarif = 0;
        
    }
    
    public void setTarif(){
       
        this.tarif = 0;
    }
    public double getTarif(){
        return this.tarif;
    }
       public void nyalakanMesin(){
        this.mesin = true;
    }
    public void matikanMesin(){
        this.mesin = false;
    }
    public void tambahGerigi(){
        this.gerigi=0;
    }
    public void turunkanGerigi(){
        this.gerigi=0;
    }
    public void tekanGas(){
        this.gas = true;
    }
    public void tekanRem(){
        this.rem = true;
    }     
    public void nyalakanTV(){
       this.tv = true;
    }
   
    public void matikanTV(){
       this.tv = false;
    }
    public void nyalakanAC(){
     this.ac = true;   
    }
    public void matikanAC(){
     this.ac = false;  
    }
    public void nyalakantape(){
     this.tape = true;
    }
    public void matikanTape(){
      this.tape = false; 
    }
}

