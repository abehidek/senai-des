import { useQuery } from "@tanstack/react-query";
import { useState } from "react";

function FetchWithReactQuery() {
  const { data, isError, isLoading } = useQuery(["livros"], () => fetch("http://localhost:8000/livros").then(res => res.json()))
  const [formData, setFormData] = useState({ name: "", author: "" })

  if (isLoading) return <div>Loading...</div>

  if (isError) return <div>Error...</div>

  function handleFormSubmit (event) {
    event.preventDefault()
    console.log(formData)
  }

  function handleFormChange (event) {
    event.preventDefault()
    const { name, value } = event.target
    setFormData(prev => ({
      ...prev,
      [name]: value
    }))
  }

  return (
    <div>
      <p>With React Query</p>
      {JSON.stringify(data)}
      <form onSubmit={handleFormSubmit}>
        <input placeholder="Digite o nome do livro" name="name" type="text" onChange={handleFormChange} value={formData.name} />
        <input placeholder="Digite o nome do autor" name="author" type="text" onChange={handleFormChange} value={formData.author} />
        <button type="submit">Adicionar</button>
      </form>
    </div>
  );
}

export default FetchWithReactQuery;
