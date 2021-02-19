import React, {PureComponent} from "react";
import PropTypes from "prop-types";
import "./OwnerAppFooter.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faHome, faChartPie, faStore} from "@fortawesome/free-solid-svg-icons";
import {Link} from "react-router-dom";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class OwnerAppFooter extends PureComponent {
	constructor(props) {
		super(props);
		this.state = {
			num: 1,
			choose: 1,
		};
	}
	componentDidMount() {
		window.$(document).ready(function () {
			window.$("#HomeBtn").click(function () {
				window.$("#HomeIcon").css("color", "rgb(163,216,254)");
				window.$("#ChartIcon").css("color", "white");
				window.$("#MyStoreIcon").css("color", "white");
			});
			window.$("#ChartBtn").click(function () {
				window.$("#HomeIcon").css("color", "white");
				window.$("#ChartIcon").css("color", "rgb(163,216,254)");
				window.$("#MyStoreIcon").css("color", "white");
			});
			window.$("#MyStoreBtn").click(function () {
				window.$("#HomeIcon").css("color", "white");
				window.$("#ChartIcon").css("color", "white");
				window.$("#MyStoreIcon").css("color", "rgb(163,216,254)");
			});
		});
	}
	render() {
		return (
			<div className="OwnerAppFooter">
				<Link to="/App/Home">
					<button id="HomeBtn">
						<FontAwesomeIcon
							icon={faHome}
							size="2x"
							color="rgb(163,216,254)"
							id="HomeIcon"
						/>
						<br />홈
					</button>
				</Link>

				<Link to="/App/Chart">
					<button id="ChartBtn">
						<FontAwesomeIcon
							icon={faChartPie}
							size="2x"
							color="white"
							id="ChartIcon"
						/>
						<br />
						분석 차트
					</button>
				</Link>
				<Link to="/App/MyStore">
					<button id="MyStoreBtn">
						<FontAwesomeIcon
							icon={faStore}
							size="2x"
							color="white"
							id="MyStoreIcon"
						/>
						<br />내 매장
					</button>
				</Link>
			</div>
		);
	}
}
OwnerAppFooter.protoTypes = {
	num: PropTypes.number,
	choose: PropTypes.number,
};
export default OwnerAppFooter;
