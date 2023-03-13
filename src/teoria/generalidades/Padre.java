package teoria.generalidades;

public abstract class Padre {
    public String metodo1(String minuscula) {
        return minuscula.toUpperCase();
    }
    public abstract String metodo2(String palabra);
}
