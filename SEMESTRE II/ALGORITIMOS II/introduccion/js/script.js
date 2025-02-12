
let nombre = "Sebastián";
console.log(nombre);

let numeros = [3, 7, 1, 9, 5]; // Array
console.log(numeros[2]+" "+numeros[4]);

let nombres = ["Sebastián", "Juan", "Pedro", "María"]; // Array
console.log(nombres[3] + " tiene " + numeros[2] + " hijos");
console.log(nombres[1] + " tiene " + numeros[3] + " hijos");


let varios = [true, "Paola", 567.75, [23, 45, 78], false, "Angie"];
/* console.log(varios[3][1]); */



/* El ciclo FOR tiene 3 componentes importantes
- iniciar el contador (index = 0)
- limitar el ciclor for (index < 10)
- Autoincrementar el contador (index ++) */


for (let i = 0; i < varios.length; i++) {
    console.log(varios[i]);
}




/* WHILE */
/**
 * El ciclo while es una declaración de control de flujo que permite que el código se ejecute repetidamente en función de una condición booleana dada.
 * El ciclo while se puede considerar como una declaración if repetitiva.
 * 
 * Sintaxis:
 * while (condición) {
 *     // bloque de código a ejecutar
 * }
 * 
 * Uso:
 * El ciclo while evalúa la condición antes de ejecutar el bloque de código.
 * Si la condición es verdadera, se ejecuta el bloque de código.
 * Este proceso se repite hasta que la condición se vuelva falsa.
 * 
 * Ejemplo:
 * let i = 0;
 * while (i < 5) {
 *     console.log(i);
 *     i++;
 * }
 * 
 * En este ejemplo, el ciclo imprimirá los números del 0 al 4 en la consola.
 */


let index = 0; 
while (index < nombres.length) {
    console.log("Dato del array " + [index]);
    index++;
}


/* DO WHILE  */

/* Siempre se ejecuta una vez para evaluar la condición*/

let indexdo = 0;
do {
    console.log("por aca paso  " + [indexdo]);
    indexdo++;
}
while (indexdo < nombres.length);