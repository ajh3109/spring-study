package notice.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import notice.dao.UserDao;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
	

    @Resource(name="userDao")
    private UserDao userDao;


	@Override
	public List<Map<String, Object>> selectUserList(Map<String, Object> map) throws Exception {
		return userDao.selectUserList(map);
	}

}
