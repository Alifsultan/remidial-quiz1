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
class Keyboard {
   private String jenisKeyboard;
   private String merkKeyboard;
   private String deviceKeComputer;

    public Keyboard(String jenisKeyboard, String merkKeyboard, String deviceKeComputer) {
        this.jenisKeyboard = jenisKeyboard;
        this.merkKeyboard = merkKeyboard;
        this.deviceKeComputer = deviceKeComputer;
    }

    public String getJenisKeyboard() {
        return jenisKeyboard;
    }

    public void setJenisKeyboard(String jenisKeyboard) {
        this.jenisKeyboard = jenisKeyboard;
    }

    public String getMerkKeyboard() {
        return merkKeyboard;
    }

    public void setMerkKeyboard(String merkKeyboard) {
        this.merkKeyboard = merkKeyboard;
    }

    public String getDeviceKeComputer() {
        return deviceKeComputer;
    }

    public void setDeviceKeComputer(String deviceKeComputer) {
        this.deviceKeComputer = deviceKeComputer;
    }
    
    public String info(){
        String info = "";
        info += "Jenis Keyboard : "+this.jenisKeyboard+ "\n";
        info += "Merk Keyboard : "+this.merkKeyboard+ "\n";
        return info;
    }
}
