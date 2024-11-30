/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06patronesdiseno;

/**
 *
 * @author jarec
 */
class BaseDecorator implements Notifier{
    protected Notifier notifier;
    
    
    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    
    
    @Override
    public void enviar() {
        notifier.enviar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
