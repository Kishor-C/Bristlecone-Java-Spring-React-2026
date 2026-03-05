
// create a component as below
export function Greet(props) {
  let username = props.username
  let age = props.age;
  return (<div>
    <h1>Hello {username}</h1>
    <p>Your age is {age}</p>
  </div>)
}
export function Profile(props) {
  let imageURL = props.imageUrl;
  let username = props.username;
  return (<div>
    <img src = {imageURL} width = "200" height = "200" />
    <h3>{username}</h3>
  </div>)
}
export function Comment(props) {
  let text = props.data.text;
  return (<div>
    <Profile imageUrl = {props.data.imageUrl} username = {props.data.username} />
    <p>{text}</p>
  </div>)
}