package teoria.interfaces.ejercicio;

import java.util.List;

public interface Figura {
    double PI = Math.PI;
    String nombrar();
    double calcularPerimetro();
    double calcularArea();
    default String obtenerInformacionDeFigura() {
        StringBuilder builder = new StringBuilder();
        builder.append("DATOS: ").append(nombrar()).append('\n');
        builder.append("ÁREA: ").append(calcularArea()).append('\n');
        builder.append("PERÍMETRO: ").append(calcularPerimetro()).append('\n');
        return builder.toString();
    }
    static Figura getFiguraMenorPerimetro(List<Figura> figuras) {
        return null;
    }
}
