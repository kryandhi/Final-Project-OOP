/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package platihan;

/**
 *
 * @author KomangRyan
 */
public interface Interpace {
  
    public void nyalakanMesin();
    public void matikanMesin();
    public void tambahGerigi();
    public void turunkanGerigi();
    public void tekanGas();
    public void tekanRem();
    public void info();
}

abstract class Mobil implements Interpace{
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

class mobilTransport extends Mobil{
    private double tarif;
    
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

interface interfaceSirine {
    public void nyalakanSirine();
    public void matikanSirine();
    public void gantiSuaraSirine();
}

abstract class mobilNegara extends Mobil implements interfaceSirine{
    private int nolventaris;
    private boolean sirine;
    
    public mobilNegara(){
        super();
        
    }
    public void nyalakanSirine(){}
    public void matikanSirine(){}
    public void gantiSuaraSirine(){}
    public void setNomorInv(int n){
        this.nolventaris = n;
    }
    public int getNomorInv(){
        return this.nolventaris;
    }
    public void nyalakanTV(){}
    public void matikanTV(){}
    public void nyalakanAC(){}
    public void matikanAC(){}
    public void nyalakantape(){}
    public void matikanTape(){}
}

class bus extends mobilTransport{
    private int jmlKursi;
    
    public bus(){
        super();
        
    }
    
    public void tambahPenumpang(){}
    public void kurangiPenumpang(){}
}

class mobilPribadi extends Mobil{
    private String jenis;
    
    public mobilPribadi(){
        super();
        
    }
    public void setjenis(String m){
        this.jenis=m;
    }
    public String getJenis(){
        return this.jenis;
    }
    public void nyalakanTV(){}
    public void matikanTV(){}
    public void nyalakanAC(){}
    public void matikanAC(){}
    public void nyalakantape(){}
    public void matikanTape(){}
}

class truk extends mobilPribadi{
    private double ukuranBak;
    
    public truk(){
        super();
        
    }
    public void setUkuranBak(double u){
        this.ukuranBak = u;
    }
    public double getUkuranBak(){
        return this.ukuranBak;
    }
}

class Ambulance extends mobilNegara{
    private String model;
    
    public Ambulance(){
        super();
        
    }
    
    public void setModel(String m){
        this.model=m;
    }
    public String getModel(){
        return this.model;
    }
}

class mobilPolisi extends mobilNegara{
    private boolean HT=false;
    
    public mobilPolisi(){
        super();
        
    }
    
    public void nyalakanHT(){
        this.HT=true;
    }
    public void matikanHT(){
        this.HT=false;
    }
}

