# Actividad Práctica: Fundamentos de Programación en Java
# Módulo Core de Lógica Imperativa y Computacional

Este componente aloja las soluciones computacionales de lógica imperativa diseñadas para resolver las reglas de negocio académicas del proyecto. El desarrollo del código sigue un flujo de trabajo basado en aislamiento por ramas (*Feature-Branch Workflow*) para garantizar la integración continua y la entrega limpia en la rama principal (`main`).

---

## Control de Versiones e Integración por Integrantes

Para cumplir con las políticas de despliegue y protección de ramas del repositorio, cada componente fue codificado en una sucursal independiente y unificado mediante solicitudes de fusión (*Merge Requests*):

* **Rama `feature/ejercicio-1`:** Lógica de entrada de datos, variables dinámicas y operadores aritméticos de precisión.
* **Rama `feature/ejercicio-2`:** Estructura de control condicional de bifurcación jerárquica por rangos etarios.
* **Rama `feature/ejercicio-3`:** Modularización funcional de algoritmos matemáticos mediante encapsulamiento estático.
* **Rama `feature/ejercicio-5`:** Componente integrador de lógica booleana analítica para aprobación académica.

---

##  Objetivos Técnicos del Proyecto

1. **Aplicar conceptos de programación imperativa** mediante algoritmos secuenciales y estructurados en lenguaje Java.
2. **Utilizar tipos de datos primitivos y complejos**, operadores aritméticos, estructuras condicionales acopladas y control de ciclos.
3. **Analizar problemas cotidianos sencillos** y proponer soluciones computacionales eficientes, modulares y de fácil mantenimiento.

---

## Documentación y Cuestionario Teórico del Sistema

### Componente 1: Variables, Tipos de Datos y Operadores
* **¿Qué es una variable en Java?**  
  Es una sección reservada de la memoria RAM con un identificador único asociado a un tipo de dato estricto. Funciona como un contenedor lógico para almacenar, recuperar y mutar un valor específico durante el tiempo de ejecución del software.
* **¿Cuál es la diferencia entre int, double y String?**  
  * `int`: Tipo de dato primitivo numérico que almacena enteros de 32 bits con signo (ej. `-5`, `120`).
  * `double`: Tipo de dato primitivo numérico de punto flotante de 64 bits para el manejo preciso de números con decimales (ej. `3.5`, `19.99`).
  * `String`: Objeto inmutable (clase) que representa y gestiona secuencias y cadenas de caracteres alfanuméricos dentro de la memoria Heap (ej. `"Alexander"`).
* **¿Para qué sirven los operadores aritméticos?**  
  Son componentes funcionales que permiten ejecutar operaciones y transformaciones matemáticas binarias o unarias (`+`, `-`, `*`, `/`, `%`) directamente sobre variables y constantes numéricas dentro del algoritmo.

# Componente 2: Estructuras de Control Condicionales
* **¿Qué función cumple la estructura if-else?**  
  Controla el flujo de ejecución del programa evaluando una expresión de lógica booleana: bifurca el procesamiento hacia un bloque de código principal si el resultado es verdadero (`true`) o hacia una ruta alternativa si el resultado es falso (`false`).
* **¿Cuándo es recomendable utilizar una estructura condicional?**  
  Es mandatorio en ingeniería de software cuando el comportamiento y la lógica del negocio del programa requieran tomar caminos lógicos diferentes basados en entradas dinámicas del usuario, validaciones perimetrales de seguridad o análisis de rangos específicos.

##Componente 3: Modularización y Funciones (`Methods`)
* **¿Qué es un método en Java?**  
  Es un módulo o bloque de código estructurado, aislado y reutilizable que se define dentro de una clase para ejecutar una tarea algorítmica específica, el cual puede aceptar parámetros de entrada y retornar un resultado tipado tras su ejecución.
* **¿Qué ventajas tiene dividir un programa en métodos?**  
  * **Reutilización (Principio DRY - Don't Repeat Yourself):** Evita la duplicación y redundancia de líneas de código escribiéndolas una sola vez.
  * **Mantenibilidad Aislada:** Facilita la detección, aislamiento y corrección de fallos específicos sin comprometer el software completo.
  * **Legibilidad Arquitectónica:** Organiza la estructura del software haciéndola clara, limpia y autodescriptiva para el equipo de desarrollo.

## Componente 5: Módulo Integrador y Filosofía OO
* **¿Por qué Java es considerado un lenguaje de programación orientado a objetos (POO)?**  
  Porque su filosofía, compilador y sintaxis obligan a estructurar todo el software a través de plantillas de abstracción denominadas **Clases**, representando las entidades reales mediante **Objetos** que encapsulan sus propios estados (atributos) y comportamientos (métodos).
* **¿Qué ventajas ofrece Java para el desarrollo de software?**  
  * **Portabilidad Absoluta (Multiplataforma):** Compila a un archivo intermedio binario (*Bytecode*) ejecutable en cualquier sistema operativo mediante la Máquina Virtual de Java (JVM) bajo la filosofía *"Write Once, Run Anywhere"*.
  * **Robustez y Seguridad de Memoria:** Cuenta con administración y liberación automática de memoria RAM a través del Recolector de Basura (*Garbage Collector*), eliminando el riesgo de desbordamientos de punteros comunes en lenguajes antiguos.

---

##  Matriz de Casos de Prueba de Software (QA)

| Módulo Ejecutable | Entrada de Prueba (`stdin`) | Lógica de Procesamiento | Salida Esperada (`stdout`) | Estado |
| :--- | :--- | :--- | :--- | :--- |
| **Módulo 1** | Notas: `4.0`, `3.5`, `4.5` | Promedio Aritmético | Promedio Final: `4.00` |  Validado |
| **Módulo 2** | Edad: `72` | Evaluación: `edad >= 65` | Resultado: Adulto mayor (65 años o más). | Validado |
| **Módulo 3** | Entrada: `8` | Exponencial: `8 * 8` | El cuadrado de 8 es: `64` | Validado |
| **Módulo 5** | Notas: `2.5`, `3.0`, `2.0` | Validación: `promedio < 3.0` | Estado Académico: REPROBADA | Validado |


---
