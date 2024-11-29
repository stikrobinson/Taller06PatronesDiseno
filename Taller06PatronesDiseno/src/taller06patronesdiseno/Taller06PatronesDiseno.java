/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller06patronesdiseno;
import taller06patronesdiseno.Facade.Facade;
import taller06patronesdiseno.Facade.CanalMovil;
import taller06patronesdiseno.Facade.CanalTelefonico;
import taller06patronesdiseno.Facade.CanalWeb;

/**
 *
 * @author CltControl
 */
public class Taller06PatronesDiseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Facade
        Facade facade=new Facade();
        CanalWeb canalWeb=new CanalWeb(facade);
        canalWeb.realizarTransaccion();
        CanalMovil canalMovil=new CanalMovil(facade);
        canalMovil.realizarTransaccion();
        CanalTelefonico canalTelefonico=new CanalTelefonico(facade);
        canalTelefonico.realizarTransaccion();

    }
    
}
