package teoria.instacia;



import java.util.ArrayList;
import java.util.List;

public class TestInstancia {
    public static void main(String[] args) {
        List<FiguraRegular> figuras = new ArrayList<>();
        FiguraRegular cuadrado  =  new Cuadrado(3.2);
        FiguraRegular triangulo = new TrianguloEquilatero(1.12);
        figuras.add(cuadrado);
        figuras.add(triangulo);
        mostrarDatos(figuras);

    }

    private static void mostrarDatos(List<FiguraRegular> figuras) {
        for (FiguraRegular figura : figuras) {
            System.out.printf("%s: perímetro: %.2f%n",
                    figura.getNombreFigura(), figura.calcularPerimetro());
            if (figura instanceof Cuadrado) {
                Cuadrado cuadrado = (Cuadrado) figura;
                System.out.printf("%s: área: %.2f%n",
                        figura.getNombreFigura(), cuadrado.calcularArea());
            }
            if (figura instanceof TrianguloEquilatero) {
                TrianguloEquilatero trianguloEquilatero = (TrianguloEquilatero) figura;
                System.out.printf("%s: área: %.2f%n",
                        figura.getNombreFigura(), trianguloEquilatero.calcularArea());
            }

        }
    }
}
