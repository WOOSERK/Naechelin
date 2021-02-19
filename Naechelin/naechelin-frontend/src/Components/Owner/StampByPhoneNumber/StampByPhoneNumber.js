import React, {PureComponent} from "react";
import {Link} from "react-router-dom";
import "./StampByPhoneNumber.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {
	faReply,
	faPhoneAlt,
	faArrowLeft,
} from "@fortawesome/free-solid-svg-icons";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class StampByPhoneNumber extends PureComponent {
	constructor(props) {
		super(props);
		this.state = {
			phoneNumArray: [1, 2, 3],
		};
		this.phoneString = this.state.phoneNumArray.join("");
	}

	componentDidMount() {
		window.$(document).ready(function () {
			window.$(".numberBtn").click(function () {
				let newString = window.$("input").attr("value") + this.value;
				window.$("input").attr("value", newString);
			});

			window.$("#backSpace").click(function () {
				let endNum = window.$("input").attr("value").length - 1;
				let newString = window
					.$("input")
					.attr("value")
					.substr(0, endNum);
				window.$("input").attr("value", newString);
			});

			window.$("#clear").click(function () {
				let newString = "";
				window.$("input").attr("value", newString);
			});
			window.$("#confirm").click(function () {
				if (window.$("input").attr("value").length === 11) {
					alert("적립이 완료되었습니다");
					window.location.assign("/App/QRcodeScanner");
				} else {
					alert("잘못된 번호입니다");
					window.location.reload();
				}
			});
		});
	}

	render() {
		return (
			<div className="StampByPhoneNumber">
				<h1>
					<Link to="/App/QRcodeScanner">
						<FontAwesomeIcon
							icon={faReply}
							color="pink"
							id="goBack"
						></FontAwesomeIcon>
					</Link>
				</h1>
				<h2>
					<FontAwesomeIcon
						icon={faPhoneAlt}
						color="gray"
						id="phoneIcon"
					></FontAwesomeIcon>
					전화번호를 입력해주세요
				</h2>
				<input
					type="number"
					readOnly
					id="out"
					value={this.state.phoneString}
				></input>
				<br />
				<div className="keyPad">
					<button className="numberBtn" value="1">
						1
					</button>
					<button className="numberBtn" value="2">
						2
					</button>
					<button className="numberBtn" value="3">
						3
					</button>
					<br />
					<button className="numberBtn" value="4">
						4
					</button>
					<button className="numberBtn" value="5">
						5
					</button>
					<button className="numberBtn" value="6">
						6
					</button>
					<br />
					<button className="numberBtn" value="7">
						7
					</button>
					<button className="numberBtn" value="8">
						8
					</button>
					<button className="numberBtn" value="9">
						9
					</button>
					<br />
					<button id="clear">clear</button>
					<button className="numberBtn" value="0">
						0
					</button>
					<button id="backSpace">
						<FontAwesomeIcon icon={faArrowLeft} color="gray" />
					</button>
					<br />
				</div>

				<div className="confirmButtons">
					<Link to="/App/QRcodeScanner">
						<button type="button" id="cancel">
							취소
						</button>
					</Link>
					<button type="submit" id="confirm">
						확인
					</button>
				</div>
			</div>
		);
	}
}

export default StampByPhoneNumber;
