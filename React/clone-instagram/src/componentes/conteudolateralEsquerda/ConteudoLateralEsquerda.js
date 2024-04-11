import logo from '../../imagens/images.png';
import Menu from '../textMenu/TextMenu';
import { GoHomeFill } from "react-icons/go";
import  './ConteudoLateralEsquerda.css';
import { IoIosSearch } from "react-icons/io";
import { LiaFacebookMessenger } from "react-icons/lia";
import { FaRegHeart } from "react-icons/fa6";
import { MdOutlineAddBox } from "react-icons/md";
import { CgProfile } from "react-icons/cg";

export default function ConteudoLateralEsquerda() {
    return (
        <div className='conteudoLateralEsquerda'>
            <img src={logo} alt='Logo' className='logo' />
            <p>Exemplo de conteúdo lateral esquerda</p>
            <ul>
                <Menu icone={<GoHomeFill style={{
                    fontSize : "3vh",
                    marginRight: "1vw"

                }}/>} nome="Home" />
                <Menu icone={<IoIosSearch  style={{
                    fontSize : "3vh",
                    marginRight: "1vw"

                }}/>} nome="Explore" />
                <Menu icone={<LiaFacebookMessenger style={{
                    fontSize : "3vh",
                    marginRight: "1vw"

                }}/>} nome="Mensagens" />
                <Menu icone={<FaRegHeart style={{
                    fontSize : "3vh",
                    marginRight: "1vw"

                }}/>}  nome="Notfications" />
                <Menu icone={<MdOutlineAddBox style={{
                    fontSize : "3vh",
                    marginRight: "1vw"

                }}/>}  nome="other" />
                <Menu icone={<CgProfile style={{
                    fontSize : "3vh",
                    marginRight: "1vw"

                }}/>}  nome="Profile" />
            </ul>
        </div>
    )
}

// export default ConteudoLateralEsquerda;