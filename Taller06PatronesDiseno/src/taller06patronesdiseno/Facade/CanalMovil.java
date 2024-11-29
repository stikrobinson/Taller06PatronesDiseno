package taller06patronesdiseno.Facade;

public class CanalMovil extends CanalVirtual{
    
    public CanalMovil(Facade facade){
        super(facade);
    }

    public void realizarTransaccion(){
        System.out.println("Canal Movil: Realizando transaccion ...");
        facade.consultarSaldo();
    }
}
