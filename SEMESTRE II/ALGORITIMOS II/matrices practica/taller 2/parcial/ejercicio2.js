/* Una tienda vende portátiles, monitores, teclados, ratones y cámaras. Los precios se almacenan en una estructura matriz donde cada elemento es una fila producto - precio - vendedor.

Diseña un algoritmo que reciba como argumento el nombre del vendedor y devuelva su precio.


 */

let productos = [
    ['portatil', 1.500000, 'Juan'],
    ['monitor', 200, 'Pedro'],
    ['teclado', 50, 'Luis'],
    ['raton', 20, 'Maria'],
    ['camara', 80, 'Antonia']
];

let vendedor = prompt("Ingrese el nombre del vendedor: (Juan, Pedro, Luis, Maria, Antonia)");
for (let i = 0; i < productos.length; i++) {
    
    if (vendedor == productos[i][2]) {
        precio = "El precio del producto que vende " + vendedor + " es: " + productos[i][1];
    } else  {
        precio = "Ese vendedor no existe";
    }
    
    
}
console.log(precio);



