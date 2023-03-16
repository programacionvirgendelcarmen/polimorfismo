package ejercicios.ejercicio2;

import java.util.List;

public class ListaReales implements Estadistica{

    private List<Double> numeros;

    public ListaReales(List<Double> numeros) {
        this.numeros = numeros;
    }



    @Override
    public int obtenerNumeroValores() {
        return numeros.size();
    }

    @Override
    public double obtenerValorMinimo() {
        double minimoValor = Double.MAX_VALUE;
        for (double numero : numeros) {
            if (numero < minimoValor)
                minimoValor = numero;
        }
        return minimoValor;
    }

    @Override
    public double obtenerValorMaximo() {
        double maximoValor = - Double.MAX_VALUE;
        for (double numero : numeros) {
            if (numero > maximoValor)
                maximoValor = numero;
        }
        return maximoValor;
    }

    @Override
    public double calcularSuma() {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    @Override
    public double calcularValorMedio() {
        return calcularSuma() / obtenerNumeroValores();
    }

    @Override
    public double calcularDesviacionTipica() {
        double media = calcularValorMedio();
        double sumatorio = 0;
        for (double numero : numeros) {
            sumatorio += Math.pow(numero - media , 2);
        }
        return Math.sqrt(sumatorio / obtenerNumeroValores());
    }
}
