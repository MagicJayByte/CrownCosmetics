import logo from './logo.svg';
import './App.css';
import React from 'react';

class App extends React.Component {
  state = {
    users: []
  }

  async componentDidMount() {
    const response = await fetch('/user/users-list2');
    const body = await response.json();
    this.setState({users: body});
  }

  render() {
    const {users} = this.state;
    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className={"App-logo"} alt="logo"/>
            <div className={"App-intro"}>
              <h2>Users List</h2>
              {users.map(user =>
                  <div key={user.id}>
                    {user.username}
                  </div>
              )}
            </div>
          </header>
        </div>
    )
  }

//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }
}
export default App;
