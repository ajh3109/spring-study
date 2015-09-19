package study.spring.todo.core.service;

import study.spring.todo.core.domain.User;

public interface UserService {

	public static String SERVICE_NAME = "UserService";

	/**
	 * 로그인
	 * 
	 * @param userId
	 * @param userPassword
	 * @return
	 */
	boolean login(final String userId, final String userPassword);

	/**
	 * 가입
	 * 
	 * @param user
	 * @return
	 */
	User join(final User user);

	/**
	 * 회원정보 수정
	 * 
	 * @param user
	 * @return
	 */
	User update(User user);

	/**
	 * 탈퇴
	 * 
	 * @param user
	 */
	void withdraw(final User user);

}
