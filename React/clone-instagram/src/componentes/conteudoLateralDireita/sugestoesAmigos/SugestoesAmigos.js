import "./SugestoesAmigos.css";
import Amigos from "./amigos/Amigos";

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
    
    
    ]

export default function SugestoesAmigos() {
  return (
    <div className="sugestoesAmigos">
      <div className="header">
        <h3>Sugestões para você</h3>
        <h4>ver tudo</h4>
      </div>

      {lista_usuarios.map((usuario) => (
        <Amigos
          imagem={usuario.imagem}
          nome={usuario.nome}
        />
      ))}
    </div>
  );
}
