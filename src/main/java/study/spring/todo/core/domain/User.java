package study.spring.todo.core.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * 계정 정보 클래스
 * 
 * 
 * @author ajh3109
 */
@Entity
@NamedQueries({ @NamedQuery(name = "findUserByUserId", query = "SELECT u FROM USER u WHERE u.USER_ID = :userId"),
		@NamedQuery(name = "findUserByUserIdAndUserPassword", query = "SELECT u FROM USER u where u.USER_ID = :userId and u.USER_PASSWORD = :userPassword") })
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5536689068932930498L;
	@Id
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
