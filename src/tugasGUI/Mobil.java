/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasGUI;

/**
 *
 * @author KomangRyan
 */
public abstract class Mobil implements interfaceMobil{
  protected  boolean mesin = false;
    int gerigi = 0;
  protected  boolean gas = false;
  protected  boolean rem = false;
  protected  boolean tv = false;
  protected  boolean ac = false;
  protected boolean tape = false;
    
    public Mobil(){
        this.mesin = false;
        this.gerigi = 0;
        this.gas = false;
        this.rem = false;
        this.tv = false;
        this.ac = false;
        this.tape = false;
        
        
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
     public boolean getnyalakanTV(){
        return this.tv;
    }
     
    public abstract void nyalakanTV();
    public abstract void matikanTV();
    public abstract void nyalakanAC();
    public abstract void matikanAC();
    public abstract void nyalakantape();
    public abstract void matikanTape();
    
    public void info(){
    }  
}
