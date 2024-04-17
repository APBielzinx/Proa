import Feed from './feed/Feed'
import Stories from '../stories/Stories'
import './ConteudoCentral.css'
export default function ConteudoCentral(){
return(
    <>
    
    <div className='conteudoCentral'>
        <Stories/>
        <Feed/>
      </div>
      

    </>
)
}