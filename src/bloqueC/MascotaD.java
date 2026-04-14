package bloqueC;

public class MascotaD {
    String nombre;
    String especie;
    int edad;

    public void mostrarMascota() {
        System.out.println("Imformacion de la mascota");
        System.out.println("Nombre:" + nombre);
        System.out.println("Especie:" + especie);
        System.out.println("Edad:" + edad + " " +"años");
    }

    // Metodo para cumplir años
    public void cumplirAnios() {
        edad++; // esto le suma uno a la edad actual
        System.out.println(nombre + " " + "Ahora tiene" + " " + edad + " " + "años");
    }
}

    class MainMascotaD {
        public static void main(String[]args)
        {
            // Creo el objeto
            MascotaD unaMascota = new MascotaD();
            unaMascota.nombre = "Sasha";
            unaMascota.especie = "perro";
            // estado inicial
            System.out.println("Estado inicial");

            unaMascota.edad = 1;
            unaMascota.mostrarMascota();

           // estado 1 de cambio
            unaMascota.edad = 6;
            unaMascota.mostrarMascota();
            System.out.println("Cumplió años");
            unaMascota.cumplirAnios();
            // estado 2 de cambio
            System.out.println("Cumplió años");
            unaMascota.edad = 10;
            unaMascota.mostrarMascota();
            unaMascota.cumplirAnios();


    }
}

