//Matriz de 5x7

let matriz5x7 = [
    ["Sebastián", "Pedro", "Juan", "Diego", "Carlos", "Andrés", "Felipe"],
    ["María", "Laura", "Paola", "Daniela", "Carolina", "Valentina", "Natalia"],
    ["Santiago", "Camilo", "Andrés", "Felipe", "Sebastián", "Juan", "Diego"],
    ["Carlos", "Andrés", "Felipe", "Sebastián", "Juan", "Diego", "Carlos"],
    ["Andrés", "Felipe", "Sebastián", "Juan", "Diego", "Carlos", "Andrés"]
];

/* Como recorrer una matriz con un ciclo FOR
1ro se recorre las filas y luego las columnas */

/* Recorrer filas */
for (let fila = 0; fila < matriz5x7.length; fila++) {

    /* Recorrer columnas */
    for (let columna = 0; columna < matriz5x7[fila].length; columna++) {
        console.log(matriz5x7[fila][columna]);
        
        
    }
}


