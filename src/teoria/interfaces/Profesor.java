package teoria.interfaces;

public class Profesor implements Persona{
    private String dni;
    private String nombreProfesor;
    private String nombreCentro;

    public Profesor(String dni, String nombreProfesor, String nombreCentro) {
        this.dni = dni;
        this.nombreProfesor = nombreProfesor;
        this.nombreCentro = nombreCentro;
    }

    @Override
    public String identificar() {
        return "PROFESOR";
    }

    @Override
    public String getNombreCentro() {
        return nombreCentro;
    }

    @Override
    public String toString() {
        return String.format("%s,%S,%S,%s",
                identificar(), dni, nombreProfesor, getNombreCentro());
    }
}
