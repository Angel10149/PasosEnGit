
import java.io.IOException;
import java.util.Scanner;


public class Controller {
    private final Scanner sc;
    
    public Controller (Scanner sc){
        this.sc = sc;
    }
    public void menu() throws IOException{
        int opc;
        do{
            System.out.println("\nMenú de opciones");
            System.out.println("1. calculadora");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            try {
                opc = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                opc = -1;
            }
            switch (opc) {
                case 1:
                    demoCalculadora();
                    break;
                default:
                    throw new AssertionError();
            }
        }while(true && !false);
    }
    private void demoCalculadora(){
        Historial h = new Historial();
        System.out.println("Sumar 2 + 3 = "+h.sumar(2, 3));
        System.out.println("Sumar 1 + 2 + 3 = "+h.sumar(1,2, 3));
        System.out.println("Sumar 2.3 + 5.9 = "+h.sumar(2.3, 5.9));
        h.mostrarHistorial();
    }
}
