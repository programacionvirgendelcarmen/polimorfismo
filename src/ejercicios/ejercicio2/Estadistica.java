package ejercicios.ejercicio2;

public interface Estadistica {
    int obtenerNumeroValores(); //número de elementos de una colección
    double obtenerValorMinimo(); //valor mı́nimo de una colección
    double obtenerValorMaximo(); //valor máximo de una colección
    double calcularSuma(); //suma de los valores de una colección
    double calcularValorMedio(); //valor medio de de una colección
    double calcularDesviacionTipica(); //desviación tı́pica de de una colección

     default void mostrarDatos() {
        System.out.printf("Nº de valores del array %d%n", obtenerNumeroValores());
        System.out.printf("Valor mas pequeño %.2f%n", obtenerValorMinimo());
        System.out.printf("Valos mas grande %.2f%n", obtenerValorMaximo());
        System.out.printf("Suma de valores %.2f%n", calcularSuma());
        System.out.printf("Valor medio %.2f%n", calcularValorMedio());
        System.out.printf("Desviación típica %.2f%n", calcularDesviacionTipica());
    }
}
