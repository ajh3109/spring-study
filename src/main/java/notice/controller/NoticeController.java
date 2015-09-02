package notice.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import notice.service.NoticeService;

@Controller
public class NoticeController {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "noticeService")
	private NoticeService noticeService;

	@RequestMapping(value = "/notice/userList.do")
	public ModelAndView openSampleBoardList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/notice/userList");

		List<Map<String, Object>> list = noticeService.selectUserList(commandMap);
		mv.addObject("list", list);

		return mv;
	}

}
