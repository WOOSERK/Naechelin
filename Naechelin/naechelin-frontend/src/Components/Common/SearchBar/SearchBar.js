import React, {PureComponent} from "react";
import "./SearchBar.css";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faSearch} from "@fortawesome/free-solid-svg-icons";

class SearchBar extends PureComponent {
	render() {
		return (
			<div className="SearchBar">
				<input
					id="search"
					type="text"
					placeholder="매장 검색하기 ex) 가게명, 음식 종류"
				></input>
				<button id="searchBtn" type="submit">
					<FontAwesomeIcon
						icon={faSearch}
						color="white"
					></FontAwesomeIcon>
				</button>
			</div>
		);
	}
}

export default SearchBar;
