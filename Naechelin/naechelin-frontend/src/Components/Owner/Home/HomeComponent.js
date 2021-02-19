import React, {PureComponent} from "react";
import "./HomeComponent.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faStar} from "@fortawesome/free-solid-svg-icons";

class HomeComponent extends PureComponent {
	render() {
		return (
			<div className="HomeComponent">
				<img
					src="/images/storeBackground.png"
					alt="storeBackground"
					id="storeBackground"
				/>
				<div id="HomeInfo">
					<img
						src="/images/restaurant2.png"
						alt="사진"
						id="picture"
					/>
					<br />
					<div id="StoreInfo">
						매장명 <text id="foodStyle">중식</text>
						<br />
						<FontAwesomeIcon icon={faStar} color="#FFFF66" />
						<FontAwesomeIcon icon={faStar} color="#FFFF66" />
						<FontAwesomeIcon icon={faStar} color="#FFFF66" />
						<FontAwesomeIcon icon={faStar} color="#FFFF66" />
						<FontAwesomeIcon icon={faStar} color="#FFFFF6" />
						<br />
						<text id="toQRcode">QR코드 바로가기</text>
						<br />
						<img
							src="/images/arrow.png"
							alt="toQRcodeArrow"
							id="toQRcodeArrow"
						/>
					</div>
				</div>
			</div>
		);
	}
}

export default HomeComponent;
