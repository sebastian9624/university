//Crear una matriz de 10 * 10  con el siguiente dibujo
/* @---------
   -@--------
   --@-------
   ---@------
   ----@-----
   -----@----
   ------@---
   -------@--
   --------@-
   ---------@ */

let guion = '-';
let arroba = '@';
let dibujo = [];

for (let fila = 0; fila < 10; fila++) {
    dibujo[fila] = [];

    for (let columna = 0; columna < 10; columna++) {
        if (fila == columna) {
            dibujo[fila][columna] = arroba;
            
        } else {
            dibujo[fila][columna] = guion;
            
        }
    }
}

for (let index = 0; index < dibujo.length; index++) {
    console.log(dibujo[index]);
    
}




