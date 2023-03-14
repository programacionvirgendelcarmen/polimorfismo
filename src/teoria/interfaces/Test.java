package teoria.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Persona pr1  = new Profesor("11111111h", "joaquina cortés", "IES Virgen del Carmen");
        Persona al1  = new Alumno("22222222j", "luisa méndez", "IES Virgen del Carmen");
        lista.add(pr1);
        lista.add(al1);
        mostrarDatos(lista);
    }

    private static void mostrarDatos(List<Persona> lista) {
        for (Persona persona : lista) {
            System.out.println(persona);
        }
        //lista.forEach(System.out::println); es lo mismo que arriba
    }
}
