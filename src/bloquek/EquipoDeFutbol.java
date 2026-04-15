package bloquek;
/*Atributos: nombreEquipo, puntos
Metodos: ganarPartido, PerderPartido
 objeto: "Barcelona" "0" puntos*/

public class EquipoDeFutbol {
        String nombreEquipo;
        int puntos;

        public EquipoDeFutbol(String nombreEquipo) {
            this.nombreEquipo = nombreEquipo;
            this.puntos = 0;
        }

        public void ganarPartido() {
            this.puntos = puntos + 3;
            System.out.println("sumamos 3 puntos a: " + nombreEquipo );
            System.out.println("Puntos totales: " + puntos);
        }

        public void perderPartido() {
            System.out.println(nombreEquipo + " perdió. No suma puntos.");
        }

        public static void main(String[] args) {

            EquipoDeFutbol equipo = new EquipoDeFutbol("Barcelona");
            equipo.ganarPartido();
            equipo.perderPartido();
        }
    }

