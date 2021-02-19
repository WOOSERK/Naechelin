import React, {PureComponent} from "react";
import "./Login.css";
import {Link} from "react-router-dom";

class Login extends PureComponent {
	render() {
		return (
			<div className="Login">
				<div id="paper" />
				<div className="idDiv">
					<label id="idLabel">id</label>
					<input type="text" id="id" required />
				</div>
				<br />
				<div className="pwdDiv">
					<label id="pwdLabel">password</label>
					<input type="password" id="pwd" required />
				</div>
				<br />
				<div className="Account">
					<label id="AccountRegister">아이디 / 비밀번호 찾기</label>
					<label id="AccountFind">회원가입하기</label>
				</div>
				<br />

				<button type="button" id="cancel">
					취소
				</button>

				<Link to="/App">
					<button type="submit" id="confirm">
						확인
					</button>
				</Link>
			</div>
		);
	}
}

export default Login;
