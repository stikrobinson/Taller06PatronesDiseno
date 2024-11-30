/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06patronesdiseno.Decorator;

/**
 *
 * @author jarec
 */
class WhatsAppDecorator extends BaseDecorator{
    
    public WhatsAppDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void enviar() {
        super.enviar();
        System.out.println("Enviando notificacion por WhatsApp...");
    }
    
}
class SignalDecorator extends BaseDecorator {
    
    public SignalDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void enviar() {
        super.enviar();
        System.out.println("Enviando notificacion por Signal...");
    }
}

class TelegramDecorator extends BaseDecorator {
    
    public TelegramDecorator(Notifier notifier) {
        super(notifier);
    }
    public void enviar() {
        super.enviar();
        System.out.println("Enviando notificacion por Telegram...");
    }
    
}

class WireDecorator extends BaseDecorator {
    
    public WireDecorator(Notifier notifier) {
        super(notifier);
    }
    public void enviar() {
        super.enviar();
        System.out.println("Enviando notificacion por Wire...");
    }
    
}