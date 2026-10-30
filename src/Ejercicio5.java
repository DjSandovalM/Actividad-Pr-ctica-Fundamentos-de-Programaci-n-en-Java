import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- EJERCICIO 5 ---");

        System.out.print("Ingrese la nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("Promedio: " + promedio);

        if (promedio >= 3.0) {
            System.out.println("Estado académico: APROBADA");
        } else {
            System.out.println("Estado académico: REPROBADA");
        }
    }
}
