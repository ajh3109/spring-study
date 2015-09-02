package notice.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import notice.common.dao.AbstractDao;

@Repository("userDao")
public class UserDao extends AbstractDao {
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectUserList(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectList("user.selectUserList", map);
	}

}
