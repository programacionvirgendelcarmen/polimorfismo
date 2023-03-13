package teoria.generalidades;

public class Test {
    public static void main(String[] args) {
       // Padre padre = new Padre(); no se pueden crear objetos de la clase Padre
        Padre hija = new Hija();
        System.out.println(hija.metodo1("Hola"));
        System.out.println(hija.metodo2("Hola"));
    }
}
