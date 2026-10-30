
import java.util.Scanner;

public class Ejercicio3 {

    public static int cuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int resultado = cuadrado(numero);

        System.out.println("El cuadrado es: " + resultado);

        entrada.close();
    }
}
