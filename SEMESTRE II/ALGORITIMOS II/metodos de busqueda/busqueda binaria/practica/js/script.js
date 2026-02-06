/* Búsqueda binaria con Array ordenado */

function busquedaBinaria (array, valorBusqueda) {
    console.log('Array ordenado: ', arrayNum);
    let inicioArray = 0;
    let finalArray = array.length - 1;


    while (inicioArray <= finalArray) {
        let mitadArray = Math.floor((inicioArray + finalArray) / 2);
        console.log('Inicio: ', inicioArray , ' - Final: ' , finalArray , ' - Mitad: ' , mitadArray);
        

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
    
} // Fin de la función busquedaBinaria


//Declaramos variables
let arrayNum = [7, 56, 23, 89, 45, 1, 3, 77, 34, 24, 33, 4];

//Ordenamos el array de menor a mayor
arrayNum.sort((a, b) => a - b);

let numBusqueda = parseInt(prompt("Introduce un número entero a buscar: "));


//llamamos a la función busquedaBinaria
let resultado = busquedaBinaria(arrayNum, numBusqueda);
if (resultado != -1) {
    console.log('El número ', numBusqueda, ' se encuentra en la posición: ', resultado);
    
} else {
    console.log('El número ', numBusqueda, ' no se encuentra en el array');
    
}



