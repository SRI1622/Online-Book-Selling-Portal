import React from 'react'
import "./About.css"
import { Link } from 'react-router-dom'
// import { Link } from "react-router-dom"s

function About() {
  return (
    <>
      <div >
        <center>
         <h2 className='about' style={{ marginTop: "100px" }}><b><u>ABOUT US</u></b></h2>
        <p className='det' style={{ marginTop: "-100px" }}><i>BOOK HUB, a startup began its business by selling books online. This was a time when e-commerce platforms were new in the market and in a relatively growing digital era, we did want to test the water. The primary objective has been to promote Indian Publishers and Authors. Our mission is to provide an extensive range of books spanning from Fiction, Non-Fiction, Literature, Classics, Academic, Competitive Exam books written by Indian and International Authors to users all across India at most affordable price. The business has successfully sustained and operated over the years. Currently, Buy Books India holds a vast pool of happy customers while efficiently delivering orders to Pan India. The team at BOOKHUB.COM takes pride in its inception, and journey so far. We truly believe in the vision & mission of delivering reading opportunities from quality books across the globe.</i></p>
        </center>
      </div>
      {/* <nav>
        <Link to="/">Home</Link>
      </nav> */}
    </>
  );
}
export default About