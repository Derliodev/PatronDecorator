import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.text.html.Option;

public class MenuComida {
    private static int opcion;
    public static void main(String[] args) throws NumberFormatException, IOException {
        do{
            System.out.println("\n================MENU================\n");
            System.out.println("    1.- Vegetariano \n");
            System.out.println("    2.- No Vegetariano \n");
            System.out.println("    3.- Comida China \n");
            System.out.println("    4.- Salir \n");
            System.out.println(" Ingrese su Opcion: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcion = Integer.parseInt(br.readLine());
            switch (opcion) {
                case 1:{
                    Vegetariano vf = new Vegetariano();
                    System.out.println(vf.PrepararComida());
                    System.out.println(vf.PrecioComida());
                } break;
                case 2:{
                    Comida fl = new NoVegetariano((Comida) new Vegetariano());
                    System.out.println(fl.PrepararComida());
                    System.out.println(fl.PrecioComida());
                } break;
                case 3:{
                    Comida f2 = new ComidaChina((Comida) new Vegetariano());
                    System.out.println(f2.PrepararComida());
                    System.out.println(f2.PrecioComida());
                } break;
                default:{
                    System.out.println("\nHa salido del sistema\n");
                }
                return;
            }
        }while(opcion!=4);
        
    }

}
