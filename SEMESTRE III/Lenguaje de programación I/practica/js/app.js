function pago_salario(horas_trabajo, horas_dominicales, tarifa_hora) {

    let horas_ordinarias;
    let horas_extras;

    
    if (horas_trabajo > 46) {
        horas_ordinarias = 46;                     
        horas_extras = horas_trabajo - 46;         
    } else {
        horas_ordinarias = horas_trabajo;          
        horas_extras = 0;                          
    }


    let salario_ordinario = horas_ordinarias * tarifa_hora;

    let tarifa_extra = tarifa_hora * 1.5;
    let salario_extras = horas_extras * tarifa_extra;

    let tarifa_dominical = tarifa_hora * 1.7;
    let salario_dominical = horas_dominicales * tarifa_dominical;

    
    let salario_total = salario_ordinario + salario_extras + salario_dominical;

    return salario_total;
}



let horas_trabajadas = parseInt(prompt("Ingrese las horas trabajadas en la semana:"));
let horas_dominicales = parseInt(prompt("Ingrese las horas extras dominicales:"));
let pago_hora = parseInt(prompt("Ingrese el valor de la tarifa por hora:"));


let salario_total = pago_salario(horas_trabajadas, horas_dominicales, pago_hora);

console.log("El salario total del trabajador es: " + salario_total);
