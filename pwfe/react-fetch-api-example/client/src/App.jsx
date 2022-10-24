import { useState } from 'react'
import FetchWithPureReact from './components/FetchWithPureReact'
import FetchWithReactQuery from './components/FetchWithReactQuery'
import { useQuery } from "@tanstack/react-query"

function App() {
  const query = useQuery(['livros'], )
  return (
    <div>
      <p>Fetching API</p>
      <FetchWithPureReact />
      <FetchWithReactQuery />
    </div>
  )
}

export default App
