package BloqueJ;

public class Rectangulo {
    double base;
    double altura;

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Base x Altura
    public double calcularArea() {
        return base * altura;
    }

    // Suma de todos sus lados
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarResultados() {
        System.out.println("Resultados del Rectángulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}


    class MainRectangulo {
        public static void main(String[] args) {
            Rectangulo miRectangulo = new Rectangulo(5.0, 3.0);
            miRectangulo.mostrarResultados();
        }
    }

