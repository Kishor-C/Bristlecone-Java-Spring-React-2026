import { createContext, useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {Greet, Profile, Comment } from './components/Hello'
import { Demo } from './components/Modern'
import { FetchProfiles, RegistrationForm } from './components/MyComponents'
import axios from 'axios'
import { Link, Route, Routes } from 'react-router-dom'

// creating a common data using context

export const ProfileContext = createContext();

function App() {
  const user = {name : "Admin", age : 30};

  return (<ProfileContext.Provider value = {user}>
    <div className = "container-fluid">
    <h1 className="alert alert-primary text-center">This is root component</h1> 
    <Link to="greet" className='btn btn-primary btn-lg'>Greet</Link> &nbsp;
    <Link to="register" className='btn btn-primary btn-lg'>Register</Link> &nbsp;
    <Link to="findAll" className='btn btn-primary btn-lg'>Display All</Link> &nbsp;
    <Link to="" className='btn btn-primary btn-lg'>Home</Link> &nbsp;
    <hr />
    <div>
      <Routes>
        <Route path = "" element = {<div>Click on any above link</div>}></Route>
        <Route path = "greet" element = {<Greet />} />
        <Route path = "register" element = {<RegistrationForm />} />
        <Route path = "findAll" element = {<FetchProfiles />} />
      </Routes>
    </div>
    </div>
  </ProfileContext.Provider>)
}

export default App
