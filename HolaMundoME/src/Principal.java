public class Principal{
    public static void main (String[] args) 
    {
        HolaMundo saludo = new HolaMundo("Hola Mundo desde Java!!!");
        Controller controller = new Controller();
        controller.inscribirSaludo(saludo);
    }
}
