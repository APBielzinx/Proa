import "./Login.css";
export default function Login(props) {
  return (
    <div className="login">
      <div className="imgLogin">
        <div className="imagem">
          <img src={props.imagem} alt={props.nome} />
        </div>
        <div className="usuario">
          <strong>{props.nome}</strong>
          <strong className="nomeReal">{props.nomeReal}</strong>
        </div>
        <div className="mudarConta">
            <strong>Mudar</strong>
        </div>
      </div>
    </div>
  );
}
