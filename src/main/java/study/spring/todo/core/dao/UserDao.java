package study.spring.todo.core.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import study.spring.todo.core.domain.User;

public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * 로그인
	 * 
	 * @param id
	 * @param password
	 * @return
	 */
	public boolean login(final String userId, final String userPassword) {
		TypedQuery<User> query = entityManager.createNamedQuery("findUserByIdAndPassword", User.class);
		query.setParameter("USER_ID", userId);
		query.setParameter("user_password", userPassword);
		List<User> users = query.getResultList();
		return (users != null && !users.isEmpty());
	}

	/**
	 * 가입
	 * 
	 * @param user
	 * @return
	 */
	public User join(final User user) {
		entityManager.persist(user);
		return user;
	}

	/**
	 * 회원정보 수정
	 * 
	 * @param user
	 * @return
	 */
	public User update(User user) {
		return entityManager.merge(user);
	}

	/**
	 * 탈퇴
	 * 
	 * @param user
	 * @return
	 */
	public void withdraw(final User user) {
		entityManager.createNativeQuery("DELETE FROM TODO WHERE USER_ID = " + user.getUserId()).executeUpdate();
		User u = entityManager.find(User.class, user.getUserId());
		entityManager.remove(u);
	}
}
