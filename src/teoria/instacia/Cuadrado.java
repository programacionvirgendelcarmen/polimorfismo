package teoria.instacia;

public class Cuadrado extends FiguraRegular{
    public Cuadrado(double longitudLado) {
        super("CUADRADO", 4, longitudLado);
    }

    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
}
