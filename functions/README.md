# 📁 functions/ – Métodos y funciones en Java

Este módulo es parte de mi roadmap de aprendizaje en Java. Aquí trabajé con funciones (métodos) para entender cómo se declaran, reciben parámetros, retornan valores y aplican sobrecarga (overloading).

---

## 📘 Contenido del Módulo

| Archivo | Descripción |
|--------|-------------|
| `SimpleMethods.java` | Métodos sin parámetros ni retorno. Usados para estructurar mejor el código. |
| `ParametersReturn.java` | Métodos que reciben datos (parámetros) y devuelven resultados (return). |
| `Overloading.java` | Ejemplos de sobrecarga de métodos: distintas versiones de un mismo método con diferentes parámetros. |

---

## 🧠 Conceptos Clave

### ✅ ¿Qué es un método?
Un método es un bloque de código que realiza una tarea específica. Nos permite **organizar, reutilizar y dividir** responsabilidades en el programa.

```java
public static void saludar(){
    System.out.println("Hola mundo");
}

🧩 Parámetros y retorno
Los métodos pueden recibir información (parámetros) y devolver resultados (return).

public static int sumar(int a, int b){
    return a + b;
}

🔁 Overloading (Sobrecarga de métodos)
Podemos tener varios métodos con el mismo nombre, siempre que reciban diferente cantidad o tipo de parámetros. Esto facilita la lectura y reutilización.

public static void mostrar(String mensaje) { ... }
public static void mostrar(String mensaje, int veces) { ... }

🎯 Buenas Prácticas
✅ Usa nombres descriptivos para tus métodos: mostrarMenu(), calcularTotal()

🧱 Aplica una función para cada responsabilidad (SRP – Single Responsibility Principle)

📚 Documenta con comentarios qué hace cada método si no es evidente

✍️ Comenta tu código o anota dudas mientras practicas (para consultarlo después)

💬 Realiza pruebas con diferentes entradas para entender el comportamiento