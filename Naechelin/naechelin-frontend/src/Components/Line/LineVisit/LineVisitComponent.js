import React, {PureComponent} from "react";
import "./LineVisitComponent.css";
import {Link} from "react-router-dom";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faStar} from "@fortawesome/free-solid-svg-icons";
class LineVisitComponent extends PureComponent {
	render() {
		return (
			<div className="LineVisitComponent">
				<Link to="/App/Store?매장명">
					<img src="/images/restaurant1.png" alt="사진" />
					<label id="storeInfo">
						매장명 <label id="foodStyle">중식</label>
						<br />
						<div className="stars">
							<FontAwesomeIcon icon={faStar} color="#FFFF66" />
							<FontAwesomeIcon icon={faStar} color="#FFFF66" />
							<FontAwesomeIcon icon={faStar} color="#FFFF66" />
							<FontAwesomeIcon icon={faStar} color="#FFFF66" />
							<FontAwesomeIcon icon={faStar} color="#FFFF66" />
							<FontAwesomeIcon icon={faStar} color="red" />
							<FontAwesomeIcon icon={faStar} color="red" />
							<FontAwesomeIcon icon={faStar} color="red" /> 8.0
						</div>
						<br />
						<br />
					</label>
					<label id="goToReview">.....리뷰 쓰러가기</label>
				</Link>
			</div>
		);
	}
}

export default LineVisitComponent;
