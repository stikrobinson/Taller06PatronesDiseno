/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06patronesdiseno.Factory;

/**
 *
 * @author sebsm
 */
public class TarjetaBasicaFactory extends TarjetaFactory {
    @Override
    public Tarjeta crearTarjeta(){
        return new TarjetaBasica();
    }
}
