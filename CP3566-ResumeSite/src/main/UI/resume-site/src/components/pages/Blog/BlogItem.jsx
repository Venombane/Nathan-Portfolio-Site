import React from "react";

const BlogItem = (props) => {
  const { name, type } = props.blog;
  return (
    <div className="w-full lg:w-1/2">
      <div className="my-4 md:mx-4 shadow p-6 rounded-md bg-white group hover:shadow-md">
        <h3>{name}</h3>
        <p className="text-gray-400">{type}</p>
      </div>
    </div>
  );
};

export default BlogItem;
