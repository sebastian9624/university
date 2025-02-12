// 1- Crear un algoritmo que lea un array con 10 números aleatorios y muestre la cantidad de números pares y los impares

let arrayNumeros = [];


for (let index = 0; index < 5; index++) {
    let nuevoNum = JSON.parse(prompt("Ingrese un número"));
    arrayNumeros[index] = nuevoNum;
}
/* JSON.parse esto permite cambiar el tipo de dato string a number */

console.log(arrayNumeros);

//Recorrer el array y obtener los números pares e impares

let pares = 0;
let impares = 0;

for (let index = 0; index < arrayNumeros.length; index++) {
    /* console.log("En la posición "+ index + "hay un " + arrayNumeros[index]); */
    if (arrayNumeros[index] % 2 == 0) {
        pares++;
    } else {
        impares++;
    }
    
}
console.log("Pares: " + pares);
console.log("Impares: " + impares);



