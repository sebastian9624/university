//Matriz de 5x3

let matriz5x3 = [
    ["Maria", 25, 1.65],
    ["Juan", 30, 1.75],
    ["Pedro", 35, 1.80],
    ["Ana", 20, 1.60],
    ["Luis", 40, 1.70]
];

/* Como recorrer una matriz con un ciclo FOR
1ro se recorre las filas y luego las columnas */

/* Recorrer filas */
for (let fila = 0; fila < matriz5x3.length; fila++) {

    /* Recorrer columnas */
    for (let columna = 0; columna < matriz5x3[fila].length; columna++) {
        console.log(matriz5x3[fila][columna]);
        
        
    }
}


