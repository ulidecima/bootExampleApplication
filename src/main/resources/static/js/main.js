document.addEventListener('DOMContentLoaded', function () {
    fetch('/datos')
        .then(response => response.json())
        .then(data => {
            const ciudadesDiv = document.getElementById('ciudades');
            data.forEach(ciudad => {
                const ciudadElement = document.createElement('div');
                ciudadElement.textContent = `Ciudad: ${ciudad.nombre}, Temperatura: ${ciudad.temperatura}°C`;
                ciudadesDiv.appendChild(ciudadElement);
            });
        })
        .catch(error => console.error('Error:', error));
});
