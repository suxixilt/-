package com.jesper.model;

import com.jesper.util.UuidUtil;
import lombok.Data;
import java.util.Date;
@Data
public class User extends BaseObject {
	private int id;
	private String userName;
	private String password;
	private String realName;
	private String business;
	private String email;
	private String headPicture;
	private Date addDate;
	private Date updateDate;
	// 激活状态
	private int state;
	// 激活码
	private String code;

	public String getCode() {
		return code;
	}

	// 设置激活码，全球唯一
	public void setCode(String code) {
		this.code = code;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHeadPicture() {
		return headPicture;
	}

	public void setHeadPicture(String headPicture) {
		this.headPicture = headPicture;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
