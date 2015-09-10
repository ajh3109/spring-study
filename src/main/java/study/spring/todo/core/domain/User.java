package study.spring.todo.core.domain;


/**
 * 계정 정보 클래스
 * 
 * 
 * @author ajh3109
 */
public class User {
	//TODO ORM 기반인 NamedQueries 추가 (하이버네이트 사용) 
	
	private Long userId;
	private String userName;
	private String userPassword;
	private String userEmail;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
