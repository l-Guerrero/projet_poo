import java.util.Scanner;

    public class Main {

        //Clase Libro
        static class Libro {
            String titulo, autor;
            int paginas;

            public Libro(String titulo, String autor, int paginas) {
                this.titulo = titulo;
                this.autor = autor;
                this.paginas = paginas;
            }

            public String toString() {
                return "Libro: " + titulo + "  Autor: " + autor + "  Pág: " + paginas;
            }
        }

        //  Cuenta Bancaria
        static class CuentaBancaria {
            String numero;
            double saldo;
            String tipo;

            public CuentaBancaria(String numero, double saldo, String tipo) {
                this.numero = numero;
                this.saldo = saldo;
                this.tipo = tipo;
            }

            public String toString() {
                return "Cuenta: " + numero + "  Saldo: $" + saldo + "  Tipo: " + tipo;
            }
        }

        // Estudiante
        static class Estudiante {
            String nombre;
            int edad;
            String curso;

            public Estudiante(String nombre, int edad, String curso) {
                this.nombre = nombre;
                this.edad = edad;
                this.curso = curso;
            }

            public String toString() {
                return "Estudiante: " + nombre + " Edad: " + edad + "  Curso: " + curso;
            }
        }

        // metodo principal
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Datos del Libro
            System.out.println("Titulo del libro:");
            String t = sc.nextLine();
            System.out.println("Autor:");
            String a = sc.nextLine();
            System.out.println("Paginas:");
            int p = sc.nextInt();
            sc.nextLine();

            // Datos de la Cuenta
            System.out.println("Numero de cuenta:");
            String nc = sc.nextLine();
            System.out.println("Saldo:");
            double s = sc.nextDouble();
            sc.nextLine();
            System.out.println("Tipo de cuenta:");
            String tc = sc.nextLine();

            // Datos del Estudiante
            System.out.println("Nombre estudiante:");
            String nom = sc.nextLine();
            System.out.println("Edad:");
            int ed = sc.nextInt();
            sc.nextLine();
            System.out.println("Curso:");
            String cur = sc.nextLine();


            Libro l = new Libro(t, a, p);
            CuentaBancaria c = new CuentaBancaria(nc, s, tc);
            Estudiante e = new Estudiante(nom, ed, cur);


            System.out.println("Datos registrados");
            System.out.println(l);
            System.out.println(c);
            System.out.println(e);

            sc.close();
        }
    }

