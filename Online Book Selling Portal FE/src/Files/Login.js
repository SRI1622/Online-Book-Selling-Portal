import React from "react";
import './Login.css';
import { Link } from 'react-router-dom'


class Login extends React.Component {
  render() {
    return (
      <>
        <div className='body'>

          <form className='login' action="#">
            <center><h1 style={{ color: "#53C2BC" }}>SIGN IN</h1>
              <br></br>
              <label className="label1">Username:</label><br></br>
              <input className='type' type="text" required></input>
              <br></br>
              <label className="label1">Password:</label><br></br>
              <input className='type' type="text" required></input><br></br>
              <br></br>
              <input className='type1' type="checkbox" /><label className="check">Remember Me</label><br></br>

              <button type='submit' className="but" ><a href="#" className="submit">SIGN IN</a></button>

              <p className="p1">Forgot password ?<a href='#'>Click here</a></p>
              {/* <p className="p1">Don't have an account ?<a href='#'>Click here</a></p> */}


            </center>
          </form>
        </div>

        <center> <p className="footer1">Don't have an account? <Link to='/Register'> REGISTER HERE</Link></p></center>

      </>
    )
  }
}





export default Login
