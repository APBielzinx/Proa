import logo from '../../imagens/images.png';
import Menu from '../textMenu/TextMenu';
import { GoHomeFill } from "react-icons/go";
import './ConteudoLateralEsquerda.css';
import { IoIosSearch } from "react-icons/io";
import { LiaFacebookMessenger } from "react-icons/lia";
import { FaRegHeart } from "react-icons/fa6";
import { MdOutlineAddBox } from "react-icons/md";
import { CgProfile } from "react-icons/cg";

export default function ConteudoLateralEsquerda() {
    return (
        <div className='conteudoLateralEsquerda'>
            <ul>
                <Menu icone={<GoHomeFill className='icone' />} nome="Home" className='text-menu' />
                <Menu icone={<IoIosSearch className='icone' />} nome="Explore" className='text-menu' />
                <Menu icone={<LiaFacebookMessenger className='icone' />} nome="Mensagens" className='text-menu' />
                <Menu icone={<FaRegHeart className='icone' />} nome="Notfications" className='text-menu' />
                <Menu icone={<MdOutlineAddBox className='icone' />} nome="Other" className='text-menu' />
                <Menu icone={<CgProfile className='icone' />} nome="Profile" className='profile' />
            </ul>
        </div>
    )
}

// export default ConteudoLateralEsquerda;