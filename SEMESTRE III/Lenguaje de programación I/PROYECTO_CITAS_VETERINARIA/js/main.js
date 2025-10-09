"use strict";
import { variablesForm } from './variablesGenerales.js';
import { setLocalStorage, getLocalStorage, deleteByIdLocalStorage } from './storage.js';  
import { getINNERHTMLDataCitas, initCitas, validaFechaHora, reAgruparCitas } from './funciones.js';

/* Iniciamos las citas guardadas */
initCitas();

//Desestructuración de objeto que esta importado
const { mascota, tipoMascota, propietario, telefono, fecha, hora, sintomas } = variablesForm;

let arrayCitas = []; //Array para guardar las citas

//Evento click para el formulario
    const btn_enviar = document.querySelector('#btn-crear');
    btn_enviar.addEventListener('click', function (event) {
        event.preventDefault();
        /* Validamos los valores de los campos */
        console.log(mascota.value, tipoMascota.value, propietario.value, telefono.value, fecha.value, hora.value, sintomas.value);

    /* Validación de campos vacíos */
    if (mascota.value == '' || tipoMascota.value == '' || propietario.value == '' || telefono.value == '' || fecha.value == '' || hora.value == '' || sintomas.value == '') {
        alert('Por favor, completa todos los campos');
        return;
    }
    alert('Formulario enviado correctamente');
    /* TODO: una vez validos los valores, crear un objeto con estos valores y prepararlos para ser guardarlos en localstorage */
    const cita = {
        mascota: mascota.value,
        tipoMascota: tipoMascota.value,
        propietario: propietario.value,
        telefono: telefono.value,
        fecha: fecha.value,
        hora: hora.value,
        sintomas: sintomas.value,
        idCita: Date.now()

    };

    /* Validar que no sea misma fecha y hora */
    if (!validaFechaHora(cita)) {
        
        /* Re agrupamos las citas */
        reAgruparCitas(cita);
    } else {
        alert('Ya existe una cita para la fecha y hora seleccionada');
        return;
    }
    

    /* Guardamos la cita en localStorage - JSON.stringify = Convierte un objeto de JavaScript en un texto (string). */
    localStorage.setItem('cita', JSON.stringify(cita));


    /* Leer localStorage */
    let dataCitas = getLocalStorage();
    getINNERHTMLDataCitas(dataCitas);

    /* Limpiamos el formulario */
    document.querySelector('form').reset();
});
