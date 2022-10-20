/*
 * Nuestra Clase Decorator, será del tipo abstracta y 
 * reescrbirá los metodos Prepararcomida() y PrecioComida() de las clases creadas 
 */
public abstract class ComidaDecorator implements Comida {
    private Comida newComida;
    public ComidaDecorator(Comida newComida){
        this.newComida = newComida;
    }

    @Override
    public String PrepararComida(){
        return newComida.PrepararComida();
    }

    @Override
    public double PrecioComida(){
        return newComida.PrecioComida();
    }
}
