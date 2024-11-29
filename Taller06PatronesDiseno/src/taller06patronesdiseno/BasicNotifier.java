/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller06patronesdiseno;

/**
 *
 * @author jarec
 */
 class BasicNotifier implements Notifier {
    private String email;
    private String sms;

    @Override
    public void enviar() {
        System.out.println("Enviando notificación por SMS y correo electrónico...");
    }
}
