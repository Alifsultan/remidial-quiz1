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
public class MainComputer {
    public static void main(String[] args){
        Keyboard k = new Keyboard("qwerty","logitech");
        Mouse m = new Mouse (" mouse gaming ", " logitech ");
        Computer com = new Computer(" ASUS ", " A 456U ");
        
        System.out.println("spesifikasi Laptop saya : " + com.info());
        System.out.println ("Jenis Mouse yang saya gunakan :" + m.getJenisMouse());
        System.out.println ("merk keyboard ku : " + k.getMerkKeyboard());
        
    }
}
