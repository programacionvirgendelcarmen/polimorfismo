package teoria.interfaceComparable;

import java.time.LocalDate;
import java.time.Period;

public class Helper {
    public static int getEdad(LocalDate fechaNacimiento) {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        return periodo.getYears();
    }
}
