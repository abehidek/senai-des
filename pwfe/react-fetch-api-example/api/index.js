import express from "express";
import cors from "cors";

const app = express();
const port = 8000;

app.use(express.json());
app.use(cors());

const livros = [
  {
    name: "1984",
    author: "George Orwell",
  },
  {
    name: "Capitões de areia",
    author: "Jorge Amado",
  },
];

app.get("/livros", (req, res) => {
  res.json(livros);
});

app.post("/livros", (req, res) => {
  livros.push(req.body);
  res.json({ msg: "Added book successfully" });
});

app.listen(port, () => {
  console.log("Server running on port", port);
});
