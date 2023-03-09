package teoria.clasesAbstractas;

public abstract class FiguraRegular {
    private String nombreFigura;
    private int numeroLados;
    private double longitudLado;

    public FiguraRegular(String nombreFigura, int numeroLados, double longitudLado) {
        this.nombreFigura = nombreFigura;
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public double getLongitudLado() {
        return longitudLado;
    }
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }

    public abstract double calcularArea();
}
