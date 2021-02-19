import React, {PureComponent} from "react";
import "./CouponAvailable.css";
import CouponComponent from "../CouponComponent/CouponComponent";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class CouponAvailable extends PureComponent {
	componentDidMount() {
		window.$(document).ready(function () {
			window.$(".CouponComponent").click(function () {
				window.$("#popUpBackground").css("visibility", "visible");
				window.$("#quit").css("visibility", "visible");
				window.$("#popUp").css("visibility", "visible");
				window.$("#popUp").css("animation", "rotating 0.4s linear");
			});
			window.$("#quit").click(function () {
				window.$("#popUpBackground").css("visibility", "hidden");
				window.$("#quit").css("visibility", "hidden");
				window.$("#popUp").css("visibility", "hidden");
				window.$("#popUp").css("animation", "");
			});
			window.$("#popUp").click(function () {
				window.$("#popUpBackground").css("visibility", "hidden");
				window.$("#quit").css("visibility", "hidden");
				window.$("#popUp").css("visibility", "hidden");
				window.$("#popUp").css("animation", "");
			});
		});
	}
	render() {
		return (
			<div className="CouponAvailable">
				<div id="popUpBackground" />
				<label id="quit">X</label>
				<div id="popUp">
					<img src="/images/QRcode.png" alt="QRcode" id="QRcode" />
				</div>
				<ol>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
					<li>
						<CouponComponent />
					</li>
				</ol>
			</div>
		);
	}
}

export default CouponAvailable;
