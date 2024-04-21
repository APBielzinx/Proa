import './Amigos.css'
export default function Amigos(props){
    return(
        <div className="amigos">
        <div className="imgSugestao">
        <div className="imagem">
          <img src={props.imagem} alt={props.nome} />
        </div>
        <div className="usuario">
          <strong>{props.nome}</strong>
          <strong className='sugestoesParaVoce'>Sugestoes para você</strong>
        </div>
        <div className="seguir">
            <strong>seguir</strong>
        </div>
      </div>
        </div>
    )
}