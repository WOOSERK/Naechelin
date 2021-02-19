import React, {PureComponent} from "react";
import "./QRcodeScanner.css";
import {Link} from "react-router-dom";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faReply} from "@fortawesome/free-solid-svg-icons";
class QRcodeScanner extends PureComponent {
	render() {
		return (
			<div className="QRcodeScanner">
				<label>[ + ]</label>
				<br />
				<Link to="/App/StampByPhoneNumber">
					<button>번호로 적립하기</button>
				</Link>
				<h1>
					<Link to="/App/Home">
						<FontAwesomeIcon
							icon={faReply}
							color="white"
							id="goBack"
							size="2xl"
						></FontAwesomeIcon>
					</Link>
				</h1>
			</div>
		);
	}
}

export default QRcodeScanner;
