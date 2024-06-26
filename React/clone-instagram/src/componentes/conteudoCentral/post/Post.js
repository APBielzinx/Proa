import './Post.css'
import { FaRegHeart } from "react-icons/fa6";
import { BsChat } from "react-icons/bs";
import { FaRegShareFromSquare } from "react-icons/fa6";
import { FaRegBookmark } from "react-icons/fa";
import { TfiMoreAlt } from "react-icons/tfi";
export default function Post(props) {
    return (
        <div className="card post">
            <div className="card-header">
                <h3><img src={props.imgProfile} />
                    {props.nameProfile}
                    <div className='time'><h4>{props.time}</h4></div>
                    <TfiMoreAlt className='icone-post ' style={{ marginLeft:"auto" }} />
                </h3>
            </div>
            <div className="card-body">
                <img src={props.imgSrc} />
                <div className='icones'>
                    <FaRegHeart className='icone-post ' />
                    <BsChat className='icone-post ' />
                    <FaRegShareFromSquare className='icone-post ' />
                    <div className='ultimoIcone'>
                    <FaRegBookmark className='icone-post ' style={{ marginLeft: "auto" }} />
                    </div>
                    
                </div>
                <p>{props.body}</p>
            </div>
            <div className="card-footer">
                <p>Ver todos os {props.numComentarios} comentários</p>
                <input placeholder='Adicione um comentário'></input>
            </div>
        </div>
    )
}