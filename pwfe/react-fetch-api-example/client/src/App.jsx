import { useState } from 'react'
import FetchWithPureJs from './components/FetchWithPureJs'
import FetchWithReactQuery from './components/FetchWithReactQuery'

function App() {
  return (
    <div>
      <p>Fetching API</p>
      <FetchWithPureJs />
      <FetchWithReactQuery />
    </div>
  )
}

export default App
