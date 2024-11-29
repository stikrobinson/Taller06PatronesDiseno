package taller06patronesdiseno.Facade;

public class Facade {
    private ModuloConsulta moduloConsulta;
    private ModuloPago moduloPago;
    private ModuloVenta moduloVenta;

    public Facade(){
        this.moduloConsulta=new ModuloConsulta();
        this.moduloPago=new ModuloPago();
        this.moduloVenta=new ModuloVenta();
    }

    public void realizarVenta(){
        moduloVenta.procesarVenta();
    }

    public void consultarSaldo(){
        moduloConsulta.obtenerSaldo();
    }

    public void padarDeuda(){
        moduloPago.procesarPago();
    }
}
