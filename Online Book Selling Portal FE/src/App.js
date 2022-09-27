import React, { PureComponent } from 'react';
import './App.css';
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";

import Nav from './Files/Nav';
import Home from './Files/Home';
import About from './Files/About';
import Login from './Files/Login';
import Register from './Files/Register';

class App extends PureComponent {
  render() {
    return (
      <div>
        <Router>
          <React.StrictMode>

            <Nav />
            <Switch>
              <Route path='/About' render={() => <About />} />
              <Route path='/Login' component={Login} />
              <Route path='/Register' component={Register} />
              <Route path='/' exact component={Home} />
            </Switch>

          </React.StrictMode>
        </Router>
      </div>

    )
  }
}



export default App;
