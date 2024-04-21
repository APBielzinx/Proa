import Story from "../story/Story";
import "./Stories.css"

var lista_usuarios = [
    {
        nome: "Roberta",
        imagem: "https://randomuser.me/api/portraits/women/1.jpg"
      },
      {
        nome: "claudio",
        imagem: "https://randomuser.me/api/portraits/men/2.jpg"
      },
      {
        nome: "Joana",
        imagem: "https://randomuser.me/api/portraits/women/3.jpg"
      },
      {
        nome: "Jef",
        imagem: "https://randomuser.me/api/portraits/men/4.jpg"
      },
      {
        nome: "tati",
        imagem: "https://randomuser.me/api/portraits/women/5.jpg"
      },
      {
        nome: "Rodnei",
        imagem: "https://randomuser.me/api/portraits/men/10.jpg"
      },
      {
        nome: "fabi",
        imagem: "https://randomuser.me/api/portraits/women/8.jpg"
      }
    ];
    

export default function Stories () {
    

    return (
        <div className='Stories'>
    
        {lista_usuarios.map((usuario) =>

        <Story nome={usuario.nome} imagem={usuario.imagem}/>
            
    )}

        </div>
    );
}