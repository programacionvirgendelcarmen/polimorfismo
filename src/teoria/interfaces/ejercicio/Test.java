package teoria.interfaces.ejercicio;

import teoria.interfaces.ejercicio.Figura;
import teoria.interfaces.ejercicio.Geometria;
import teoria.interfaces.ejercicio.figurasCirculares.Circulo;
import teoria.interfaces.ejercicio.figurasCirculares.Elipse;
import teoria.interfaces.ejercicio.poligonos.Cuadrado;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Figura cuadrado1 = new Cuadrado(5.5);
        Figura cuadrado2 = new Cuadrado(6.5);
        Figura circulo1  = new Circulo(2.2);
        Figura circulo2  = new Circulo(1.1);
        Figura elipse1   = new Elipse(1.1, 0.2);
        Figura elipse2   = new Elipse(4.4, 3.3);

        Geometria geometria = new Geometria("geometría 1");
        geometria.addFigura(cuadrado1); geometria.addFigura(cuadrado2);
        geometria.addFigura(circulo1); geometria.addFigura(circulo2);
        geometria.addFigura(elipse1); geometria.addFigura(elipse2);

        mostrarDatos(geometria);

        System.out.println("///////Figura mas grande////////");
        Figura figuraGrande = geometria.getFiguraMayorArea();
        System.out.printf("%s-ÁREA: %.2f-PERÍMETRO: %.2f%n",
                figuraGrande.nombrar(), figuraGrande.calcularArea(),
                figuraGrande.calcularPerimetro());

        System.out.println("///////Figura mas grande////////");
        Figura figuraChica = Figura.getFiguraMenorPerimetro(geometria.getFiguras());
        System.out.printf("%s-ÁREA: %.2f-PERÍMETRO: %.2f%n",
                figuraChica.nombrar(), figuraChica.calcularArea(),
                figuraChica.calcularPerimetro());

        System.out.println("*******Buscando*********");
        Scanner sc = new Scanner(System.in);
        String nombreFigura = "";
        do {
            System.out.println("Introduce el nombre de figura a buscar");
            nombreFigura = sc.nextLine();
            List<Figura> lista = geometria.buscarPorTipoFigura(nombreFigura);
            for (Figura figura : lista) {
                System.out.printf("%s-ÁREA: %.2f-PERÍMETRO: %.2f%n",
                        figura.nombrar(), figura.calcularArea(),
                        figura.calcularPerimetro());
            }
        } while ( !nombreFigura.equalsIgnoreCase("fin"));
        sc.close();

        //borrando figuras
        Circulo circulo = new Circulo(1.1);
        geometria.borrarFigura(circulo);
        Figura elipse   = new Elipse(1.1, 0.2);
        geometria.borrarFigura(elipse);
        Cuadrado cuadrado = new Cuadrado(6.5);
        geometria.borrarFigura(cuadrado);
        mostrarDatos(geometria);


        System.out.println("---------Información completa-------------");
        for (Figura figura : geometria.getFiguras()) {
            System.out.println(figura.obtenerInformacionDeFigura());
        }


    }

    private static void mostrarDatos(Geometria geometria) {
        System.out.println(geometria.getNombreGeometria());
        System.out.println("=========Mostrando============");
        for (Figura figura : geometria.getFiguras()) {
            System.out.printf("%s-ÁREA: %.2f-PERÍMETRO: %.2f%n",
                    figura.nombrar(), figura.calcularArea(),
                    figura.calcularPerimetro());
        }
    }
}
