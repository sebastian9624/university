/* Vamos a crear 3 funciones */

/* función para crear un local storage  */
export function setLocalStorage(data) {
    localStorage.setItem('dataCitas', JSON.stringify(data));
}

/* Función para obtener datos del local storage */
export function getLocalStorage() {
    const data = JSON.parse(localStorage.getItem('dataCitas'));
    return data;
}

/* Función para eliminar datos del local storage */
export function deleteByIdLocalStorage(id) {
    //TODO: Que reciba por parametro el id de la cita a eliminar, que compare ese ID y lo elimine del localStorage sin la cita que se elimino
    localStorage.removeItem('dataCitas');
}

