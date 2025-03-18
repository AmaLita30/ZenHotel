document.addEventListener('DOMContentLoaded', function() {
    const hasSubmenus = document.querySelectorAll('.has-submenu > a');
    let currentOpenSubmenu = null; // Variable para almacenar el submenú abierto actualmente

    hasSubmenus.forEach(function(item) {
        item.addEventListener('click', function(event) {
            event.preventDefault();
            const submenu = this.nextElementSibling;
            const active = this; // Selecciona el botón clickeado

            // Remover 'active' de todos los botones
            document.querySelectorAll('.nav-btn').forEach(btn => btn.classList.remove('active'));

            if (submenu.style.display === 'block') {
                submenu.style.display = 'none';
                currentOpenSubmenu = null; // Ningún submenú abierto
            } else {
                // Cerrar el submenú abierto actualmente (si existe)
                if (currentOpenSubmenu && currentOpenSubmenu !== submenu) {
                    currentOpenSubmenu.style.display = 'none';
                }
                active.classList.add('active'); // Solo marcar el botón clickeado
                submenu.style.display = 'block';
                currentOpenSubmenu = submenu; // Actualizar el submenú abierto
            }
        });
    });
});
