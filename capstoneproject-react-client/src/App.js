import React, { Component } from "react";
import './App.css';
import Dashboard from "./components/Dashboard";
import Header from "./components/Layout/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import {BrowserRouter as Router, Route} from "react-router-dom";

class App extends Component {
  render(){
  return (
    <Router></Router>
    <div className="App">
      <Header />
      <Route exact path="/dashboard" component={AddProject} />
      <Route exact path="/addProject" component={AddProject} />
    </div>
    </Router>
    );
  }
}

export default App;
