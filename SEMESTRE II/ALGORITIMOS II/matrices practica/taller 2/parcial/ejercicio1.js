/* Un servicio de atención al cliente tiene establecido turnos semanales para sus empleados de manera que cada día de la semana se encarga del servicio  una persona:

lunes - María,  Martes - Luis,  Miércoles - Antonia,  Jueves - Pedro, Viernes - Marisa.

Usa un matriz para almacenar los datos del servicio. En esta matriz cada elemento será un par día - nombre.

Crea un algoritmo que responda con el nombre de la persona encargada del servicio sabiendo el día. Si el día no existe deberá decir que no hay servicio.


 */

let diaIngresado = JSON.parse(prompt("Ingrese el número del día de la semana: "));
let servicio = [
    ['lunes', 'María', 1],
    ['martes', 'Luis', 2],
    ['miercoles', 'Antonia', 3],
    ['jueves', 'Pedro', 4],
    ['viernes', 'Marisa', 5]
];

if (diaIngresado < 1 || diaIngresado > 5) {
    nombreEmpleado = "No hay servicio";
} else {
    for (let i = 0; i < servicio.length; i++) {
        if (diaIngresado === servicio[i][2]) {
            nombreEmpleado = "El día " + servicio[i][0] + " está a cargo de: " + servicio[i][1];
        }
    }
}

console.log(nombreEmpleado);

