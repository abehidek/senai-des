import { useEffect, useState } from "react";

function FetchWithPureReact() {
  const [apiData, setApiData] = useState(undefined)
  const [formData, setFormData] = useState({ name: "", author: "" })
  
  useEffect(() => {
    console.log("useEffect!")
    fetch("http://localhost:8000/livros")
      .then(res => res.json())
      .then(json => setApiData(json))
  }, [])

  function handleFormSubmit (event) {
    event.preventDefault()
    console.log(formData)
    fetch("http://localhost:8000/livros", {
      method: "POST",
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(formData)
    })
      .then(res => res.json())
      .then(json => console.log(json))
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
      <p>With Pure JS</p>
      {JSON.stringify(apiData)}
      <form onSubmit={handleFormSubmit}>
        <input placeholder="Digite o nome do livro" name="name" type="text" onChange={handleFormChange} value={formData.name} />
        <input placeholder="Digite o nome do autor" name="author" type="text" onChange={handleFormChange} value={formData.author} />
        <button type="submit">Adicionar</button>
      </form>
    </div>
  );
}

export default FetchWithPureReact;
