import java.util.Scanner;
 
public class Ejercicio2 {
 
    public static void ejecutar() {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("\n--- EJERCICIO 2 ---");
 
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
 
        if (edad >= 65) {
            System.out.println("Adulto mayor");
        } else if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
