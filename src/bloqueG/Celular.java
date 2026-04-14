package bloqueG;

public class Celular {
    String marca;
    int bateria;
    boolean prendido;

    public Celular(String marca) {
        this.marca = marca;
        this.bateria = 5;
        this.prendido = false;
    }

    public void encender() {
        prendido = true;
        System.out.println("El celular " + marca + " se ha encendido.");
    }

    public void apagar() {
        prendido = false;
        System.out.println("El celular " + marca + " está en " + bateria + " %");
        System.out.println("El celular " + marca + " se ha apagado");
    }

    // cargar
    public void cargarBateria() {
        bateria = 100;
        System.out.println("Cargando... La batería del " + marca + " ahora está al " + bateria + " %.");
    }
}
        class MainCelular{
                public static void main(String[]args){

                    Celular movil = new Celular("Samsung");
                    movil.apagar();
                    movil.cargarBateria();
                    movil.encender();
                }
            }



