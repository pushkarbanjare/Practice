const express = require("express");
const dotenv = require("dotenv").config();

const app = express();
const port = process.env.PORT || 5000;

app.use(express.json());
app.get("/crypto", (req, res)=>{
    res.send("Hello this is the backend of Multi-Asset-Screener");
});

app.listen(port, ()=>{
    console.log(`Server running on http://localhost:${port}`);
});