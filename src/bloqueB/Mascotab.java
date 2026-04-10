package bloqueB;

public class Mascotab {
    String nombre;
    String especie;
    int edad;

    public void mostrarMascota(){
        System.out.println("imformacion de la mascota");
        System.out.println("Nombre:" + nombre);
        System.out.println("Especie:" + especie);
        System.out.println("Edad:" + edad + " " + "años");
    }
}

class MainMascotab {
    public static void main(String[]args)
    {
    // Creo el objeto
        Mascotab unaMascota = new Mascotab();
        unaMascota.nombre = "Sasha";
        unaMascota.especie = "perro";
        // estado inicial
        System.out.println("Estado inicial");

        unaMascota.edad = 1;
        unaMascota.mostrarMascota();
        // estado 1 de cambio
        System.out.println("Cambio de edad 1");
        unaMascota.edad = 6;
        unaMascota.mostrarMascota();

        // estado 2 de cambio
        System.out.println("Cambio de edad 2");
        unaMascota.edad = 10;
        unaMascota.mostrarMascota();

    }
}
