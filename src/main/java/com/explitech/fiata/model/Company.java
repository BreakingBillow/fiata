package com.explitech.fiata.model;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonView;

import com.explitech.fiata.common.ServiceObjectView;


public class Company implements Serializable{
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.company_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private Integer companyId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.company_name
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String companyName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.phone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.zipcode
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String zipcode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.address
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.cellphone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String cellphone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.QQ
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String qq;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.email
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String email;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.latitude
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String latitude;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.longitude
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String longitude;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.date_add
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private Date dateAdd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column company.description
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	@JsonView(ServiceObjectView.CompanyView.class)
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.company_id
	 * @return  the value of company.company_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.company_id
	 * @param companyId  the value for company.company_id
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.company_name
	 * @return  the value of company.company_name
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.company_name
	 * @param companyName  the value for company.company_name
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.phone
	 * @return  the value of company.phone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.phone
	 * @param phone  the value for company.phone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.zipcode
	 * @return  the value of company.zipcode
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.zipcode
	 * @param zipcode  the value for company.zipcode
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.address
	 * @return  the value of company.address
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.address
	 * @param address  the value for company.address
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.cellphone
	 * @return  the value of company.cellphone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.cellphone
	 * @param cellphone  the value for company.cellphone
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.QQ
	 * @return  the value of company.QQ
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.QQ
	 * @param qq  the value for company.QQ
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.email
	 * @return  the value of company.email
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.email
	 * @param email  the value for company.email
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.latitude
	 * @return  the value of company.latitude
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.latitude
	 * @param latitude  the value for company.latitude
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.longitude
	 * @return  the value of company.longitude
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.longitude
	 * @param longitude  the value for company.longitude
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.date_add
	 * @return  the value of company.date_add
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public Date getDateAdd() {
		return dateAdd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.date_add
	 * @param dateAdd  the value for company.date_add
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setDateAdd(Date dateAdd) {
		this.dateAdd = dateAdd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column company.description
	 * @return  the value of company.description
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column company.description
	 * @param description  the value for company.description
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6977613054756645893L;

	/**
	 * 
	 */
}