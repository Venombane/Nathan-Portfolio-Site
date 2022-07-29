import { useState, useEffect, React } from 'react';
import BlogItem from "./BlogItem";

const Blog = () => {
  const [state, setState] = useState(null);

  useEffect( () => {
      const fetchData = async () => {
          const result = await fetch("/api/v1/skills");
          const body = await result.json();
          setState(body);
      }
      fetchData();
  }, [])

  if (state == null){
    return "no data"

  }
  return (
    <section className="pb-10">
      <div className="flex flex-wrap md:px-4">
        {state.map((skill, id) => (
          <BlogItem blog={skill} key={id} />
        ))}
      </div>
    </section>
  );
};

export default Blog;
