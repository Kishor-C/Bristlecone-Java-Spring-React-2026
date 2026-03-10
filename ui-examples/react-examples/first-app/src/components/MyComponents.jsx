import axios from "axios";
import { useState } from "react";

export function FetchProfiles() {
    let url = "http://localhost:3000/profiles";
    let [profile, setProfile] = useState([]);
    
    let handleClick = (e) => {
        axios.get(url).then((res)=>setProfile(res.data));
    }
    return (<div>
        <h2>Profiles list</h2><hr />
        <button className = "btn btn-primary" onClick = {handleClick}>Fetch</button>
        <div>
          <table className = "table">
            <thead>
                <tr>
                    <th>Id</th><th>Name</th><th>Phone</th><th>Dob</th>
                </tr>
            </thead>
            <tbody>
                {
                    profile.map((ele, index)=><tr key = {ele.id}>
                        <td>{ele.id}</td><td>{ele.name}</td><td>{ele.phone}</td><td>{ele.dob}</td>
                    </tr>)
                }
            </tbody>
          </table>
        </div>
    </div>)
}


export function RegistrationForm() {
  let [name, setName] = useState("");
  let [phone, setPhone] = useState("");
  let [dob, setDob] = useState("");

  // handler to handle submit event
  let handleSubmit = (e) => {
    e.preventDefault();
    alert("data must be sent to backend");
  }
  return (<div className="container-fluid">
   
    <div className="w-50">
      <h2>User Form</h2>
      <form onSubmit = {handleSubmit}>
        <input type = "text" onChange = {(e)=>setName(e.target.value)} className="form-control w-50" 
          placeholder="Enter name"/> <br />
        <input type = "text" onChange = {(e)=>setPhone(e.target.value)} className="form-control w-50" 
          placeholder="Enter phone"/> <br />
        Select date of birth
        <input type = "date" onChange={e=>setDob(e.target.value)} className="form-control w-50" />
        <br />
        <input type = "submit" value = "Register" className="btn btn-primary"/>
      </form>
      <div>
        Name: {name}, Phone: {phone}, Dob: {dob}
      </div>
    </div>
    
  </div>)
}