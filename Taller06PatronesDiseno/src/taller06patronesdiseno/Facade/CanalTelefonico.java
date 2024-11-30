package taller06patronesdiseno.Facade;

public class CanalTelefonico extends CanalVirtual {
    
    public CanalTelefonico(Facade facade){
        super(facade);
    }

    public void realizarTransaccion(){
        System.out.println("Canal Telefonico: realizando transaccion ...");
        facade.padarDeuda();
    }
}
