import React, {PureComponent} from "react";
import ChartComponent from "./ChartComponent";
class Chart extends PureComponent {
	render() {
		return (
			<div className="Chart">
				<div className="chartDiv">
					<label id="chartTitle">분석차트</label>
				</div>
				<div className="stampHistory">
					<label id="stampTitle">스탬프 내역</label>
					<ul>
						<li>
							<ChartComponent />
						</li>
						<li>
							<ChartComponent />
						</li>
						<li>
							<ChartComponent />
						</li>
						<li>
							<ChartComponent />
						</li>
					</ul>
				</div>
			</div>
		);
	}
}

export default Chart;
