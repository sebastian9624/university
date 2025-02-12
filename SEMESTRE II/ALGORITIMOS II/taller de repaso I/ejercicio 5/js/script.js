// 5- Crear un algoritmo que permita ingresar un nombre y me muestre la cantidad de caracteres y el nombre al revez.

let nombre = prompt("Ingrese su nombre");
let cantidadCaracteres = nombre.length;
let nombreReves = "";

for (let index = nombre.length - 1; index >= 0; index--) {
    nombreReves += nombre[index];
}

console.log("El nombre ingresado es: " + nombre);
console.log("La cantidad de caracteres del nombre es " + cantidadCaracteres);
console.log("El nombre al revés es: " + nombreReves);





