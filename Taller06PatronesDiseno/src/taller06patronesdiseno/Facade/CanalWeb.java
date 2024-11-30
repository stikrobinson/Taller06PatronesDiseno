package taller06patronesdiseno.Facade;

public class CanalWeb  extends CanalVirtual{
    
    public CanalWeb(Facade facade){
        super(facade);
    }

    public void realizarTransaccion(){
        System.out.println("Canal Web: Realizando Transaccion ...");
        facade.realizarVenta();
    }
}
