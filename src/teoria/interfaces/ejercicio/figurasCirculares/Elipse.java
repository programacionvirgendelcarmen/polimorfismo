package teoria.interfaces.ejercicio.figurasCirculares;

public class Elipse extends FiguraCircular{
    public Elipse(double semiejeMayor, double semiejeMenor) {
        super(semiejeMayor, semiejeMenor);
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 * PI * Math.sqrt(
                (Math.pow(getSemiejeMayor() ,2) +
                        Math.pow(getSemiejeMenor(), 2)) / 2.0);
    }

    @Override
    public String nombrar() {
        return String.format("%s,%s", super.nombrar(), "ELÍPSE" );
    }


}
