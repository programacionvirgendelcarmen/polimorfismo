package teoria.generalidades;

public class Hija extends Padre{
    @Override
    public String metodo2(String palabra) {
        return palabra.toLowerCase();
    }

    @Override
    public String metodo1(String minuscula) {
        return "Convertiendo a mayúscula " + super.metodo1(minuscula);
    }
}
