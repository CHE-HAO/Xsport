package lin.project.xsport.service;

/**
 * 處理帳號相關機制(確認登入帳號、建立帳號...)
 * @author Justin
 *
 */
public interface AccountService {
	
	public boolean createAccount();
	
	/**
	 * Login
	 * @param account
	 * @param password
	 * @return
	 */
	public boolean checkAccount(String account, String password);

	/**
	 * Reset password
	 * @param account
	 * @param oldPwd
	 * @param newPwd
	 * @return
	 */
	public boolean ResetPassword(String account, String oldPwd, String newPwd);
	
	/**
	 * For after create account
	 * @param account
	 */
	public void sendVerifyMail(String account);
	
	/**
	 * Send mail to reset password
	 * @param account
	 */
	public void forgetPassword(String account);
	
	/**
	 * Check if account is exist
	 * @param account
	 * @return
	 */
	public boolean isAccountExist(String account);
}
