package study.spring.todo.core.domain;

/**
 * TODO 관리 클래스
 * 
 * @author ajh3109
 *
 */
public class Todo {
	// TODO ORM 기반인 NamedQueries 추가 (하이버네이트 사용)

	/** 사용자ID */
	private String userId;
	/** todo 제목 */
	private String todoTitle;
	/** 상세내용 */
	private String todoMemo;
	/** todo 시간 (yyyymmddhhmmss) **/
	private String hstimeTodo;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTodoTitle() {
		return todoTitle;
	}

	public void setTodoTitle(String todoTitle) {
		this.todoTitle = todoTitle;
	}

	public String getTodoMemo() {
		return todoMemo;
	}

	public void setTodoMemo(String todoMemo) {
		this.todoMemo = todoMemo;
	}

	public String getHstimeTodo() {
		return hstimeTodo;
	}

	public void setHstimeTodo(String hstimeTodo) {
		this.hstimeTodo = hstimeTodo;
	}

}
