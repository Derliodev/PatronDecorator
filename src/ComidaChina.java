public class ComidaChina extends ComidaDecorator {
    public ComidaChina(Comida newComida) {
        super(newComida);
    }

    public String PrepararComida() {
        return super.PrepararComida() + " Agregar Arroz ";
    }

    public double PrecioComida() {
        return super.PrecioComida() + 650.0;
    }

}
