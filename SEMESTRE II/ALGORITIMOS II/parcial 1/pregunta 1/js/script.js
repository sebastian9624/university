/* Encuentra la lógica en las siguientes operaciones y números.
3+1 = 24
5+2 = 37
7+2 = 59
8+1 = 79
7+5 = 212
15+3 = 1218 

Guardar en un array de strings la lógica de cada operación y mostrar por consola.*/

/* EXPLICACIÓN:
La lógica del ejercicio es la operación númerica de resta siempre de primera entre ambos numeros, segundo una suma con los mismos */

let arrayStringNumeros = ["3+1 = 24 porqué 3-1 = 2 y 3+1 = 4", 
    "5+2 = 37 porqué 5-2 = 3 y 5+2 = 7", 
    "7+2 = 59 porqué 7-2 = 5 y 7+2 = 9", 
    "8+1 = 79 porqué 8-1 = 7 y 8+1 = 9",
    "7+15 = 212 porqué 7-5 = 2 y 7+5 = 12",
    "15+3 = 1218 porqué 15-3 = 12 y 15+3 = 18"];

for (let index = 0; index < arrayStringNumeros.length; index++) {
    console.log(arrayStringNumeros[index]);
}


/* Teniendo en cuenta sólo las operaciones
3+1
5+2
7+2
8+1
7+5
15+3

Guardar en array los resultados de cada suma y en otros array independientes la multiplicación, resta y división, mostrar por consola*/

let arraySuma = [3+1, 5+2, 7+2, 8+1, 7+5, 15+3];
let arrayMultiplicacion = [3*1, 5*2, 7*2, 8*1, 7*5, 15*3];
let arrayResta = [3-1, 5-2, 7-2, 8-1, 7-5, 15-3];
let arrayDivision = [3/1, 5/2, 7/2, 8/1, 7/5, 15/3];

console.log(arraySuma);
console.log(arrayMultiplicacion);
console.log(arrayResta);
console.log(arrayDivision);


