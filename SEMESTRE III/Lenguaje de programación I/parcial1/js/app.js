
// Creamos una función llamada "calcularSalario" que recibirá los paramertros necesarios para calcular el salario del trabajador: horas normales, horas extras, horas extras dominicales y tarifa por hora.

function calcularSalario(horasTrabajadas, horasExtrasDominicales, tarifaHora) {
    
    let horasOrdinarias;   // aquí guardaremos las horas normales
    let horasExtras;       // aquí guardaremos las horas extras si hay
    
    // Si trabajó más de 46 horas
    if (horasTrabajadas > 46) {
        horasOrdinarias = 46;                        // solo se pagan 46 como normales
        horasExtras = horasTrabajadas - 46;          // el resto son extras
    } else {
        horasOrdinarias = horasTrabajadas;           // todas son normales
        horasExtras = 0;                             // no hay extras
    }

    // Salario por horas ordinarias
    let salarioOrdinario = horasOrdinarias * tarifaHora;

    // Tarifa de horas extras 50% mas cara equivale a 1.5
    let tarifaHoraExtra = tarifaHora * 1.5;
    let salarioExtra = horasExtras * tarifaHoraExtra;

    // Horas extras dominicales 70% mas cara equivale a 1.7
    let tarifaHoraExtraDominical = tarifaHora * 1.7;
    let salarioExtraDominical = horasExtrasDominicales * tarifaHoraExtraDominical;

    // Sumatoria de todos los salarios
    let salarioTotal = salarioOrdinario + salarioExtra + salarioExtraDominical;

    return salarioTotal;  // devolvemos el resultado
}


//------------Petición al usuario------------------//
// Pedimos horas trabajadas en la semana
let horasTrabajadas = parseInt(prompt("Ingrese las horas trabajadas en la semana:"));

// Pedimos horas extras dominicales
let horasExtrasDominicales = parseInt(prompt("Ingrese las horas extras dominicales trabajadas:"));

// Pedimos tarifa por hora
let tarifaHora = parseInt(prompt("Ingrese la tarifa por hora:"));

// llamado a la función
let salario = calcularSalario(horasTrabajadas, horasExtrasDominicales, tarifaHora);

// Mostramos el resultado
alert("El salario total del trabajador es: " + salario);
console.log("El salario total del trabajador es: " + salario);
