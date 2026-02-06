import { setLocalStorage, getLocalStorage, deleteByIdLocalStorage } from "./storage.js";

// Capturar el HTML de la lista de citas
const citas = document.querySelector("#citas");
console.log(citas);

//Función para obtener las citas e interpolar el HTML
export function getINNERHTMLDataCitas(data){
    let innerInfoCitas =''; //Esta variable va a acumular HTML

    for(let i=0; i < data.length; i++) {
        innerInfoCitas += `<div class="cita p-3">
                            <h2 class="card-title font-weight-border">${data[i].mascota}</h2>
                            <p>
                                <span class="font-weight-border">Tipo mascota: </span>${data[i].tipoMascota}
                            </p>
                            <p>
                                <span class="font-weight-border">Propietario: </span>${data[i].propietario}
                            </p>
                            <p>
                                <span class="font-weight-border">Teléfono: </span>${data[i].telefono}
                            </p>
                            <p>
                                <span class="font-weight-border">Fecha: </span>${data[i].fecha}
                            </p>
                            <p>
                                <span class="font-weight-border">Hora: </span>${data[i].hora}
                            </p>
                            <p>
                                <span class="font-weight-border">Síntomas: </span>${data[i].sintomas}
                            </p>

                            <button type="button" class="btn btn-danger mr-2" onclick="deleteCita('${data[i].idCita}')">Eliminar Cita</button>
                            <button type="button" class="btn btn-info mr-2" onclick="editarCita('${data[i].idCita}')">Editar Cita</button>
                        </div>`;
    }

    citas.innerHTML = innerInfoCitas; //Ingresa el HTML en el contenedor de las citas


}
//ESTA FUNCION ME PERMITE CARGAR LAS CITAS INICIALMENTE
export function initCitas () {
    const dataLS= getLocalStorage ();
        
    if( !dataLS ) {
        return;
    }

    getINNERHTMLDataCitas (dataLS);
}

//Esta función nos permite validar que no sea misma fecha y hora
export function validaFechaHora(cita){
    const dataLS= getLocalStorage ();

    //Buscamos con FIND si hay citas iguales
    const resultado = dataLS?.find(item => item.fecha == cita.fecha && item.hora == cita.hora)
    if (resultado){
        return true;
    } else {
        return false;
    }
}


//Reagrupar todas las citas
export function reAgruparCitas (cita){
    const dataLS = getLocalStorage();
    let arrayCitas= [];

    if (dataLS) {
        arrayCitas = [ ...dataLS, cita] //Spread operator para agrupar elementos

    }
    else {
        arrayCitas.push(cita) //.push mme permite ingresar info a un array
        
    }

    setLocalStorage(arrayCitas)
    
}

//Función en botón de editar 
window.editarCita = function (idCita) {
    const citasGuardadas = getLocalStorage();
    // Buscamos la cita que coincide con el id recibido
    const cita = citasGuardadas.find(c => c.idCita === parseInt(idCita));

    // Llenamos los campos del formulario con los datos de la cita
    mascota.value = cita.mascota;
    tipoMascota.value = cita.tipoMascota;
    propietario.value = cita.propietario;
    telefono.value = cita.telefono;
    fecha.value = cita.fecha;
    hora.value = cita.hora;
    sintomas.value = cita.sintomas;

    // Guardamos en localStorage que estamos editando esta cita
    localStorage.setItem("editando", idCita);
    // Reemplazamos la cita en el array eliminando la antigua
    const citasActualizadas = citasGuardadas.filter(c => c.idCita !== parseInt(idCita));
    setLocalStorage(citasActualizadas);
}

// Función para eliminar cita
window.deleteCita = function(idCita) {
    console.log('Eliminar cita con ID:', idCita);
    
    // Obtener todas las citas guardadas en localStorage
    let dataCitas = getLocalStorage();

    // Filtrar todas las citas, excluyendo la que tiene el id que se quiere eliminar
    const nuevaDataCitas = dataCitas.filter(c => c.idCita !== Number(idCita));

    // Guardar el nuevo array (sin la cita eliminada)
    setLocalStorage(nuevaDataCitas);
    getINNERHTMLDataCitas(nuevaDataCitas);
    alert('Cita eliminada correctamente');
}
