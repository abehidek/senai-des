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
      <p>With Pure JS</p>
      {JSON.stringify(apiData)}
    </div>
  );
}

export default FetchWithPureReact;
