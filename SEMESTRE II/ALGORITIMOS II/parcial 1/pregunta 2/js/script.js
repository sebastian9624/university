/* Pedir por consola el tamaño del array, recorrer con un ciclo dicho array y guardar en cada posición un número aleatorio. Mostrar por consola el array obtenido y la suma de todos los números.

PISTA: 
Pedir por el navegador un dato al usuario el JSON.parse es solo si el dato es númerico:
JSON.parse (prompt("Ingrese el tamaño del array:"))
obtener números enteros aleatorios entre 1 y 100
Math.floor(Math.random() *101) */

let tamanoArray = JSON.parse(prompt("Ingrese el tamaño del array:"));
let arrayNumerosAleatorios = [];
let sumaNumeros = 0;

for (let index = 0; index < tamanoArray; index++) {
    arrayNumerosAleatorios[index] = Math.floor(Math.random() * 101);
    sumaNumeros += arrayNumerosAleatorios[index];
}

console.log(arrayNumerosAleatorios);
console.log(sumaNumeros);