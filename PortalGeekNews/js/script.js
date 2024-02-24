window.addEventListener('scroll', function() {
    var nav = document.querySelector('nav');
    if (window.scrollY > 100) { 
        nav.classList.add('nav-transparente');
    } else {
        nav.classList.remove('nav-transparente');
    }
});
