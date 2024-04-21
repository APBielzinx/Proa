import "./SugestoesAmigos.css";
import Amigos from "./amigos/Amigos";

var lista_usuarios = [
  {
    nome: "Maria",
    imagem: "https://randomuser.me/api/portraits/women/21.jpg"
  },
  {
    nome: "João",
    imagem: "https://randomuser.me/api/portraits/men/12.jpg"
  },
  {
    nome: "Ana",
    imagem: "https://randomuser.me/api/portraits/women/18.jpg"
  },
  {
    nome: "Pedro",
    imagem: "https://randomuser.me/api/portraits/men/19.jpg"
  },
  {
    nome: "Sofia",
    imagem: "https://randomuser.me/api/portraits/women/20.jpg"
  }
];

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
