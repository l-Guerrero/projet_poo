package BloqueJ;

public class Temperatura {
        double gradosCelsius;

        // Constructor
        public Temperatura(double gradosCelsius) {
            this.gradosCelsius = gradosCelsius;
        }

        // convertir a Fahrenheit
        public double convertirAFahrenheit() {
            return (gradosCelsius * 9 / 5) + 32;
        }
    }

        class MainTemperatura {
        public static void main(String[] args) {

            Temperatura clima = new Temperatura(30.5);

            double gradosF = clima.convertirAFahrenheit();
            System.out.println(clima.gradosCelsius + " grados Celsius equivalen a " + gradosF + " grados Fahrenheit.");
        }
    }

