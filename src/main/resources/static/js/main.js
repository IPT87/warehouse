function showDeletedAlert() {
    alert("The product was deleted!");
}

function showAddedAlert() {
    alert("The product was added!");
}

function deleteFunction(id) {
    event.preventDefault();
    window.location.href='/delete/' + id;
}
