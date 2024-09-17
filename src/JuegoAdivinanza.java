import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    private int numeroSecreto;
    private int intentosMaximos;
    private int intentosRestantes;

    // Constructor
    public JuegoAdivinanza(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
        this.intentosRestantes = intentosMaximos;
        generarNumeroSecreto();  // Genera el número secreto al iniciar el juego
    }

    // Genera un número aleatorio entre 0 y 100
    private void generarNumeroSecreto() {
        Random random = new Random();
        this.numeroSecreto = random.nextInt(101);  // Número entre 0 y 100
    }

    // Metodo que permite jugar un intento
    public boolean jugar(int numeroUsuario) {
        intentosRestantes--;

        if (numeroUsuario == numeroSecreto) {
            System.out.println("¡Felicidades! Adivinaste el número.");
            return true;  // Devuelve true si adivinó el número
        } else if (numeroUsuario < numeroSecreto) {
            System.out.println("El número es mayor.");
        } else {
            System.out.println("El número es menor.");
        }

        if (intentosRestantes == 0) {
            System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroSecreto + ".");
        }

        return false;  // Devuelve false si no adivinó aún
    }

    // Metodo que indica si el jugador tiene más intentos
    public boolean quedanIntentos() {
        return intentosRestantes > 0;
    }

    // Metodo que muestra cuántos intentos quedan
    public int getIntentosRestantes() {
        return intentosRestantes;
    }
}
