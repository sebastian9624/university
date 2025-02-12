//Matriz de 3x3

let matriz3x3 = [
    [34, 45, 56],
    [76, 23, 98],
    [10, 20, 80]
];

/* Como recorrer una matriz con un ciclo FOR
1ro se recorre las filas y luego las columnas */

/* Recorrer filas */
for (let fila = 0; fila < matriz3x3.length; fila++) {

    /* Recorrer columnas */
    for (let columna = 0; columna < matriz3x3[fila].length; columna++) {
        console.log(matriz3x3[fila][columna]);
        
        
    }
}


