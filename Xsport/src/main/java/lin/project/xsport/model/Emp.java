package lin.project.xsport.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "emp")
public class Emp implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Transient
	public static final String COLUMN_NAME_EMPNO = "emp_no";
	@Transient
	public static final String COLUMN_NAME_EMPACCOUNT = "emp_account";
	@Transient
	public static final String COLUMN_NAME_EMPPWD = "emp_pwd";
	
	@Id
	@Column(name = COLUMN_NAME_EMPNO, nullable = false)
	private Integer empNo;
	
	@Column(name = COLUMN_NAME_EMPACCOUNT, nullable = false)
	private String empAccount;
	
	@Column(name = COLUMN_NAME_EMPPWD, nullable = false)
	private String empPwd;
	
	public Integer getEmpNo() {
		return empNo;
	}

	public String getEmpAccount() {
		return empAccount;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public void setEmpAccount(String empAccount) {
		this.empAccount = empAccount;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	
}
