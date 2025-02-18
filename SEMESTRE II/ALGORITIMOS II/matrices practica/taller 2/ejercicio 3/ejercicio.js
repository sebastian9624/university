//Crear el siguiente ventana, el cual deberá ser una matriz cuadrada, el tamano será pedido por teclado y debe tener el siguiente aspecto
// @ @ @ @ @ @ @ @ @ @
// @ - - - - @ - - - @
// @ - - - - @ - - - @
// @ - - - - @ - - - @
// @ - - - - @ - - - @
// @ @ @ @ @ @ @ @ @ @
// @ - - - - @ - - - @
// @ - - - - @ - - - @
// @ - - - - @ - - - @
// @ @ @ @ @ @ @ @ @ @


let tamano = JSON.parse(prompt('Ingrese el tamaño de la matriz cuadrada: '));
let guion = '-';
let arroba = '@';
let dibujo = [];


if (tamano < 5) {
    alert('El tamano de la matriz debe ser mayor o igual a 5');
    tamano = JSON.parse(prompt('Ingrese el tamaño de la matriz cuadrada: '));
} else {
    for (let fila = 0; fila < tamano; fila++) {
        dibujo[fila] = [];

        for (let columna = 0; columna < tamano; columna++) {
            if (fila == 0 ) {
                // Para poner el @ en la primera fila
                dibujo[fila][columna] = arroba;
            } else if (fila == tamano - 1) {
            // Para poner el @ en la última fila
            dibujo[fila][columna] = arroba;
            } else if (columna == 0 ) {
                // Para poner el @ en la primera columna
                dibujo[fila][columna] = arroba;
            } else if (columna == tamano - 1){
                // Para poner el @ en la  última columna
                dibujo[fila][columna] = arroba;
            } else if (columna == tamano / 2) {
                // Para poner el @ en la mitad de la matriz (columna)
                dibujo[fila][columna] = arroba;
            } else if (fila == tamano / 2) {
                // Para poner el @ en la mitad de la matriz (fila)
                dibujo[fila][columna] = arroba;
            } else {
                dibujo[fila][columna] = guion;
            }
        }
    }
    console.log(dibujo);
}
