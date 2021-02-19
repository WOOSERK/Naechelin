import React, {PureComponent} from "react";
import "./ReviewCard.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faStar} from "@fortawesome/free-solid-svg-icons";
class ReviewCard extends PureComponent {

	render() {
		const reviewStar =[];
		const naechelin =[];
		let review = this.props.review;
		let star = review.reviewRating;
		for(let i = star ; star>5; i--){
			naechelin.push(i);
			star--;
		}
		for(let i = star; i > 0 ; i --){
			reviewStar.push(i);
		}

		return (
			<div className="ReviewCard">
				<img src="/images/restaurant3.png" alt="첨부사진"></img>
				<div className="ReviewCardScore">
					{reviewStar.map(element=>(<FontAwesomeIcon icon={faStar} color="yellow" />))}
					{naechelin.map(element=>(<FontAwesomeIcon icon={faStar} color="red" />))}{review.reviewRating}

				</div>
				<br />
				<label id="writter">{review.writer}</label>
				<br />
				<div className="profileDiv"></div>
				<div className="text">{review.reviewPac} </div>
				<br />
			</div>
		);
	}
}
export default ReviewCard;
