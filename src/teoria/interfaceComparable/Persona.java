package teoria.interfaceComparable;

import java.time.LocalDate;
import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String apellidos;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;

    public Persona (
            String apellidos, String nombre, LocalDate fechaNacimiento, String dni) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String nombrarPorApellidos(){
        StringBuilder builder = new StringBuilder();
        builder.append(apellidos).append(',').append(nombre);
        builder.append(',').append(dni).append(',');
        builder.append(Helper.getEdad(fechaNacimiento));
        return builder.toString();
    }
    public String nombrarPorEdad(){
        StringBuilder builder = new StringBuilder();
        builder.append(Helper.getEdad(fechaNacimiento)).append(',');
        builder.append(apellidos).append(',').append(nombre);
        builder.append(',').append(dni);

        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equals(persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Persona persona) {
        return this.apellidos.compareTo(persona.apellidos);
    }
}
