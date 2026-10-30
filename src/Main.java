import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args) {
 
Scanner sc = new Scanner(System.in);
int opcion;
 
do {
System.out.println("\n===== MENU PRINCIPAL =====");
System.out.println("1. Ejercicio 1 - Variables y Operadores");
System.out.println("2. Ejercicio 2 - Condicionales");
System.out.println("3. Ejercicio 3 - Métodos");
System.out.println("4. Ejercicio 5 - Integrador");
System.out.println("0. Salir");
System.out.print("Seleccione una opción: ");
 
opcion = sc.nextInt();
 
switch (opcion) {
 
case 1:
Ejercicio1.ejecutar();
break;
 
case 2:
Ejercicio2.ejecutar();
break;
 
case 3:
Ejercicio3.ejecutar();
break;
 
case 4:
Ejercicio5.ejecutar();
break;
 
case 0:
System.out.println("Programa finalizado.");
break;
 
default:
System.out.println("Opción no válida.");
}
 
} while (opcion != 0);
 
sc.close();
}
}
