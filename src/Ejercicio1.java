import java.util.Scanner;
 
public class Ejercicio1 {
 
public static void ejecutar() {
 
Scanner sc = new Scanner(System.in);
 
System.out.println("\n--- EJERCICIO 1 ---");
 
System.out.print("Nombre del estudiante: ");
String nombre = sc.nextLine();
 
System.out.print("Nota 1: ");
double nota1 = sc.nextDouble();
 
System.out.print("Nota 2: ");
double nota2 = sc.nextDouble();
 
System.out.print("Nota 3: ");
double nota3 = sc.nextDouble();
 
double promedio = (nota1 + nota2 + nota3) / 3;
 
System.out.println("\nEstudiante: " + nombre);
System.out.println("Promedio: " + promedio);
}
}
