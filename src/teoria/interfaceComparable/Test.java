package teoria.interfaceComparable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("guzman hernández", "juan",
                LocalDate.of(2000, 10, 10), "dni1"));
        personas.add(new Persona("garcía hernández", "pepe",
                LocalDate.of(2010, 10, 10), "dni2"));
        personas.add(new Persona("abolafia hernández", "luisa",
                LocalDate.of(2007, 10, 10), "dni3"));
        personas.add(new Persona("hernández hernández", "juani",
                LocalDate.of(2020, 10, 10), "dni4"));
        personas.add(new Persona("zamora hernández", "isabel",
                LocalDate.of(1999, 10, 10), "dni5"));

        for (Persona persona : personas) {
            System.out.println(persona.nombrarPorApellidos());
        }
        System.out.println("-----------------------");
        Collections.sort(personas);
        for (Persona persona : personas) {
            System.out.println(persona.nombrarPorApellidos());
        }
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona persona, Persona t1) {
                return Helper.getEdad(persona.getFechaNacimiento()) -
                        Helper.getEdad(t1.getFechaNacimiento());
            }
        });
        System.out.println("-----------------------");
        for (Persona persona : personas) {
            System.out.println(persona.nombrarPorEdad());
        }
    }
}
