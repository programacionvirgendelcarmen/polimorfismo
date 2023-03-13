package teoria.instacia;

public class TrianguloEquilatero extends FiguraRegular{
    public TrianguloEquilatero( double longitudLado) {
        super("TRIÁNGULO EQUILATERO" ,3, longitudLado);
    }

    public double calcularArea() {
        return Math.sqrt(3.0) / 4.0 * getLongitudLado() * getLongitudLado();
    }
}
