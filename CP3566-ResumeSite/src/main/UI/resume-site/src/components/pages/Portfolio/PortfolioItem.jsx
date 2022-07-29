import React from "react";

const PortfolioItem = (props) => {
  const { title, startDate, endDate, companyName, description } = props.portfolio;
  return (
    <div className="w-full lg:w-1/2">
      <div className="my-4 md:mx-4 shadow p-6 rounded-md bg-white group hover:shadow-md">
        <h3 className="text-lg font-medium text-gray-800">{title}</h3>
        <p className="text-gray-600">{companyName}</p>
        <p className="text-gray-500 mb-4">Start: {startDate} | End: {endDate}</p>
        <p className="text-gray-400">{description}</p>
      </div>
    </div>
  );
};

export default PortfolioItem;
