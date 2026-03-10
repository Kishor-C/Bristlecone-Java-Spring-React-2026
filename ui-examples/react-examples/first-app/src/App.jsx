import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {Greet, Profile, Comment } from './components/Hello'
import { Demo } from './components/Modern'
import { FetchProfiles, RegistrationForm } from './components/MyComponents'
import axios from 'axios'

function App() {
  
  return (<div>
   <h1>This is root component</h1> 
   <FetchProfiles />
   <RegistrationForm />
  </div>)
}

export default App
