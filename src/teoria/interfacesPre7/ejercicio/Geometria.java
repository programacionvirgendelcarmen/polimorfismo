package teoria.interfacesPre7.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Geometria {
    private String nombreGeometria;
    private List<Figura> figuras = new ArrayList<>();

    public Geometria(String nombreGeometria) {
        this.nombreGeometria = nombreGeometria;
    }

    public String getNombreGeometria() {
        return nombreGeometria;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setNombreGeometria(String nombreGeometria) {
        this.nombreGeometria = nombreGeometria;
    }
    public boolean addFigura (Figura figura) {
        return figuras.add(figura);
    }
    public List<Figura> buscarPorTipoFigura(String tipo) {
        List<Figura> figurasEncontradas = new ArrayList<>();
        for (Figura figura : figuras) {
           if (figura.nombrar().toLowerCase().
                   contains(tipo.toLowerCase()))
               figurasEncontradas.add(figura);
        }
        return figurasEncontradas;
    }
    public boolean borrarFigura(Figura figura){
        return figuras.remove(figura);
    }
    //método que devuelva la figura de mayor área
}
