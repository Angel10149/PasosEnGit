
import java.util.ArrayList;


public class Historial {
    private Calculadora calc;
    private ArrayList<Double> historial; 

    public Historial() {
        calc = new Calculadora();
        historial = new ArrayList<>();
    }

    public int sumar(int a, int b) {
        int resultado = calc.sumar(a, b);
        historial.add((double) resultado);
        return resultado;
    }

    public int sumar(int a, int b, int c) {
        int resultado = calc.sumar(a, b, c);
        historial.add((double) resultado);
        return resultado;
    }

    public double sumar(double a, double b) {
        double resultado = calc.sumar(a, b);
        historial.add(resultado);
        return resultado;
    }

    public void mostrarHistorial() {
        System.out.println("Historial de resultados:");
        for (double res : historial) {
            System.out.println(res);
        }
    }
}
