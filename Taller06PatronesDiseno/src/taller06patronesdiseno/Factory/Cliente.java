/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06patronesdiseno.Factory;

/**
 *
 * @author sebsm
 */
public class Cliente {
    //logica
    TarjetaFactory tarjetaFactory;
    
    String tipoTarjeta; //logica para obtener el tipo de tarjeta
    
    switch(tipoTarjeta){
        case "Premium":
            tarjetaFactory = new TarjetaPremiumFactory();
        case "VIP":
            tarjetaFactory = new TarjetaVIPFactory();
        default:
            tarjetaFactory = new TarjetaBasicaFactory();
    }
            
    tarjetaFactory.crearTarjeta();
    //logica
}
