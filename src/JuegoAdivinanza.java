import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        // Genera un número aleatorio entre 0 y 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);  // Número entre 0 y 100
        Scanner scanner = new Scanner(System.in);
        int intentos = 5;  // Número máximo de intentos

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Adivina el número entre 0 y 100. Tienes " + intentos + " intentos.");

        // Bucle para permitir 5 intentos
        for (int i = 1; i <= intentos; i++) {
            System.out.print("Intento " + i + ": Ingresa tu número: ");
            int numeroUsuario = scanner.nextInt();  // Lee la entrada del usuario

            // Compara el número ingresado con el número secreto
            if (numeroUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número en el intento " + i + ".");
                break;  // Sale del bucle si el usuario adivinó correctamente
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }

            // Si llega al último intento sin haber adivinado
            if (i == intentos) {
                System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroSecreto + ".");
            }
        }

        scanner.close();  // Cierra el scanner para liberar recursos
    }
}