package teoria.clasesAbstractas;

public class Pentagono extends FiguraRegular{
    public Pentagono( double longitudLado) {
        super("PENTAGONO", 5, longitudLado);
    }

    @Override
    public double calcularArea() {
        return 0; //BUSCAR FÓRMULA
    }
}
