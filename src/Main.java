import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JuegoAdivinanza juego = new JuegoAdivinanza(5);  // El jugador tiene 5 intentos

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Adivina el número entre 0 y 100. Tienes " + juego.getIntentosRestantes() + " intentos.");

        // Bucle principal del juego
        while (juego.quedanIntentos()) {
            System.out.print("Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt();  // Lee la entrada del usuario

            // Si el usuario adivina el número, se rompe el bucle
            if (juego.jugar(numeroUsuario)) {
                break;
            }
        }

        scanner.close();  // Cierra el scanner para liberar recursos
    }
}
