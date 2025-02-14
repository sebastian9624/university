let guion = '-';
let arroba = '@';
let dibujo = [];

for (let fila = 0; fila < 10; fila++) {
    dibujo[fila] = [];

    for (let columna = 0; columna < 10; columna++) {
        if (columna >= 4 && columna <= 5) {
            dibujo[fila][columna] = arroba;
            
        } else if ( fila >= 4 && fila <= 5) {
            dibujo[fila][columna] = arroba;
        }
        
        else {
            dibujo[fila][columna] = guion;
        }
        
    }
}

console.log(dibujo);






