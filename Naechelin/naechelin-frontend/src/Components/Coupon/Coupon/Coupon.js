import React, {PureComponent} from "react";
import "./Coupon.css";
import {Link} from "react-router-dom";
import CouponShow from "../CouponShow/CouponShow";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class Coupon extends PureComponent {
	componentDidMount() {
		window.$(document).ready(function () {
			window.$("#availTab").click(function () {
				window
					.$("#availTab")
					.css("background-color", "rgb(207,255,159)");
				window.$("#historyTab").css("background-color", "#ffffb6");
			});
			window.$("#historyTab").click(function () {
				window.$("#availTab").css("background-color", "#ffffb6");
				window
					.$("#historyTab")
					.css("background-color", "rgb(207,255,159)");
			});
		});
	}

	render() {
		return (
			<div className="Coupon">
				<Link to="/App/Coupon/CouponAvailable">
					<span className="CouponTab" id="availTab">
						사용 가능한 쿠폰
					</span>
				</Link>
				<Link to="/App/Coupon/CouponHistory">
					<span className="CouponTab" id="historyTab">
						사용 내역
					</span>
				</Link>
				<br />
				<div className="CouponShow">
					<CouponShow />
				</div>
			</div>
		);
	}
}

export default Coupon;
