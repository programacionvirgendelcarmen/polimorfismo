package ejercicios.ejercicio2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        double[] numbers = new Random().doubles(
                0, 350).limit(10).toArray();
        Estadistica arrayReales = new ArrayReales(numbers);
        System.out.printf("Nº de valores del array %d%n",
                arrayReales.obtenerNumeroValores());
        System.out.printf("Valor mas pequeño %.2f%n",
                arrayReales.obtenerValorMinimo());
        System.out.printf("Valos mas grande %.2f%n",
                arrayReales.obtenerValorMaximo());
        System.out.printf("Suma de valores %.2f%n",
                arrayReales.calcularSuma());
        System.out.printf("Valor medio %.2f%n",
                arrayReales.calcularValorMedio());
        System.out.printf("Desviación típica %.2f%n",
                arrayReales.calcularDesviacionTipica());
        System.out.println("******************************");
        arrayReales.mostrarDatos();
        System.out.println("*********************************");

        List<Double> doubles = List.of(1.1, 2.2, 3.3, 5.5, 6.6);
        Estadistica listaReales = new ListaReales(doubles);
        listaReales.mostrarDatos();



    }

}
