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
   private String deviceKeComputer;

    public Computer(String merk, String type, String deviceKeComputer) {
        this.merk = merk;
        this.type = type;
        this.deviceKeComputer = deviceKeComputer;
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

    public String getDeviceKeComputer() {
        return deviceKeComputer;
    }

    public void setDeviceKeComputer(String deviceKeComputer) {
    }
    
    
    public String info(){
        String info = "";
        info += "Merk : "+this.merk+ "\n";
        info += "Type : "+this.type+ "\n";
        info += " Terhubung... "+this.deviceKeComputer+ "\n";
        return info;
    }
    
}
