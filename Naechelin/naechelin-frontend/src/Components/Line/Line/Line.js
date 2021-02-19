import React, {PureComponent} from "react";
import "./Line.css";
import SearchBar from "../../Common/SearchBar/SearchBar";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faReply} from "@fortawesome/free-solid-svg-icons";
import {Link} from "react-router-dom";
import LineShow from "../LineShow/LineShow";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class Line extends PureComponent {
	componentDidMount() {
		window.$(document).ready(function () {
			window.$("#LineEdit").click(function () {
				window.$(".LinkTab").css("display", "none");
				window.$("#toDoLabel").css("display", "inline");
				window.$("#goBack").css("display", "inline");
				window.$("#LineEdit").css("visibility", "hidden");
			});
			window.$("#goBack").click(function () {
				window.$(".LinkTab").css("display", "inline");
				window.$("#toDoLabel").css("display", "none");
				window.$("#goBack").css("display", "none");
				window.$("#LineEdit").css("visibility", "visible");
			});
			window.$("#visitTab").click(function () {
				window
					.$("#visitTab")
					.css("background-color", "rgb(207,255,159)");
				window.$("#historyTab").css("background-color", "#ffffb6");
			});
			window.$("#historyTab").click(function () {
				window.$("#visitTab").css("background-color", "#ffffb6");
				window
					.$("#historyTab")
					.css("background-color", "rgb(207,255,159)");
			});
		});
	}
	render() {
		return (
			<div className="Line">
				<SearchBar />
				<br />
				<br />
				<img
					src="/images/stampPaper.png"
					alt="stampPaper"
					id="stampPaper"
				/>
				<img src="/images/flag.png" alt="flag" id="flag" />
				<br />
				<div className="LineCurrent">
					나의 달성 현황 : 2회
					<br />
					다음 행선지 : 가게명
					<br />
					<Link to="/App/Line/LineEdit">
						<button id="LineEdit">라인 편집</button>
					</Link>
				</div>
				<br />
				<Link to="/App/Line/LineVisit">
					<label id="goBack">돌아가기</label>
				</Link>
				<label id="toDoLabel">
					라인에 추가하고 싶은 매장을 검색해주세요!
				</label>

				<Link to="/App/Line/LineVisit">
					<span className="LinkTab" id="visitTab">
						이번주 방문한 매장
					</span>
				</Link>
				<Link to="/App/Line/LineHistory">
					<span className="LinkTab" id="historyTab">
						라인내역
					</span>
				</Link>
				<br />
				<div className="LineShow">
					<LineShow />
				</div>
			</div>
		);
	}
}

export default Line;
