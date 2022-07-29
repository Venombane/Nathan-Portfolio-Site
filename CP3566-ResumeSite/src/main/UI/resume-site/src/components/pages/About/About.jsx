import React from "react";

const About = () => {
  return (
    <section className="py-8">
      <div className="flex flex-wrap md:px-4">
        <div className="w-full">
          <div className="md:mx-4">
            <h3 className="text-2xl text-gray-800 font-bold mb-4">Who am I?</h3>
            <p className="text-sm text-gray-400 leading-6 mb-3">
            Hello my name is Nathan Atkins and welcome to my resume site. I was
            born in the small town of Hawks Bay on the Northern Peninsula in
            Newfoundland & Labrador. We spent a lot of time moving to different
            provinces since my parents were in the military, but we eventually
            made our way to Churchill Falls where I went on to finish highschool.
            </p>
            <p className="text-sm text-gray-400 leading-6 mb-3">
            Afterwards I decided to take the Video game art & Design program
            offered at the College of the North Atlantic which lasted for 3 years,
            where I learned how to make 2d games with Unity and FPS using Unreal
            Engine 4.
            </p>
            <p className="text-sm text-gray-400 leading-6 mb-3">
            After graduating from the program I got a part time QA job
            at Clockwork Fox for a year where I learned what it's like to be
            a part of a real team and what dev cycle feels like to go through.
            </p>
            <p className="text-sm text-gray-400 leading-6 mb-3">
            Once a year passed, I decided I wanted to branch off of what i've
            learned from the previous program and take the Accelerated Software
            Development course offered at the College of the North Atlantic.
            </p>
          </div>
        </div>
      </div>
    </section>
  );
};

export default About;
