import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {Greet, Profile, Comment } from './components/Hello'
import { Demo } from './components/Modern'

function App() {
  let [name, setName] = useState("");
  let [phone, setPhone] = useState("");
  let [dob, setDob] = useState("");

  // handler to handle submit event
  let handleSubmit = (e) => {
    e.preventDefault();
    alert("data must be sent to backend");
  }
  return (<div className="container-fluid">
    <h1>This is a root component</h1>
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

export default App
