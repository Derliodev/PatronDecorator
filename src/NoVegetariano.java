public class NoVegetariano extends ComidaDecorator {
    public NoVegetariano(Comida newComida){
        super(newComida);
    }
    public String PrepararComida(){
        return super.PrepararComida() + " Agregar Pollo ";

    }

    public double PrecioComida(){
        return super.PrecioComida() +150.0;

    }

}
