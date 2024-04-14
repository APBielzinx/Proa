$(document).ready(function () {
  $(".modal").on("hidden.bs.modal", function () {
    // Limpar os campos de entrada
    $(this).find('input[type="number"]').val("");
    // Limpar o resultado
    $(this).find(".resultado").text("");
  });
});

function calcularRetangulo() {
  var base = parseFloat(document.getElementById("baseRetangulo").value);
  var altura = parseFloat(document.getElementById("alturaRetangulo").value);

  document.getElementById("resultado").textContent = `A área do retangulo é: ${
    base * altura
  }`;
}

function calcularCirculo() {
  var raio = parseFloat(document.getElementById("raioCirculo").value);

  var pi = 3.1415926535898;

  var total = raio * pi * 2;

  document.getElementById(
    "resultado"
  ).textContent = `A área do circulo é: ${total.toFixed(2)}`;
}

function calcularCubo() {
  var base = parseFloat(document.getElementById("baseCubo").value);

  document.getElementById("resultado").textContent = `A área do Cubo é: ${
    base * 6 * 2
  }`;
}

function calcularRomboedro() {
  var diagonal = parseFloat(document.getElementById("diagonalRomboedro").value);

  var total = 3 * diagonal ** 2;

  document.getElementById(
    "resultado"
  ).textContent = `A área do Romboedro é: ${total}`;
}

function calcularTrapezio() {
  var altura = parseFloat(document.getElementById("alturaTrapezio").value);
  var baseMaior = parseFloat(document.getElementById("baseMaior").value);
  var baseMenor = parseFloat(document.getElementById("baseMenor").value);

  var total = ((baseMenor + baseMaior) * altura) / 2;

  document.getElementById(
    "resultado"
  ).textContent = `A área do trapézio irregular é: ${total}`;
}

document
  .getElementById("selecionarPoligono")
  .addEventListener("change", function () {
    var selecionado = this.value;
    var modalEsconder = document.getElementById("modalEsconder");

    // Verifica se uma opção válida foi selecionada e exibe ou oculta os campos correspondentes
    if (selecionado === "1" || selecionado === "2" || selecionado === "3") {
      modalEsconder.style.display = "block";
    } else {
      modalEsconder.style.display = "none";
    }

    switch (selecionado) {
      case "1":
        document.getElementById("labelDado1").textContent =
          "insira o comprimento do cateto 1";
        document.getElementById("labelDado2").textContent =
          "insira o comprimento do cateto 2";
        break;
      case "2":
        document.getElementById("labelDado1").textContent =
          "insira o comprimento da diagonal 1";
        document.getElementById("labelDado2").textContent =
          "insira o comprimento da diagonal 2";
        break;
      case "3":
        document.getElementById("labelDado1").textContent =
          "insira o comprimento da base";
        document.getElementById("labelDado2").textContent =
          "insira o comprimento da altura";
        break;
      default:
        break;
    }
  });

function calcularPoligonoIrregular() {
  var selecionado = document.getElementById("selecionarPoligono").value;

  switch (selecionado) {
    case "1":
      calcularTrianguloRetangulo();
      break;
    case "2":
      calcularLozango();
      break;
    case "3":
      calcularparalelogramo();
      break;
    default:
      break;
  }
}

function calcularTrianguloRetangulo() {
  var cateto1 = parseFloat(document.getElementById("dado1").value);
  var cateto2 = parseFloat(document.getElementById("dado2").value);

  var total = 0.5 * cateto1 * cateto2;

  document.getElementById(
    "resultado"
  ).textContent = `A área do Triangulo Retangulo é: ${total}`;
}

function calcularLozango() {
  var diagonal1 = parseFloat(document.getElementById("dado1").value);
  var diagonal2 = parseFloat(document.getElementById("dado2").value);

  var total = (diagonal1 * diagonal2) / 2;

  document.getElementById(
    "resultado"
  ).textContent = `A área do lozango é: ${total}`;
}

function calcularparalelogramo() {
  var base = parseFloat(document.getElementById("dado1").value);
  var altura = parseFloat(document.getElementById("dado2").value);

  var total = base * altura;

  document.getElementById(
    "resultado"
  ).textContent = `A área do paralelogarmo é: ${total}`;
}

document.getElementById("fecharModal").addEventListener("click", function () {
  document.getElementById("modalEsconder").style.display = "none";
});

function calcularQuadrado() {
  var base = parseFloat(document.getElementById("baseQuadrado").value);
  var altura = parseFloat(document.getElementById("alturaQuadrado").value);


  if (base != altura) {
    alert("em um quadrado a base e a altura deve ser igual")
  } else {
    var total = base * altura;

  document.getElementById(
    "resultado"
  ).textContent = `A área do Quadrado é: ${total}`;
  }

  
}


function calcularCuboide(){
  var comprimento = parseFloat(document.getElementById("comprimentoCuboide").value);
  var altura = parseFloat(document.getElementById("alturaCuboide").value);
  var largura = parseFloat(document.getElementById("larguraCuboide").value);


  var total = 2 * (comprimento * largura + comprimento * altura + largura * altura)

  document.getElementById(
    "resultado"
  ).textContent = `A área do Quadrado é: ${total}`;


}
