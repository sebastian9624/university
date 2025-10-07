import { setLocalStorage, getLocalStorage, deleteByIdLocalStorage } from "./storage.js";


/* Capturar el html de la lista de citas */
const citas = document.querySelector("#citas");

/* Funciones para obtener  las citas e interpolar el HTML */
export function getINNERHTMLDataCitas(data) {
  let innerInfoCitas = ""; //Esta variable va a contener todo el HTML que se va a renderizar
  for (let i = 0; i < data.length; i++) {
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

                        <button type="button" class="btn btn-danger mr-2" onclick="deleteCita('${data[i]}')">Eliminar Cita</button>
                        <button type="button" class="btn btn-info mr-2"  onclick="editarCita('${data[i]}')"  >Editar Cita</button>
                    </div>`;
        }
    citas.innerHTML = innerInfoCitas; //Ingresa el HTML en el contenedor de citas

}


/*  Esta función permite cargar las citas inicialmente */

export function initCitas(){
    const dataLocalStorage = getLocalStorage();
    console.log(dataLocalStorage);
    
    if (!dataLocalStorage) {
        return;
    }
    
    getINNERHTMLDataCitas(dataLocalStorage);
}

/* Esta función permite validar que no sea misma fecha y hora */
export function validaFechaHora(cita){
    const dataLocalStorage = getLocalStorage();
    
    /* Buscamos con Find si hay citas iguales */
    const resultado = dataLocalStorage?.find(item => item.fecha === cita.fecha && item.hora === cita.hora);
    if (resultado) {
        return true
    } else {
        return false
    }
    
    
}

/* Re-agrupar todas las citas */
export function reAgruparCitas(cita){
    const dataLocalStorage = getLocalStorage();
    let arrayCitas = [];

    if (dataLocalStorage) {
        arrayCitas = [...dataLocalStorage, cita]; //spread operator para agrupar elementos 
        
    } else {
        arrayCitas.push(cita);
    }
    setLocalStorage(arrayCitas);
}

/* TODO: Función para editar cita */


export function editarCita(id) {
    console.log('Editar cita con ID:', id);

    // Traemos todas las citas que están guardadas en el localStorage
    let dataCitas = getLocalStorage();

    // Mostramos en consola para verificar que sí se trajo la lista
    console.log("Citas guardadas:", dataCitas);

    // Buscamos dentro del array la cita que tenga el mismo idCita que el id recibido
    const cita = dataCitas.find(c => c.idCita === id);

    // Si encontramos la cita...
    if (cita) {
        // Llenamos el formulario con esos datos
        mascota.value = cita.mascota;
        tipoMascota.value = cita.tipoMascota;
        propietario.value = cita.propietario;
        telefono.value = cita.telefono;
        fecha.value = cita.fecha;
        hora.value = cita.hora;
        sintomas.value = cita.sintomas;

        // Mostramos un mensaje para confirmar que se cargaron los datos
        alert('Datos de la cita cargados en el formulario');

    } 
    
    else {
        alert('No se encontró la cita con ese ID');
    }
}
