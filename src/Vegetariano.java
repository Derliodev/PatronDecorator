/*
 * Clase básica con un ingrediente al menú básico
 */

public class Vegetariano implements Comida {
    public String PrepararComida(){
        return "Vegetariano";
    }

    public double PrecioComida(){
        return 50.0;
    }
}
