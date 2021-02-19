import React, {PureComponent} from "react";
import "./OwnerAppMiddle.css";
import {Switch, Route} from "react-router-dom";
import Home from "../../Owner/Home/Home";
import Chart from "../../Owner/Chart/Chart";
import MyStore from "../../Owner/MyStore/MyStore";
import QRcodeScanner from "../../Owner/QRcodeScanner/QRcodeScanner";
import StampByPhoneNumber from "../../Owner/StampByPhoneNumber/StampByPhoneNumber";
import Login from "../../Common/Login/Login";
class OwnerAppMiddle extends PureComponent {
	render() {
		return (
			<div className="OwnerAppMiddle">
				<Switch>
					<Route exact path="/">
						<Login />
					</Route>
					<Route exact path="/Login">
						<Login />
					</Route>
					<Route exact path="/App">
						<Home />
					</Route>
					<Route path="/App/Home">
						<Home />
					</Route>
					<Route path="/App/Chart">
						<Chart />
					</Route>
					<Route path="/App/MyStore">
						<MyStore />
					</Route>
					<Route path="/App/QRcodeScanner">
						<QRcodeScanner />
					</Route>
					<Route path="/App/StampByPhoneNumber">
						<StampByPhoneNumber />
					</Route>
				</Switch>
			</div>
		);
	}
}

export default OwnerAppMiddle;
