import logo from './logo.svg';
import './App.css';
import Esquerda from './componentes/conteudolateralEsquerda/ConteudoLateralEsquerda';
import ConteudoCentral from './componentes/conteudoCentral/ConteudoCentral';
import ConteudoLateralDireita from './componentes/conteudoLateralDireita/ConteudoLateralDireita';
// JSX 

function App() {
  return (
    <>
      <Esquerda />

      <ConteudoCentral/>
  
      <ConteudoLateralDireita/>
    </>
  );
}

export default App;
