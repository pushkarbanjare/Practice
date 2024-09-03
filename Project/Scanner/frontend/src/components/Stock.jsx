import React from "react";

const Stock = () => {
  return (
    <div className="bg-slate-900 text-white h-screen w-screen">
      <div className="text-center p-5">
        <h1 className="text-xl font-bold">Stock-Screener</h1>
      </div>
      <div>
        <div>Nifty 50</div>
        <div>NiftyNext 50</div>
        <div>Nifty Midcap</div>
        <div>Nifty Smallcap</div>
      </div>
    </div>
  );
};

export default Stock;
