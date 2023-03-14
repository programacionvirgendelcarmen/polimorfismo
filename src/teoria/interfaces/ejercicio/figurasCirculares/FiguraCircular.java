package teoria.interfaces.ejercicio.figurasCirculares;

import teoria.interfaces.ejercicio.Figura;

import java.util.Objects;

public abstract class FiguraCircular implements Figura {
    private double semiejeMayor;
    private double semiejeMenor;

    public FiguraCircular(double semiejeMayor, double semiejeMenor) {
        this.semiejeMayor = semiejeMayor;
        this.semiejeMenor = semiejeMenor;
    }

    public double getSemiejeMayor() {
        return semiejeMayor;
    }

    public double getSemiejeMenor() {
        return semiejeMenor;
    }


    @Override
    public String nombrar() {
        return "FIGURA_CIRCULAR";
    }

    @Override
    public double calcularArea() {
        return PI * getSemiejeMayor() * getSemiejeMenor() ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FiguraCircular that = (FiguraCircular) o;
        return Double.compare(that.semiejeMayor, semiejeMayor) == 0 && Double.compare(that.semiejeMenor, semiejeMenor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(semiejeMayor, semiejeMenor);
    }

}
