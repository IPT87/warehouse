function showAlert() {
    alert("The button was clicked!");
}

function deleteFunction(id) {
    event.preventDefault();
    window.location.href='/delete/' + id;
}
