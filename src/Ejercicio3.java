import java.util.Scanner;
 
public class Ejercicio3 {
 
    public static int cuadrado(int numero) {
        return numero * numero;
    }
 
    public static void ejecutar() {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("\n--- EJERCICIO 3 ---");
 
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
 
        int resultado = cuadrado(numero);
 
        System.out.println("El cuadrado es: " + resultado);
    }
}
