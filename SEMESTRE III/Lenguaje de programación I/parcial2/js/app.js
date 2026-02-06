
// Cuando alguien haga click en ese botón, se ejecuta lo que está dentro de la función
document.querySelector("#btn-analizar").addEventListener("click", function() {
    
    // Guardamos el valor de los campos
    const equipo = document.querySelector("#equipo").value;       // nombre del equipo
    const ganados = parseInt(document.querySelector("#ganados").value);   // partidos ganados
    const perdidos = parseInt(document.querySelector("#perdidos").value); // partidos perdidos
    const empatados = parseInt(document.querySelector("#empatados").value); // partidos empatados

    //Calculamos los puntos, como perder es 0 puntos, no es necesario incluirlo en la fórmula
    const puntos = (ganados * 3) + (empatados * 1);

    // Creamos un mensaje con el nombre del equipo y sus puntos
    let mensaje = "El equipo " + equipo + " tiene " + puntos + " puntos. ";

    // Condicional para saber si clasificó o no
    if (puntos >= 30) {
        mensaje += "Equipo clasificó";
    } else {
        mensaje += "Equipo no clasificó";
    }

   // Mostramos el mensaje en una ventanita emergente
    alert(mensaje);

});
