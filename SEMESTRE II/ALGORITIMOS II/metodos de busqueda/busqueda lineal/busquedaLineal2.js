/* 
Pedir un número por el navegador
Crear un array de tu gusto, ojo solo números y que sean repetidos.
Deben mostrar por consola (log) un nuevo array con las posiciones de los números sean repetidos o no

Ayuda => pueden usar .push()
*/

const arrayNumeros = [5, 7, 12, 87, 45, 90, 54, 22, 33, 76, 88, 100, 5, 7, 12, 87, 45, 90, 54, 22, 33, 76, 88, 100];
const arrayPosiciones = [];
let numBusqueda = parseInt(prompt("Ingrese el número a buscar: "));

if (Number.isInteger(numBusqueda)) {
    //Vamos a iterar el array
    for (let index = 0; index < arrayNumeros.length; index++) {
        if (numBusqueda == arrayNumeros[index]) {
            arrayPosiciones.push(index);
            
        } 
    } if (!arrayPosiciones.length) {
        console.log("El número no se encuentra en el array");
    } else{
        console.log('El número ' + numBusqueda + ' se encuentra en las posiciones ' + arrayPosiciones);
    }
} else {
    console.log("Debe ingresar un número");
    
}




