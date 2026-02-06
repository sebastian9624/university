/*  Imprimir el siguiente patrón de asteriscos utilizando una matriz de 6x6 

*
**
***
****
*****
******
*/


let asteristico = '*';
let dibujo = [];

for (let fila = 0; fila < 6; fila++) {
    dibujo[fila] = [];

    for (let columna = 0; columna < 6; columna++) {
        if (fila >= columna) {
            dibujo[fila][columna] = asteristico;
            
        } else {
            dibujo[fila][columna] = '';
            
        }
    }
}

console.log(dibujo);


