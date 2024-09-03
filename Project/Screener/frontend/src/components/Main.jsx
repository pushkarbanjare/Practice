import React from "react";

const Main = () => {
  const data = [
    ["BTC", 60000, 45, 67, 61],
    ["ETH", 2500, 32, 54, 48],
    ["SOL", 300, 27, 41, 36],
  ];
  const heading = ["Asset", "Price", "DTF", "WTF", "MTF"];

  return (
    <div className="flex justify-center">
      <div className="overflow-x-auto overflow-y-auto max-h-[600px] w-5/6">
        <table className="w-full border-collapse divide-y divide-gray-300">
          <thead>
            <tr>
              {heading.map((header, index) => (
                <th
                  key={index}
                  className="text-left text-sm font-medium text-gray-900 bg-gray-50"
                >
                  {header}
                </th>
              ))}
            </tr>
          </thead>
          <tbody>
            {data.map((row, index) => (
              <tr key={index} className="border-b hover:bg-gray-100">
                {row.map((cell, i) => (
                  <td key={i} className="text-left text-sm">
                    {cell}
                  </td>
                ))}
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default Main;
