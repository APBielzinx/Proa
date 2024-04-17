import Menu from '../textMenu/TextMenu';
import { GoHomeFill } from "react-icons/go";
import './ConteudoLateralEsquerda.css';
import { IoIosSearch } from "react-icons/io";
import { LiaFacebookMessenger } from "react-icons/lia";
import { FaRegHeart } from "react-icons/fa6";
import { MdOutlineAddBox } from "react-icons/md";
import { CgProfile } from "react-icons/cg";
import { MdOutlineExplore } from "react-icons/md";
import { TfiVideoClapper } from "react-icons/tfi";
import { FaThreads } from "react-icons/fa6";
import { LuMenu } from "react-icons/lu";
import logo from '../../imagens/Sem_título-removebg-preview.png'

export default function ConteudoLateralEsquerda() {
    return (
        <div className='conteudoLateralEsquerda'>
          <img src={logo} className='logo'></img>
            <ul>
                <Menu icone={<GoHomeFill className='icone' />} nome="Página Inicial" className='text-menu' />
                <Menu icone={<IoIosSearch className='icone' />} nome="Pesquisa" className='text-menu' />
                <Menu icone={<MdOutlineExplore className='icone' />} nome="Explorar" className='text-menu' />
                <Menu icone={<TfiVideoClapper className='icone' />} nome="Reels" className='text-menu' />
                <Menu icone={<LiaFacebookMessenger className='icone' />} nome="Mensagens" className='text-menu' />
                <Menu icone={<FaRegHeart className='icone' />} nome="Notfications" className='text-menu' />
                <Menu icone={<MdOutlineAddBox className='icone' />} nome="Criar" className='text-menu' />
                <Menu icone={<CgProfile className='icone' />} nome="Profile" className='text-menu' />
                <Menu icone={<FaThreads className='icone' />} nome="Threads" className='itensDistantes' />
                <Menu icone={<LuMenu className='icone' />}  nome="Mais" className='itensDistantes ultimoItem'  />
            </ul>
        </div>
    )
}

// export default ConteudoLateralEsquerda;