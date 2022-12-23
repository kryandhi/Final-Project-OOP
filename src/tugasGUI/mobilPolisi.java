/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasGUI;

/**
 *
 * @author KomangRyan
 */
public class mobilPolisi extends mobilNegara{
    protected boolean HT = false;
    
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
