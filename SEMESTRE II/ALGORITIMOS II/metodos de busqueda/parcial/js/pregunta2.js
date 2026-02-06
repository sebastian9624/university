/* Para realizar el siguiente ejercicio debe tener en cuenta la búsqueda binaria tratada en clase.

Se requiere dar solución a los siguientes problemas:

Se necesita pedir por prompt la longitud de un array a trabajar.
Una vez obtenida la longitud, cargar un array con datos numéricos enteros pedidos por prompt.
Una vez obtenido el array, quiero ordenar de menor a mayor
Quiero saber la posición de un número, este debe ser pedido por prompt y validar si no existe */

let longitud = parseInt(prompt('Ingrese la longitud del array'));
let array = [];
let numeroEnteroArray = 0;


for (let index = 0; index < longitud; index++) {
    numeroEnteroArray = parseInt(prompt('Ingrese un número entero'));
    array.push(numeroEnteroArray);
}

array.sort((a, b) => a - b);

console.log('Array ordenado: ', array);

let numBusqueda = parseInt(prompt('Introduce un número entero a buscar: '));

function busquedaBinaria(array, valorBusqueda) {
    let inicioArray = 0;
    let finalArray = array.length - 1;

    while (inicioArray <= finalArray) {
        let mitadArray = Math.floor((inicioArray + finalArray) / 2);

        if (valorBusqueda == array[mitadArray]) {
            return mitadArray;
        }
        if (valorBusqueda < array[mitadArray]) {
            finalArray = mitadArray - 1;
        } else {
            inicioArray = mitadArray + 1;
        }
    }
    return -1;
}

let resultado = busquedaBinaria(array, numBusqueda);
if (resultado == -1) {
    console.log('El número ', numBusqueda, ' no se encuentra en el array');
}
else {
    console.log('El número ', numBusqueda, ' se encuentra en la posición: ', resultado);
}

