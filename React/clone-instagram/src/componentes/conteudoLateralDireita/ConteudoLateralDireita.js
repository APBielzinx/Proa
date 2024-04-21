import  './ConteudoLateralDireita.css'
import Copy from './copy/Copy'
import Login from './login/Login'
import SugestoesAmigos from './sugestoesAmigos/SugestoesAmigos'
import SugestoesConta from './sugestoesConta/SugestoesConta'

export default function ConteudoLateralDireita() {
    return(
<div className='conteudoLateralDireita'>
      
        <Login imagem="https://avatars.githubusercontent.com/u/48858978?v=4" nome="APBielzinx" nomeReal="Gabriel"/>
        <SugestoesAmigos/>
        <SugestoesConta/>
        <Copy/>
      </div>
    )


}