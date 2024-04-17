import "./Feed.css"
import Post from "../post/Post";

export default function Feed() {
    return (
        <div className='Feed'>
            <Post 
            imgProfile ="https://img.freepik.com/fotos-premium/linda-e-fofa-jovem-garota-de-anime-ia-generativa_755833-81.jpg?w=740"
            nameProfile="Chico" 
            time = " ● 2d"
            imgSrc="https://mlabs-wordpress-site.s3.amazonaws.com/wp-content/uploads/2018/04/dimitri-tyan-232294-unsplash-1.jpg" 
            body="Olha só que camera incrivel!!"
            numComentarios = "500"
            />
              <Post 
            imgProfile ="https://img.freepik.com/fotos-premium/linda-e-fofa-jovem-garota-de-anime-ia-generativa_755833-81.jpg?w=740"
            nameProfile="Chico" 
            time = " ● 2d"
            imgSrc="https://mlabs-wordpress-site.s3.amazonaws.com/wp-content/uploads/2018/04/dimitri-tyan-232294-unsplash-1.jpg" 
            body="Olha só que camera incrivel!!"
            numComentarios = "500"
            />
        </div>
    );
}