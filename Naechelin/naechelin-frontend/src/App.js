import React from "react";
import UserAppHeader from "./Components/UserLayout/UserAppHeader/UserAppHeader";
import UserAppMiddle from "./Components/UserLayout/UserAppMiddle/UserAppMiddle";
import UserAppFooter from "./Components/UserLayout/UserAppFooter/UserAppFooter";

import OwnerAppHeader from "./Components/OwnerLayout/OwnerAppHeader/OwnerAppHeader";
import OwnerAppMiddle from "./Components/OwnerLayout/OwnerAppMiddle/OwnerAppMiddle";
import OwnerAppFooter from "./Components/OwnerLayout/OwnerAppFooter/OwnerAppFooter";
import "./App.css";
import {BrowserRouter as Router} from "react-router-dom";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

function App() {
	let member_type = "owner";
	if (member_type === "customer")
		return (
			<div>
				<img src="/images/spoon.png" alt="spoon" id="spoon" />
				<div className="App">
					<Router>
						<header className="header">
							<UserAppHeader />
						</header>
						<div className="middle">
							<UserAppMiddle />
						</div>
						<footer className="footer">
							<UserAppFooter />
						</footer>
					</Router>
				</div>
				<img src="/images/fork.png" alt="fork" id="fork" />
			</div>
		);
	if (member_type === "owner")
		return (
			<div>
				<img src="/images/spoon.png" alt="spoon" id="spoon" />
				<div className="App">
					<Router>
						<header className="header">
							<OwnerAppHeader />
						</header>
						<div className="middle">
							<OwnerAppMiddle />
						</div>
						<footer className="footer">
							<OwnerAppFooter />
						</footer>
					</Router>
				</div>
				<img src="/images/fork.png" alt="fork" id="fork" />
			</div>
		);
}
export default App;
