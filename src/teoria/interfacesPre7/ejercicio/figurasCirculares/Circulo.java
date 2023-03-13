package teoria.interfacesPre7.ejercicio.figurasCirculares;

public class Circulo extends FiguraCircular{
    public Circulo(double radio) {
        super(radio, radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 * PI * getSemiejeMayor();
    }

    @Override
    public String nombrar() {
        return String.format("%s,%s", super.nombrar(), "CÍRCULO");
    }


}
