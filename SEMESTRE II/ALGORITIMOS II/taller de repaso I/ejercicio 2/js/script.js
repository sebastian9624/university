// 2- Crear un algoritmo que lea un array con 10 números aleatorios y muestre la suma entre números pares y los impares

let arrayNumeros = [];


for (let index = 0; index < 5; index++) {
    let nuevoNum = JSON.parse(prompt("Ingrese un número"));
    arrayNumeros[index] = nuevoNum;
}


console.log(arrayNumeros);



let sumaPares = 0;
let sumaImpares = 0;

// Calcular la suma de los números pares e impares
for (let index = 0; index < arrayNumeros.length; index++) {
    if (arrayNumeros[index] % 2 == 0) {
        sumaPares += arrayNumeros[index];
    } else {
        sumaImpares += arrayNumeros[index];
    }
}

console.log("Suma de números pares: " + sumaPares);
console.log("Suma de números impares: " + sumaImpares);







