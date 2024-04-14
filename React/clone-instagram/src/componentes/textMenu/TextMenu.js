import './TextMenu.css'
export default function TextMenu(props) {
  return (
    <li className={props.className}>
        {props.icone}
        {props.nome}
    </li>
  );
}