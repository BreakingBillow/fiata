package com.explitech.fiata.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonView;

import com.explitech.fiata.common.ServiceObjectView;


public class User  implements Serializable{
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.UserView.class)
	private Integer userId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.nickname
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.UserView.class)
	private String nickname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.cellphone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.UserView.class)
	private String cellphone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.hash
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.UserView.class)
	private String hash;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.user_type_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.UserView.class)
	private Integer userTypeId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.company_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.UserView.class)
	private Integer companyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.date_add
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.UserView.class)
	private Date dateAdd;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_id
	 * @return  the value of user.user_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_id
	 * @param userId  the value for user.user_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.nickname
	 * @return  the value of user.nickname
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.nickname
	 * @param nickname  the value for user.nickname
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.cellphone
	 * @return  the value of user.cellphone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.cellphone
	 * @param cellphone  the value for user.cellphone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.hash
	 * @return  the value of user.hash
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getHash() {
		return hash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.hash
	 * @param hash  the value for user.hash
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setHash(String hash) {
		this.hash = hash;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.user_type_id
	 * @return  the value of user.user_type_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public Integer getUserTypeId() {
		return userTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.user_type_id
	 * @param userTypeId  the value for user.user_type_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.company_id
	 * @return  the value of user.company_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.company_id
	 * @param companyId  the value for user.company_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.date_add
	 * @return  the value of user.date_add
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public Date getDateAdd() {
		return dateAdd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.date_add
	 * @param dateAdd  the value for user.date_add
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5902602853128713220L;
}