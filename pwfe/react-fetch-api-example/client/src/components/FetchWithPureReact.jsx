import { useEffect, useState } from "react";

function FetchWithPureReact() {
  const [apiData, setApiData] = useState(undefined)
  
  useEffect(() => {
    console.log("useEffect!")
    fetch("http://localhost:8000/livros")
      .then(res => res.json())
      .then(json => setApiData(json))
  }, [])
  
  return (
    <div>
      {JSON.stringify(apiData)}
      <p>With Pure JS</p>
    </div>
  );
}

export default FetchWithPureReact;
