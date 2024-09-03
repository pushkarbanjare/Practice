import React from "react";
import { Link, Outlet } from "react-router-dom";

const Home = () => {
  return (
    <div className="bg-slate-900 text-white h-screen scrollbar-thumb-slate-900 scrollbar-track-slate-600 scrollbar-thin overflow-y-scroll ">
      <nav className="flex justify-between px-5 py-5">
        <div className="flex items-center">
          <Link className="text-xl font-bold" to="/">
            MultiAssetScreener
          </Link>
        </div>
        <div className="flex items-center space-x-4 font-medium">
          <Link to="/signup">
            <button className="border-solid border-2 border-pink-500 px-3 py-1 rounded-md hover:bg-pink-500 duration-200 hover:text-white">
              Signup
            </button>
          </Link>
          <Link to="/login">
            <button className="border-solid border-2 border-pink-500 px-3 py-1 rounded-md hover:bg-pink-500 duration-200 hover:text-white">
              Login
            </button>
          </Link>
        </div>
      </nav>

      <div className="flex text-center h-screen">
        <div className="w-1/2">
          <div className="p-10">
            <div>
              <h3 className="text-5xl pt-20">
                Stock Screener is a platform to screen various stocks based on
                their momentum.
              </h3>
            </div>
            <div className="pt-10 font-semibold">
              <Link to="/stock">
                <button className="border-solid border-4 border-pink-500 px-3 py-1 rounded-md hover:bg-pink-500 duration-150 hover:text-white">
                  Go to Stock-Screener
                </button>
              </Link>
            </div>
          </div>
        </div>
        <div className="w-1/2">
          <div className="p-10">
            <div>
              <h3 className="text-5xl pt-20">
                Crypto Screener is a platform to screen various crypto pairs
                based on their momentum.
              </h3>
            </div>
            <div className="pt-10 font-semibold">
              <Link to="/crypto">
                <button className="border-solid border-4 border-pink-500 px-3 py-1 rounded-md hover:bg-pink-500 duration-150 hover:text-white">
                  Go to Crypto-Screener
                </button>
              </Link>
            </div>
          </div>
        </div>
      </div>

      <div className="flex justify-center">
        <div className="text-md font-semibold">
          Developer Profile :
          <a
            href="https://pushkarbanjare.vercel.app/"
            target="_blank"
            className="ml-2"
          >
            @pushkarbanjare
          </a>
        </div>
      </div>
      {/* <Outlet /> */}
    </div>
  );
};

export default Home;
