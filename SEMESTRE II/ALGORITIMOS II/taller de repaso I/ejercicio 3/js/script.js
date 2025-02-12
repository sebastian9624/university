// 3- Crear un algoritmo que lea un array con 10 números aleatorios y muestre el promedio de todos los datos

let arrayNumeros = [];


for (let index = 0; index < 5; index++) {
    let nuevoNum = JSON.parse(prompt("Ingrese un número"));
    arrayNumeros[index] = nuevoNum;
}
/* JSON.parse esto permite cambiar el tipo de dato string a number */

console.log(arrayNumeros);

// Calcular el promedio de los números en el array
let suma = 0;
for (let index = 0; index < arrayNumeros.length; index++) {
    suma += arrayNumeros[index];
}

let promedio = suma / arrayNumeros.length;
console.log("Promedio de los números: " + promedio);


