import React, {PureComponent} from "react";
import PropTypes from "prop-types";
import "./UserAppFooter.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {
	faGift,
	faFlag,
	faMapMarkedAlt,
} from "@fortawesome/free-solid-svg-icons";
import {Link} from "react-router-dom";

import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class UserAppFooter extends PureComponent {
	componentDidMount() {
		window.$(document).ready(function () {
			window.$("#LineBtn").click(function () {
				window.$("#LineIcon").css("color", "rgb(163,216,254)");
				window.$("#MapIcon").css("color", "white");
				window.$("#CouponIcon").css("color", "white");
			});
			window.$("#MapBtn").click(function () {
				window.$("#LineIcon").css("color", "white");
				window.$("#MapIcon").css("color", "rgb(163,216,254)");
				window.$("#CouponIcon").css("color", "white");
			});
			window.$("#CouponBtn").click(function () {
				window.$("#LineIcon").css("color", "white");
				window.$("#MapIcon").css("color", "white");
				window.$("#CouponIcon").css("color", "rgb(163,216,254)");
			});
		});
	}
	render() {
		return (
			<div className="UserAppFooter">
				<Link to="/App/Line">
					<button className="btns" id="LineBtn">
						<FontAwesomeIcon
							icon={faFlag}
							size="2x"
							color="rgb(163,216,254)"
							id="LineIcon"
						/>
						<br />
						라인
					</button>
				</Link>

				<Link to="/App/Map">
					<button className="btns" id="MapBtn">
						<FontAwesomeIcon
							icon={faMapMarkedAlt}
							size="2x"
							color="white"
							id="MapIcon"
						/>
						<br />
						맛있을 지도
					</button>
				</Link>
				<Link to="/App/Coupon">
					<button className="btns" id="CouponBtn">
						<FontAwesomeIcon
							icon={faGift}
							size="2x"
							color="white"
							id="CouponIcon"
						/>
						<br />
						내쿠폰함
					</button>
				</Link>
			</div>
		);
	}
}
UserAppFooter.protoTypes = {
	num: PropTypes.number,
	choose: PropTypes.number,
};
export default UserAppFooter;
