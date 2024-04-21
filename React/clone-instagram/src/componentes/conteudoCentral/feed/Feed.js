import "./Feed.css";
import Post from "../post/Post";

var listPosts = [
  {
    imgProfile: "https://randomuser.me/api/portraits/men/20.jpg",
    nameProfile: "Lucas",
    time: "● 2d",
    imgSrc: "https://picsum.photos/id/237/200/300",
    body: "Um jantar incrível com uma vista deslumbrante. A comida estava divina!",
    numComentarios: 200,
  },
  {
    imgProfile: "https://randomuser.me/api/portraits/women/21.jpg",
    nameProfile: "Isabela",
    time: "● 1d",
    imgSrc: "https://picsum.photos/id/238/200/300",
    body: "Explorando novos horizontes. Essa vista é de tirar o fôlego!",
    numComentarios: 400,
  },
  {
    imgProfile: "https://randomuser.me/api/portraits/men/22.jpg",
    nameProfile: "Gabriel",
    time: "● 3d",
    imgSrc: "https://picsum.photos/id/239/200/300",
    body: "Apreciando o pôr do sol na montanha. A paz e serenidade do momento são indescritíveis.",
    numComentarios: 150
  }
];

export default function Feed() {
  return (
    <div className="Feed">
      {listPosts.map((posts) => (
        <Post
          imgProfile={posts.imgProfile}
          nameProfile={posts.nameProfile}
          time={posts.time}
          imgSrc={posts.imgSrc}
          body={posts.body}
          numComentarios={posts.numComentarios}
        />
      ))}
    </div>
  );
}
