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

    public Keyboard() {
    }

    public Keyboard(String jenisKeyboard, String merkKeyboard) {
        this.jenisKeyboard = jenisKeyboard;
        this.merkKeyboard = merkKeyboard;
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
   
    public String info(){
        String info = "";
        info += "Jenis Keyboard : "+this.jenisKeyboard+ "\n";
        info += "Merk Keyboard  : "+this.merkKeyboard+ "\n";
        return info;
    }
}
