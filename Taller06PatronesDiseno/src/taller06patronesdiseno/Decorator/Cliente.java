/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06patronesdiseno.Decorator;

/**
 *
 * @author sebsm
 */
public class Cliente {
     public static void main(String[] args) {
        // TODO code application logic here
        // Crear una notificación básica
        Notifier notificacion = new BasicNotifier();
        // Agregar decoradores dinámicamente
        notificacion = new WhatsAppDecorator(notificacion);
        notificacion = new SignalDecorator(notificacion);
        notificacion = new WireDecorator(notificacion);
        notificacion = new TelegramDecorator(notificacion);
        // Enviar las notificaciones
        notificacion.enviar();
    }
}
