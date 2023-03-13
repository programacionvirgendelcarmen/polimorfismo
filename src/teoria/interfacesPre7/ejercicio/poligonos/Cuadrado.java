package teoria.interfacesPre7.ejercicio.poligonos;

import java.util.Objects;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado( double longitudLado) {
        super(4, longitudLado);
    }

    @Override
    public double calcularArea() {
        return getLongitudLado() * getLongitudLado();
    }

    @Override
    public String nombrar() {
        return String.format("%s,%s", super.nombrar(), "CUADRADO");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuadrado poligono = (Cuadrado) o;
        return getLongitudLado() == poligono.getLongitudLado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLongitudLado());
    }
}
