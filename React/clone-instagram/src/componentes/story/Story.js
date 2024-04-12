import './Story.css'

export default function (props) {
    return (
        <div className="story">
            <div className="imagem">
                <img src={props.imagem} alt={props.nome} />
            </div>
            <div className="usuario">
                <strong>{props.nome}</strong>
            </div>
        </div>
);
}