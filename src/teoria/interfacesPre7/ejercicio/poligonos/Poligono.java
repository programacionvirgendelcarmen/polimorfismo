package teoria.interfacesPre7.ejercicio.poligonos;

import teoria.interfacesPre7.ejercicio.Figura;

import java.util.Objects;

public abstract class Poligono implements Figura {
    private int numeroLados;

    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }


    @Override
    public String nombrar() {
        return "POLÍGONO";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poligono poligono = (Poligono) o;
        return numeroLados == poligono.numeroLados;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroLados);
    }
}
