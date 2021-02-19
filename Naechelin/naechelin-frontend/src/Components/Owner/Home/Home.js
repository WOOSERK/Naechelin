import React, {PureComponent} from "react";
import "./Home.css";
import {Link} from "react-router-dom";
import HomeComponent from "./HomeComponent";

class Home extends PureComponent {
	render() {
		return (
			<div className="Home">
				<img src="/images/knife.png" alt="knife" id="knife" />
				<ul>
					<li>
						<Link to="/App/QRcodeScanner?storeNum=1">
							<HomeComponent className="left" />
						</Link>
						<vr />
						<Link to="/App/QRcodeScanner?storeNum=2">
							<HomeComponent className="right" />
						</Link>
					</li>

					<li>
						<Link to="/App/QRcodeScanner?storeNum=1">
							<HomeComponent className="left" />
						</Link>
						<Link to="/App/QRcodeScanner?storeNum=2">
							<HomeComponent className="right" />
						</Link>
					</li>
					<li>
						<Link to="/App/QRcodeScanner?storeNum=1">
							<HomeComponent />
						</Link>
						<Link to="/App/QRcodeScanner?storeNum=2">
							<HomeComponent />
						</Link>
					</li>
				</ul>
			</div>
		);
	}
}

export default Home;
