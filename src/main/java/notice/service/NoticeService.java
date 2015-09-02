package notice.service;

import java.util.List;
import java.util.Map;

public interface NoticeService {
	List<Map<String, Object>> selectUserList(Map<String, Object> map) throws Exception;
}
