import logo from './logo.svg';
import './App.css';
import Esquerda from './componentes/conteudolateralEsquerda/ConteudoLateralEsquerda';
import ConteudoCentral from './componentes/conteudoCentral/ConteudoCentral';
// JSX 

function App() {
  return (
    <>
      <Esquerda />

      <ConteudoCentral/>
  
      <div className='conteudoLateralDireita'>
        {/* 
          Login
          Sugestões de amigos
          Sugestões de contas
          Sugestões de hashtags
          Sugestões de locais
          Sugestões de posts patrocinados
          Link legais
        */}
      </div>
    </>
  );
}

export default App;
