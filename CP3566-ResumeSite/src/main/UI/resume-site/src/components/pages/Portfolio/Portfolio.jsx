import { useState, useEffect, React } from 'react';
import PortfolioItem from "./PortfolioItem";

const Portfolio = () => {
  const [state, setState] = useState(null);

  useEffect( () => {
      const fetchData = async () => {
          const result = await fetch("/api/v1/experiences");
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
        {state.map((experience, id) => (
          <PortfolioItem portfolio={experience} key={id} />
        ))}
      </div>
    </section>
  );
};

export default Portfolio;
