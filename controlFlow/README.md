📘 Módulo: Control de Flujo en Java  
Este módulo aborda las estructuras fundamentales para el control del flujo de ejecución en Java, incluyendo decisiones condicionales y bucles.

📌 Contenido del Módulo
• IfElse.java – Condiciones con if, else if y else  
• SwitchCase.java – Múltiples opciones con switch  
• Loops.java – Estructuras de repetición: for, while, do-while  
• BreakContinue.java – Interrupción o continuación de bucles

🧠 Condicionales en Java
Estructura | Descripción | Ejemplo
--- | --- | ---
`if` | Ejecuta un bloque si la condición es verdadera | `if (edad >= 18) { ... }`
`else if` | Evalúa otra condición si la anterior fue falsa | `else if (edad >= 13) { ... }`
`else` | Ejecuta cuando ninguna condición previa se cumple | `else { ... }`

🌀 Switch Case
Útil para seleccionar entre múltiples valores.  
Evita el uso excesivo de if-else si las condiciones son comparaciones directas.

```java
switch (numero) {
    case 1: System.out.println("Lunes"); break;
    case 2: System.out.println("Martes"); break;
    default: System.out.println("Día no válido");
}