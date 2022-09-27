import React from "react";
import './Register.css';
import { Link } from 'react-router-dom'

class Register extends React.Component {
  render() {
    return (
      <>

        <div className='body' style={{ marginTop: '20px' }}>

          <form className='login'>
            <center><h1 style={{ color: "#53C2BC" }}>SIGN UP</h1></center>
            <br></br>

            <input className='type12' type="text" placeholder="Name.."></input>
            <br></br>
            <br></br>
            <input className='type12' type="text" placeholder="Email.."></input>
            <br></br>
            <br></br>
            <input className='type12' type="text" placeholder="Phone Number.."></input>
            <br></br>
            <br></br>
            <input className='type12' type="text" placeholder="Address.."></input>
            <br></br>
            <br></br>
            <input className='type12' type="text" placeholder="Password.."></input>


            <br></br>
            <br></br>
            <input className='box' type="checkbox" ></input>
            <p className="p2" style={{}}>I accept the <a href="#">Terms of Use </a> & <a href="#"> Privacy Policy</a></p>
            <br />
            <button type='submit' className="but1"><a href="#" className="submit1">SIGN UP</a></button>




          </form>

        </div>
        <center> <p className="footer">Already have an account? <Link to='/Login'>LOGIN HERE</Link></p></center>
      </>
    )
  }
}





export default Register
