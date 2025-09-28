
public class HolaMundo 
{
    private String Saludo;

    public HolaMundo() {
    }

    public HolaMundo(String Saludo) {
        this.Saludo = Saludo;
    }

    public String getSaludo() {
        return Saludo;
    }

    public void setSaludo(String Saludo) {
        this.Saludo = Saludo;
    }

    @Override
    public String toString() {
        return "HolaMundo{" + "Saludo=" + Saludo + '}';
    }

}
