/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller06patronesdiseno;

/**
 *
 * @author CltControl
 */
public class Taller06PatronesDiseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
    
