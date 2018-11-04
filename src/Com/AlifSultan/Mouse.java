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
class Mouse {
    private String jenisMouse;
    private String merkMouse;
     private String deviceKeComputer;

    public Mouse(String jenisMouse, String merkMouse, String deviceKeComputer) {
        this.jenisMouse = jenisMouse;
        this.merkMouse = merkMouse;
        this.deviceKeComputer = deviceKeComputer;
    }

    public String getJenisMouse() {
        return jenisMouse;
    }

    public void setJenisMouse(String jenisMouse) {
        this.jenisMouse = jenisMouse;
    }

    public String getMerkMouse() {
        return merkMouse;
    }

    public void setMerkMouse(String merkMouse) {
        this.merkMouse = merkMouse;
    }

    public String getDeviceKeComputer() {
        return deviceKeComputer;
    }

    public void setDeviceKeComputer(String deviceKeComputer) {
        this.deviceKeComputer = deviceKeComputer;
    }
    
     public String info(){
        String info = "";
        info += "Jenis Mouse : "+this.jenisMouse+ "\n";
        info += "Merk Mouse : "+this.merkMouse+ "\n";
        return info;
    }
}
