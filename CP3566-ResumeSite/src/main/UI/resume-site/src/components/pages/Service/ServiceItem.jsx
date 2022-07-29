import React from "react";

const ServiceItem = (props) => {
  const { title, institutionName, gradYear, startDate, endDate, abbreviation } = props.service;
  return (
    <div className="w-full lg:w-1/2">
      <div className="my-4 md:mx-4 shadow p-6 rounded-md bg-white group hover:shadow-md">
        <h2 className="text-lg font-bold text-gray-800 mb-1">{title} | {abbreviation}</h2>
        <hr></hr>
        <h3 className="text-md font-medium text-gray-800 mb-2">{institutionName}</h3>
        <p className="text-gray-400">Graduation Year: {gradYear}</p>
        <p className="text-gray-400">Start: {startDate} |
         End: {endDate}</p>
      </div>
    </div>
  );
};

export default ServiceItem;
