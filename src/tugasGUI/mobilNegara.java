/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasGUI;

/**
 *
 * @author KomangRyan
 */
public class mobilNegara extends Mobil implements interfaceSirine{
    protected int nolventaris;
    protected boolean sirine = false;
    
    public mobilNegara(){
        super();   
    }
    
    public void nyalakanSirine(){
        this.sirine = true;
    }
    
    public void matikanSirine(){
        this.sirine = false;
    }
    
    public void gantiSuaraSirine(){
        System.out.println("suara sirine diganti");
    }
    
    public void setNomorInv(int n){
        this.nolventaris = n;
    }
    
    public int getNomorInv(){
        return this.nolventaris;
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

