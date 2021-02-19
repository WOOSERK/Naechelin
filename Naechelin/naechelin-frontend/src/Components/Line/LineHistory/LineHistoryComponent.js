import React, {PureComponent} from "react";
import "./LineHistoryComponent.css";

class LineHistoryComponent extends PureComponent {
	render() {
		return (
			<div className="LineHistoryComponent">
				<img src="/images/dummyLine2.png" alt="사진" />
				<label id="lineInfo">
					2020/8/11 ~ 2020/8~11
					<br />
					<br />
					가게1 : 왕돈까스
					<br />
					가게2 : 왕돈까스
					<br />
					가게3 : 왕돈까스
					<br />
				</label>
				<label id="lineAcheive">
					<br />
					.....달성
					<br />
					.....실패
					<br />
					.....달성
					<br />
				</label>
			</div>
		);
	}
}

export default LineHistoryComponent;
