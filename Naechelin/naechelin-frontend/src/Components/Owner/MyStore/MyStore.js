import React, {PureComponent} from "react";
import "./MyStore.css";
import Store from "../../Common/Store/Store";
import jQuery from "jquery";
window.$ = window.jQuery = jQuery;

class MyStore extends PureComponent {
	componentDidMount() {
		window.$(document).ready(function () {
			window.$("#addLikey").css("visibility", "hidden");
			window.$("#addReview").css("visibility", "hidden");
		});
	}
	render() {
		return (
			<div className="MyStore">
				<Store />
				<button id="storeEdit">매장편집</button>
			</div>
		);
	}
}

export default MyStore;
