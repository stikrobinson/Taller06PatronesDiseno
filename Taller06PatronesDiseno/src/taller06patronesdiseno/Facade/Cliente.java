/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06patronesdiseno.Facade;

/**
 *
 * @author sebsm
 */
public class Cliente {
    public static void main(String[] args) {
        // TODO code application logic here
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
