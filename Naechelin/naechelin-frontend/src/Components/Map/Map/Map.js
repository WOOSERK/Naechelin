import React, {PureComponent} from "react";
import "./Map.css";
import SearchBar from "../../Common/SearchBar/SearchBar";
import {FontAwesomeIcon} from "@fortawesome/react-fontawesome";
import {faStar, faBook} from "@fortawesome/free-solid-svg-icons";

import jQuery from "jquery";
import axios from "axios";
window.$ = window.jQuery = jQuery;
const {kakao} = window;

class Map extends PureComponent {
	state = {
		likey: [],
		naechelin: [],
		guide: [],
	};

	loadLikey = async () => {
		axios
			.get("/likey/list")
			.then((response) => {
				this.setState({likey: response.data.list});
			})
			.catch(function (error) {
				console.log(error);
			});
	};

	loadNaechelin = async () => {
		axios
			.get("/naechelin")
			.then((response) => {
				this.setState({naechelin: response.data.list});
			})
			.catch(function (error) {
				console.log(error);
			});
	};

	loadGuide = async () => {
		axios
			.get("/naechelin/all")
			.then((response) => {
				this.setState({guide: response.data.list});
			})
			.catch(function (error) {
				console.log(error);
			});
	};

	componentDidMount() {
		let jeonka = this;
		window.$(document).ready(function () {
			kakao.maps.load(() => {
				let container = document.getElementById("map");
				let options = {
					center: new kakao.maps.LatLng(37.566826, 126.9786567),
				};
				window.map = new kakao.maps.Map(container, options);

				// 지도 확대, 축소 컨트롤에서 확대 버튼을 누르면 호출되어 지도를 확대하는 함수입니다
				function zoomIn() {
					window.map.setLevel(window.map.getLevel() - 1);
				}

				// 지도 확대, 축소 컨트롤에서 축소 버튼을 누르면 호출되어 지도를 확대하는 함수입니다
				function zoomOut() {
					window.map.setLevel(window.map.getLevel() + 1);
				}

				window.$("#zoomin").click(function () {
					zoomIn();
				});
				window.$("#zoomout").click(function () {
					zoomOut();
				});
			});

			var markers = [];

			var ps = new kakao.maps.services.Places();

			var infowindow = new kakao.maps.InfoWindow({zIndex: 1});

			window.$("#searchBtn").click(function () {
				searchPlaces();
			});

			// 키워드 검색을 요청하는 함수입니다
			function searchPlaces() {
				var keyword = window.$("#search").val();

				if (!keyword.replace(/^\s+|\s+$/g, "")) {
					alert("키워드를 입력해주세요!");
					return false;
				}

				// 장소검색 객체를 통해 키워드로 장소검색을 요청합니다
				ps.keywordSearch(keyword, placesSearchCB);
			}

			function placesSearchCB(data, status, pagination) {
				if (status === kakao.maps.services.Status.OK) {
					// 정상적으로 검색이 완료됐으면
					// 검색 목록과 마커를 표출합니다
					displayPlaces(data);
				} else if (status === kakao.maps.services.Status.ZERO_RESULT) {
					alert("검색 결과가 존재하지 않습니다.");
					return;
				} else if (status === kakao.maps.services.Status.ERROR) {
					alert("검색 결과 중 오류가 발생했습니다.");
					return;
				}
			}

			// 검색 결과 목록과 마커를 표출하는 함수입니다
			function displayPlaces(places) {
				var fragment = document.createDocumentFragment(),
					bounds = new kakao.maps.LatLngBounds(),
					listStr = "";

				// 지도에 표시되고 있는 마커를 제거합니다
				removeMarker();

				for (var i = 0; i < places.length; i++) {
					// 마커를 생성하고 지도에 표시합니다
					console.log(places[i].x + ":" + places[i].y);

					var placePosition = new kakao.maps.LatLng(
							places[i].y,
							places[i].x
						),
						marker = addMarker(placePosition, i),
						itemEl = getListItem(i, places[i]); // 검색 결과 항목 Element를 생성합니다;

					// 검색된 장소 위치를 기준으로 지도 범위를 재설정하기위해
					// LatLngBounds 객체에 좌표를 추가합니다
					bounds.extend(placePosition);

					// 마커와 검색결과 항목에 mouseover 했을때
					// 해당 장소에 인포윈도우에 장소명을 표시합니다
					// mouseout 했을 때는 인포윈도우를 닫습니다
					(function (marker, title) {
						kakao.maps.event.addListener(
							marker,
							"click",
							function () {
								window.location.assign("/App/Store");
							}
						);
					})(marker, places[i].place_name);
				}

				// 검색된 장소 위치를 기준으로 지도 범위를 재설정합니다
				window.map.setBounds(bounds);
			}

			function removeMarker() {
				for (var i = 0; i < markers.length; i++) {
					markers[i].setMap(null);
				}
				markers = [];
			}

			function addMarker(position, idx, title) {
				var imageSrc =
						"https://t1.daumcdn.net/localimg/localimages/07/mapapidoc/marker_number_blue.png", // 마커 이미지 url, 스프라이트 이미지를 씁니다
					imageSize = new kakao.maps.Size(36, 37), // 마커 이미지의 크기
					imgOptions = {
						spriteSize: new kakao.maps.Size(36, 691), // 스프라이트 이미지의 크기
						spriteOrigin: new kakao.maps.Point(0, idx * 46 + 10), // 스프라이트 이미지 중 사용할 영역의 좌상단 좌표
						offset: new kakao.maps.Point(13, 37), // 마커 좌표에 일치시킬 이미지 내에서의 좌표
					},
					markerImage = new kakao.maps.MarkerImage(
						imageSrc,
						imageSize,
						imgOptions
					),
					marker = new kakao.maps.Marker({
						position: position, // 마커의 위치
						image: markerImage,
					});

				marker.setMap(window.map); // 지도 위에 마커를 표출합니다
				markers.push(marker); // 배열에 생성된 마커를 추가합니다

				return marker;
			}

			function getListItem(index, places) {
				var item = {
					storeName: places.place_name,
					roadAddress: places.road_address_name,
					address: places.address_name,
				};
				return item;
			}
			window.$("#likey").click(function () {
				jeonka.loadLikey();
				displayPlaces(jeonka.state.likey);

				window
					.$("#likey")
					.css("background-color", "rgba(255, 255, 132, 0.7)");

				window
					.$("#nechelin")
					.css("background-color", "rgba(255, 255, 255, 0.8)");
				window
					.$("#guide")
					.css("background-color", "rgba(255, 255, 255, 0.8)");
			});
			window.$("#nechelin").click(function () {
				jeonka.loadNaechelin();
				displayPlaces(jeonka.state.naechelin);
				window
					.$("#nechelin")
					.css("background-color", "rgba(255, 161, 132, 0.7)");

				window
					.$("#likey")
					.css("background-color", "rgba(255, 255, 255, 0.8)");
				window
					.$("#guide")
					.css("background-color", "rgba(255, 255, 255, 0.8)");
			});
			window.$("#guide").click(function () {
				jeonka.loadGuide();
				displayPlaces(jeonka.state.guide);
				window
					.$("#guide")
					.css("background-color", "rgba(187, 255, 132, 0.7)");

				window
					.$("#likey")
					.css("background-color", "rgba(255, 255, 255, 0.8)");
				window
					.$("#nechelin")
					.css("background-color", "rgba(255, 255, 255, 0.8)");
			});
		});
	}
	render() {
		return (
			<div className="Map">
				<select>
					<option>내위치</option>
					<option>동작구</option>
				</select>
				<SearchBar />
				<button id="navigatorBtn">
					<img
						id="navigator"
						src="/images/navigator.png"
						alt="길찾기"
					></img>
				</button>
				<div id="map"></div>
				<div className="filter">
					<label className="filterBtn" id="likey" name="filter">
						<h3>
							<FontAwesomeIcon
								icon={faStar}
								id="yellowStar"
								color="yellow"
							/>
						</h3>
						<br />
						<label id="likeyLabel">관심매장</label>
					</label>

					<label className="filterBtn" id="nechelin" name="filter">
						<h3>
							<FontAwesomeIcon
								icon={faStar}
								id="redStar"
								color="red"
							/>
						</h3>
						<br />
						<label id="nechelinLabel">내슐랭</label>
					</label>
					<label className="filterBtn" id="guide" name="filter">
						<h3>
							<FontAwesomeIcon
								icon={faBook}
								color="rgb(100, 236, 159)"
								id="book"
							/>
						</h3>
						<br />
						<label id="guideLabel">내슐랭 가이드</label>
					</label>
					<input type="button" id="zoomin" value="+" />
					<input type="button" id="zoomout" value="-" />
				</div>
			</div>
		);
	}
}

export default Map;
