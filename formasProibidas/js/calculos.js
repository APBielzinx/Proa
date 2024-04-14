function calcularRetangulo() {
    var base = document.getElementById("baseRetangulo").value
    var altura = document.getElementById("alturaRetangulo").value

    document.getElementById("resultado").textContent = `A área do retangulo é: ${base * altura}`
}

function calcularCirculo() {
    var raio = document.getElementById("raioCirculo").value

    var pi = 3.1415926535898

    var total = (raio * pi) * 2.

    document.getElementById("resultado").textContent = `A área do circulo é: ${total.toFixed(2)}`
}


function calcularCubo() {
    var base = document.getElementById("baseCubo").value
  
    document.getElementById("resultado").textContent = `A área do Cubo é: ${(base * 6)*2}`
}


function calcularRomboedro() {
    var diagonal = document.getElementById("diagonalRomboedro").value
  
    var total = 3 * diagonal ** 2

    document.getElementById("resultado").textContent = `A área do Romboedro é: ${total}`
}
