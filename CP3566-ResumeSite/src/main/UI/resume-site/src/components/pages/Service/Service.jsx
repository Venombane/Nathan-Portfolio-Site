import ServiceItem from "./ServiceItem";
import { useState, useEffect, React } from 'react';


const Service = () => {
  const [state, setState] = useState(null);

  useEffect( () => {
      const fetchData = async () => {
          const result = await fetch("/api/v1/educations");
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
        {state.map((ed, id) => (
          <ServiceItem service={ed} key={id} />
        ))}
      </div>
    </section>
  );
};

export default Service;
