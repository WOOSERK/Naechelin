import React, {PureComponent} from "react";
import "./AppIntro.css";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class AppIntro extends PureComponent {
	componentDidMount() {
		window.$(document).ready(function () {
			window.$(".book").click(function () {
				window.location.assign("/Login");
			});
		});
	}

	render() {
		return (
			<div className="Intro">
				<figure className="book">
					<ul className="hardcover_front">
						<li>
							<img
								src="/images/bookCover.png"
								alt=""
								width="100%"
								height="100%"
							/>
						</li>
						<li></li>
						<li></li>
						<li></li>
					</ul>
					<ul className="page">
						<li></li>
						<li>
							<img src="/images/frontPage.jpg" alt="frontPage" />
						</li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
					</ul>
					<ul className="hardcover_back">
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
					</ul>
					<ul className="book_spine">
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
					</ul>
				</figure>
			</div>
		);
	}
}

export default AppIntro;
