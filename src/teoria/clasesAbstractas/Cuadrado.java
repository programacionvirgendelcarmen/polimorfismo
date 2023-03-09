package teoria.clasesAbstractas;

public class Cuadrado extends FiguraRegular{
    public Cuadrado(double longitudLado) {
        super("CUADRADO", 4, longitudLado);
    }

    @Override
    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }
    /*public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }*/
}
