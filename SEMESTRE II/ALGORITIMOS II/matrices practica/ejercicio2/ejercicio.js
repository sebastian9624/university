//Matriz de 4x6

let matriz4x6 = [
    [34, 45, 56, 67, 78, 89],
    [76, 23, 98, 12, 45, 67],
    [10, 20, 80, 90, 23, 45],
    [34, 45, 56, 67, 78, 89]
];

/* Como recorrer una matriz con un ciclo FOR
1ro se recorre las filas y luego las columnas */

/* Recorrer filas */
for (let fila = 0; fila < matriz4x6.length; fila++) {

    /* Recorrer columnas */
    for (let columna = 0; columna < matriz4x6[fila].length; columna++) {
        console.log(matriz4x6[fila][columna]);
        
        
    }
}


