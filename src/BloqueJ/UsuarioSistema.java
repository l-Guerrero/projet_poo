package BloqueJ;

public class UsuarioSistema {
        String nombreUsuario;
        String clave;
        boolean activo;

        // Constructor
        public UsuarioSistema(String nombreUsuario, String clave) {
            this.nombreUsuario = nombreUsuario;
            this.clave = clave;
            this.activo = false;
        }

        public void activar() {
            activo = true;
            System.out.println("El usuario " + nombreUsuario + " ahora está activo");
        }
        public void desactivar() {
            activo = false;
            System.out.println("El usuario " + nombreUsuario + " ha sido desactivado");
        }
    }

        class MainUsuario {
        public static void main(String[] args) {

            UsuarioSistema user = new UsuarioSistema("Mary-f", "12345@");
            user.activar();
            user.desactivar();
        }
    }

