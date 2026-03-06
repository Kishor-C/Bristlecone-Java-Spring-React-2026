import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {Greet, Profile, Comment } from './components/Hello'
import { Demo } from './components/Modern'

function App() {
  
  return (<div>
    <h1>This is a root component</h1>
    <Demo />
  </div>)
}

export default App
