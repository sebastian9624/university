const arrayNumeros = [5, 7, 12, 87, 45, 90, 54, 22, 33, 76, 88, 100];

let posicion = -1;

let numBusqueda = parseInt(prompt("Ingrese el número a buscar: "));


if (Number.isInteger(numBusqueda)) {
    //Vamos a iterar el array
    for (let index = 0; index < arrayNumeros.length; index++) {
        if (numBusqueda == arrayNumeros[index]) {
            posicion = index;
            break; //Para salir del ciclo, si no se seguiría iterando
        }
    }
} else {
    console.log("Debe ingresar un número");
    
}

//mostramos la posición
if (posicion >= 0) {
    console.log('El número ' + numBusqueda + ' se encuentra en la posición ' + posicion);
    
} else {
    console.log('No existe la posición del número ' + numBusqueda);
    
}