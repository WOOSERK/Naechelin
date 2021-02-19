import React, {PureComponent} from "react";
import "./CouponHistory.css";
import CouponComponent from "../CouponComponent/CouponComponent";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;
class CouponHistory extends PureComponent {
	componentDidMount() {
		window.$(document).ready(function () {
			window.$(".doneStampBackground").click(function () {
				alert("사용 완료한 쿠폰입니다");
			});
			window.$(".doneStamp").click(function () {
				alert("사용 완료한 쿠폰입니다");
			});
		});
	}
	render() {
		return (
			<div className="CouponHistory">
				<ol>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
					<li>
						<CouponComponent />
						<div className="doneStampBackground" />
						<img
							src="/images/doneStamp.png"
							alt="doneStamp"
							className="doneStamp"
						/>
					</li>
				</ol>
			</div>
		);
	}
}

export default CouponHistory;
