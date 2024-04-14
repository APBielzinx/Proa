import Story from "../story/Story";
import "./Stories.css"

var lista_usuarios = [
    {
        nome: "gabriel",
        imagem: "https://avatars.githubusercontent.com/u/48858978?v=4"
    },
    
    {
        nome: "chico",
        imagem: "https://avatars.githubusercontent.com/u/48858978?v=4"
    },
    
    {
        nome: "teu vo",
        imagem: "https://avatars.githubusercontent.com/u/48858978?v=4"
    },
    {
        nome: "chico",
        imagem: "https://avatars.githubusercontent.com/u/48858978?v=4"
    },   
    {
        nome: "chico",
        imagem: "https://avatars.githubusercontent.com/u/48858978?v=4"
    },   
    
    {
        nome: "chico",
        imagem: "https://avatars.githubusercontent.com/u/48858978?v=4"
    }
    
    ]

export default function Stories () {
    

    return (
        <div className='Stories'>
    
        {lista_usuarios.map((usuario) =>

        <Story nome={usuario.nome} imagem={usuario.imagem}/>
            
    )}

        </div>
    );
}