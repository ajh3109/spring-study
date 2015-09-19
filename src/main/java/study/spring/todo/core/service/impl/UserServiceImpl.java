package study.spring.todo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.spring.todo.core.dao.UserDao;
import study.spring.todo.core.domain.User;
import study.spring.todo.core.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
	
	@Override
	public boolean login(String userId, String userPassword) {
		return userDao.login(userId, userPassword);
	}

	@Override
	public User join(User user) {
		return userDao.join(user);
	}

	@Override
	public User update(User user) {
		return userDao.update(user);
	}

	@Override
	public void withdraw(User user) {
		userDao.withdraw(user);
	}

}
