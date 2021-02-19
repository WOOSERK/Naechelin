import React, {PureComponent} from "react";
import "./CouponComponent.css";

class CouponComponent extends PureComponent {
	render() {
		return (
			<div className="CouponComponent">
				<img
					src="/images/couponBackground.png"
					alt="couponBackground"
					id="couponBackground"
				/>
				<div className="CouponComponent Store">
					<h2>내슐랭 통합쿠폰</h2>
					<br />
					<ol>
						<li>A매장 5%</li>
						<li>A매장 5%</li>
						<li>A매장 5%</li>
					</ol>
					<label for="#clickHere" id="clickHereLabel">
						click here!
					</label>
					<img
						src="/images/clickHere.png"
						alt="clickHere"
						id="clickHere"
					/>
				</div>
			</div>
		);
	}
}

export default CouponComponent;
