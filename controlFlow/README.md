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


🔁 Bucles


Tipo	Descripción	Ejemplo
for	Bucle con contador	for (int i = 0; i < 10; i++)
while	Bucle mientras la condición sea verdadera	while (x < 5)
do-while	Se ejecuta al menos una vez	do { ... } while (x < 5);
🎯 Palabras clave: break y continue


Palabra	Función	Ejemplo
break	Sale del bucle inmediatamente	if (x == 10) break;
continue	Salta a la siguiente iteración del bucle	if (x % 2 == 0) continue;
🎯 Buenas Prácticas

Validar entrada del usuario con hasNextInt() antes de usar nextInt().

Evitar anidar muchas condiciones, simplifica con orden lógico.

Coloca break en cada caso de un switch.

Usa continue solo si mejora la legibilidad.

Cierra recursos como Scanner para evitar fugas de memoria.

Nombra bien tus variables: edadUsuario, contadorPar, etc.

🔁 Próximo Módulo 👉 arrays – Arreglos y estructuras indexadas