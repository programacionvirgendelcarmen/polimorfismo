package teoria.interfaces.ejercicio.poligonos;

public abstract class PoligonoRegular extends Poligono{
    private double longitudLado;



    public PoligonoRegular(int numeroLados, double longitudLado) {
        super(numeroLados);
        this.longitudLado = longitudLado;
    }

    public double getLongitudLado() {
        return longitudLado;
    }

    @Override
    public double calcularPerimetro() {
        return getNumeroLados() * longitudLado;
    }

    @Override
    public String nombrar() {
        return String.format("%s,%s",
                super.nombrar(), "POLÍGONO_REGULAR");
    }
}
