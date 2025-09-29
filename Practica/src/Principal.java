
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Controller controller = new Controller(new Scanner(System.in));
        try {
            controller.menu();
        } catch (IOException e) {
            System.out.println("Ocurrio un error de E/S: "+ e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Entrada de no valida"+e.getMessage());
        }catch (Exception e){
            System.out.println("Error no controlado "+e.getMessage());
        }
    }
}
