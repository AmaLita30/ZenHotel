document.addEventListener('DOMContentLoaded', function() {
    const hasSubmenus = document.querySelectorAll('.has-submenu > a');
    let currentOpenSubmenu = null; // Variable para almacenar el submenú abierto actualmente

    hasSubmenus.forEach(function(item) {
        item.addEventListener('click', function(event) {
            event.preventDefault();
            const submenu = this.nextElementSibling;
            const active = document.querySelector('.has-submenu .nav-btn')
            
            if (submenu.style.display === 'block') {
                submenu.style.display = 'none';
                currentOpenSubmenu = null; // Ningún submenú abierto
                active.classList.remove('active')
            } else {
                // Cerrar el submenú abierto actualmente (si existe)
                if (currentOpenSubmenu && currentOpenSubmenu !== submenu) {
                    currentOpenSubmenu.style.display = 'none';
                }
                active.classList.add('active')
                submenu.style.display = 'block';
                currentOpenSubmenu = submenu; // Actualizar el submenú abierto
            }
        });
    });
});