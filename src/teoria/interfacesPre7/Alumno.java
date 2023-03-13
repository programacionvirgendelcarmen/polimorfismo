package teoria.interfacesPre7;

public class Alumno implements Persona{
    private String dni;
    private String nombreAlumno;
    private String centroAcademico;

    public Alumno(String dni, String nombreAlumno, String centroAcademico) {
        this.dni = dni;
        this.nombreAlumno = nombreAlumno;
        this.centroAcademico = centroAcademico;
    }

    @Override
    public String identificar() {
        return "ALUMNO";
    }

    @Override
    public String getNombreCentro() {
        return centroAcademico;
    }

    @Override
    public String toString() {
        return String.format("%s,%S,%S,%s",
                identificar(), dni, nombreAlumno, getNombreCentro());
    }
}
