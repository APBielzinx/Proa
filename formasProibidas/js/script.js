var formas2 = document.getElementById("formas2")

formas2.style.display ="none"

document.getElementById("proximasFormas").addEventListener("click",function(){

    var formas2 = document.getElementById("formas2")

    formas2.style.display ="flex"

    var formas = document.getElementById("formas")

    formas.style.display ="none"


})


document.getElementById("voltarFormas").addEventListener("click",function(){

    var formas2 = document.getElementById("formas2")

    formas2.style.display ="none"

    var formas = document.getElementById("formas")

    formas.style.display ="flex"


})

