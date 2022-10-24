import { useState } from 'react'
import FetchWithPureReact from './components/FetchWithPureReact'
import FetchWithReactQuery from './components/FetchWithReactQuery'

function App() {
  return (
    <div>
      <p>Fetching API</p>
      <FetchWithPureReact />
      <FetchWithReactQuery />
    </div>
  )
}

export default App
