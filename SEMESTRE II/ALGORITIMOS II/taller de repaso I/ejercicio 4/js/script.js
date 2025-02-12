// 4- Crear un algoritmo que lea un array con los números del 1 al 100 y muestre otro array con los números primos

let arrayNumeros = [];


for (let index = 0; index < 100; index++) {
    arrayNumeros.push(index + 1);
}

console.log(arrayNumeros);

let arrayPrimos = [];

for (let index = 0; index < arrayNumeros.length; index++) {
    let esPrimo = true;
    for (let index2 = 2; index2 < arrayNumeros[index]; index2++) {
        if (arrayNumeros[index] % index2 == 0) {
            esPrimo = false;
        }
    }
    if (esPrimo) {
        arrayPrimos.push(arrayNumeros[index]);
    }
}

console.log(arrayPrimos);

