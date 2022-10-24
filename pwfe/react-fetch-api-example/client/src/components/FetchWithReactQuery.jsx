import { useQuery } from "@tanstack/react-query";
import { useState } from "react";

function FetchWithReactQuery() {
  const { data, isError, isLoading } = useQuery(["livros"], () => fetch("http://localhost:8000/livros").then(res => res.json()))

  if (isLoading) return <div>Loading...</div>

  if (isError) return <div>Error...</div>

  return (
    <div>
      <p>With React Query</p>
      {JSON.stringify(data)}
    </div>
  );
}

export default FetchWithReactQuery;
