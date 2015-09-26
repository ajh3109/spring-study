package study.spring.todo.web.forms;

/**
 * 패스워드 변경 Form
 * 
 * @author ajh3109
 *
 */
public class ChangePasswordForm {
	private String currentPassword;

	private String newPassword;

	private String confirmationPassword;

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmationPassword() {
		return confirmationPassword;
	}

	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}
}
