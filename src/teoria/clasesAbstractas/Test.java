package teoria.clasesAbstractas;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<FiguraRegular> figuras = new ArrayList<>();
        FiguraRegular cuadrado  =  new Cuadrado(3.2);
        FiguraRegular triangulo = new TrianguloEquilatero(1.12);
        figuras.add(cuadrado);
        figuras.add(triangulo);
        mostrarDatos(figuras);
        //FiguraRegular rara =
          //      new FiguraRara("mm", 5, 5.5);
    }

    private static void mostrarDatos(List<FiguraRegular> figuras) {
        for (FiguraRegular figura : figuras) {
            System.out.printf("%s: perímetro: %.2f%n",
                    figura.getNombreFigura(), figura.calcularPerimetro());
         System.out.printf("%s: área: %.2f%n",
                  figura.getNombreFigura(), figura.calcularArea());
        }
    }
}
