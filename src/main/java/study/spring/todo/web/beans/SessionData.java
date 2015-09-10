package study.spring.todo.web.beans;

import study.spring.todo.core.domain.User;

/**
 * 계정 정보를 가지고 있는 클래스
 * 
 * @author ajh3109
 *
 */
public class SessionData {

	private User userData;

	public User getUserData() {
		return userData;
	}

	public void setUserData(User userData) {
		this.userData = userData;
	}

}
