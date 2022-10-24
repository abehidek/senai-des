import express from "express";
import cors from "cors";

const app = express();
const port = 8000;

app.use(express.json());
app.use(cors());

app.get("/livros", (req, res) => {
  res.json(["1984", "Capitões de areia"]);
});

app.listen(port, () => {
  console.log("Server running on port", port);
});
