const express = require('express');
const cors = require('cors');
const app = express();
const path = require('path'); // Added path module

const port = process.env.PORT || 5000;
// app.use(express.static(path.join(__dirname, '../frontend/src/App.jsx')));

app.use(cors());
app.get("/", (req, res)=>{
  res.send("Server response is showing on webpage!!")
});


app.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});