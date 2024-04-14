document.getElementById("buscar").addEventListener("click", function(event){
    fetch("http://ec2-18-229-133-19.sa-east-1.compute.amazonaws.com:8080/clientes")
    .then(response => response.json())
    
    .then(json => console.log(json))
    .catch(err => console.log("Falha ao buscar usuarios " + err))
}
    )

document.getElementById("cadastrar").addEventListener("click", function(event){

    let data = {
        nome: "a",
        email: "gabb@gmail.com",
        telefone: "123244"
    }

    fetch('http://ec2-18-229-133-19.sa-east-1.compute.amazonaws.com:8080/clientes', {
        method: "POST",
        body: JSON.stringify(data),
        headers: {"Content-type": "application/json; charset=UTF-8" }
    })
        .then(response => response.json())
        .then(json => console.log(json))
        .catch(err => console.log(err));


})

