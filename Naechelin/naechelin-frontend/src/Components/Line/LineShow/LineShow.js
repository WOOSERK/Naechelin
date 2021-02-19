import React, {PureComponent} from "react";
import LineVisit from "../LineVisit/LineVisit";
import LineHistory from "../LineHistory/LineHistory";
import {Switch, Route} from "react-router-dom";
import LineEdit from "../LineEdit/LineEdit";

class LineShow extends PureComponent {
	render() {
		return (
			<div className="LineShow">
				<Switch>
					<Route exact path="/">
						<LineVisit />
					</Route>
					<Route exact path="/App">
						<LineVisit />
					</Route>
					<Route exact path="/App/Line">
						<LineVisit />
					</Route>
					<Route path="/App/Line/LineVisit">
						<LineVisit />
					</Route>
					<Route path="/App/Line/LineHistory">
						<LineHistory />
					</Route>
					<Route path="/App/Line/LineEdit">
						<LineEdit />
					</Route>
				</Switch>
			</div>
		);
	}
}

export default LineShow;
