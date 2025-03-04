// Invocar funciones
miPrimeraFuncion(); // Llamada a la función, se puede llamar en cualquier parte del código
miSegundaFuncionConParametro(45, 56); // Llamada a la función con parametros
// Mi primera función básica
miSegundaFuncionConParametro();

const dato = miTerceraFuncionConParametrosYRetorno(100, 20);
console.log("Llamado a la tercera función con return y el resultado es", dato); // Llamada a la función con parametros y retorno



function miPrimeraFuncion () { // Definición de la función
    let resultado = 3 + 20; // Cuerpo de la función
    console.log("El resultado de la suma es: ", resultado);
}



// Mi segunda función con parametros
function miSegundaFuncionConParametro (numero1=50, numero2=30) {
    let resultado = numero1 + numero2;
    console.log("El resultado de la suma en segunda función: ", resultado);
}


// Mi tercera función con parametros y retorno
function miTerceraFuncionConParametrosYRetorno (numero1, numero2){
    let resultado = numero1 + numero2;
    return resultado;
    console.log("Esta línea no se ejecuta porque despues de la palabra reservada return se sale de la función", resultado);
    
}

