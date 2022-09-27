import { React, useState } from 'react'
import "./Nav.css"
import { Link } from 'react-router-dom'
import { FaBars, FaTimes } from 'react-icons/fa'
import { Button } from 'react-bootstrap'




function Nav() {
  const [icon, setIcon] = useState(false)
  const handleClick = () => {
    setIcon(!icon)
  }
  const closeSideDrawer = () => {
    setIcon(false)
  }
  return (
    <>
      <nav className='navbar'>
        <Link to='/' className='nav-logo' onClick={closeSideDrawer}><img src ="../Images/logoo.png" className='logo' ></img></Link>
        <div className='menu-icon'
          onClick={handleClick}>
          {
            icon ? <FaTimes
              className='fa-times'></
            FaTimes> : <FaBars
              className='fa-bars'></
            FaBars>
          }

        </div>
        <ul className={
          icon ? 'nav-menu active' : 'nav-menu'
        }>
          <li className='search'>
            <input type="text" placeholder="Search For Your Book..." className='search1'></input>
          </li>
          <li>
            <Link to='/' className='nav-links' onClick={closeSideDrawer}>Home</Link>
          </li>
          <li>
            <Link to='/About' className='nav-links' onClick={closeSideDrawer}>About</Link>
          </li>
          <Link to='/Login' className='nav-links' onClick={closeSideDrawer}>Login</Link>
          {/* <p style={{ border: 'none', backgroundColor: '#53C2BC', marginTop: '15px' }}><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-cart" viewBox="0 0 16 16">
            <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l1.313 7h8.17l1.313-7H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z" />
          </svg> {0}</p> */}
        </ul>
      </nav>
    </>

  );
}

export default Nav