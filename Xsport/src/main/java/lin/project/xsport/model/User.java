package lin.project.xsport.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//	宣告這是個table物件
@Table(name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4769838587735812469L;
	
//	這裡要跟DB一樣 用來組SQL
//	@Transient 代表這個不是DB的欄位，「別把我算進去」的意思
	@Transient
	public static final String COLUMN_NAME_USERACCOUNT = "user_account";
	@Transient
	public static final String COLUMN_NAME_USERPWD = "user_pwd";
	@Transient
	public static final String COLUMN_NAME_USERNAME = "user_name";
	@Transient
	public static final String COLUMN_NAME_USERIMAGE = "user_image";
	@Transient
	public static final String COLUMN_NAME_EMAIL = "email";
	@Transient
	public static final String COLUMN_NAME_TEL = "tel";
	
	
//	這裡是程式自己用 不須底線 底線通常都是連接兩個大寫
	@Id
//	代表宣告這個欄位是PK
//	@Column 是這個欄位的資
//	name是欄位名(要對應DB)
//	nullable代表是否允許null
	@Column(name = COLUMN_NAME_USERACCOUNT, length = 50, nullable = false)

	private String userAccount; 
	
	@Column(name = COLUMN_NAME_USERPWD, length = 45, nullable = false)
	private String userPwd;
	
	@Column(name = COLUMN_NAME_USERNAME, length = 50, nullable = false)
	private String userName;
	
	@Column(name = COLUMN_NAME_USERIMAGE, nullable = true)
	private String userImage;
	
	@Column(name = COLUMN_NAME_EMAIL, length = 45, nullable = true)
	private String email;
	
	@Column(name = COLUMN_NAME_TEL, length = 45, nullable = true)
	private String tel;

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
