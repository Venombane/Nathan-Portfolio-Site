import React from "react";
import {
  FaFacebookF,
  FaGithub,
  FaInstagram,
  FaLinkedinIn,
  FaTwitter,
} from "react-icons/fa";
import profile from "../../../images/profile.jpg";

const socials = [
  {
    id: 1,
    icon: <FaFacebookF />,
    link: "https://www.facebook.com/nathan.atkins.963",
  },
  {
    id: 2,
    icon: <FaGithub />,
    link: "https://github.com/Venombane",
  },
  {
    id: 3,
    icon: <FaLinkedinIn />,
    link: "https://www.linkedin.com/in/nathan-atkins-3a54a71b1/",
  },
  {
    id: 4,
    icon: <FaInstagram />,
    link: "#0",
  },
  {
    id: 5,
    icon: <FaTwitter />,
    link: "https://twitter.com/Onyxbane",
  },
];

const Sidebar = () => {
  return (
    <aside className="sticky top-0 bg-white md:mx-8 lg:mx-4 mb-8 p-6 shadow-md rounded-md -mt-40">
      <div className="w-24 h-24 rounded-md overflow-hidden mx-auto mb-5">
        <img src={profile} alt="shafiqhammad" className="w-full" />
      </div>
      <div className="text-center">
        <h1 className="text-xl text-gray-800 font-bold mb-1">Nathan Atkins</h1>
        <p className="text-sm text-gray-400 mb-3">
          Full Stack Developer
        </p>
        <ul className="flex flex-wrap justify-center">
          {socials.map((social, id) => (
            <SocialIcon social={social} key={id} />
          ))}
        </ul>
      </div>
      <div className="text-start pt-4">
        <h3 className="text-md mb-2 uppercase font-medium text-gray-800">
          About Me
        </h3>
        <p className="text-gray-400 text font-light leading-relaxed">
          Some of my favorite things to do in my spare time is to play video
          games, read books, go cod fishing, and going to the movie theaters.
          In terms of games I prefer to play World of Warcraft, Destiny 2,
          Terraria, and League of Legends and when it comes to books I'm a 
          big fan of the Halo, World of Warcraft, and the Percy Jackson
          series of books. When it comes to movies I mostly watch action
          and Sci-fi movies.
        </p>
      </div>
    </aside>
  );
};

export default Sidebar;

const SocialIcon = (props) => {
  const { icon, link } = props.social;
  return (
    <li className="m-2">
      <a
        href={link}
        className="w-8 h-8 bg-purple-100 rounded text-purple-800 flex items-center justify-center hover:text-white hover:bg-purple-600"
      >
        {icon}
      </a>
    </li>
  );
};
