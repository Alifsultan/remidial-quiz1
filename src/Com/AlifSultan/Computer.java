/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.AlifSultan;

/**
 *
 * @author Administrator
 */
public class Computer {
   private String merk;
   private String type;

    public Computer(String merk, String type) {
        this.merk = merk;
        this.type = type;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String info(){
        String info = "";
        info += "Merk Komputer : "+this.merk+ "\n";
        info += "Type Komputer  : "+this.type+ "\n";
        return info;
    }
    
}
