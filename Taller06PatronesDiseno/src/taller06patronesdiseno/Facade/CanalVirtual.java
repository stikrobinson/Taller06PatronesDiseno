package taller06patronesdiseno.Facade;

public abstract class CanalVirtual {
    protected Facade facade;

    public CanalVirtual(Facade facade){
        this.facade=facade;
    }

    public abstract void realizarTransaccion();
}
