package com.explitech.fiata.dao;

import com.explitech.fiata.model.UserType;
import com.explitech.fiata.model.UserTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int countByExample(UserTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int deleteByExample(UserTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int deleteByPrimaryKey(Integer userTypeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int insert(UserType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int insertSelective(UserType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	List<UserType> selectByExample(UserTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	UserType selectByPrimaryKey(Integer userTypeId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByExampleSelective(@Param("record") UserType record,
			@Param("example") UserTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByExample(@Param("record") UserType record,
			@Param("example") UserTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByPrimaryKeySelective(UserType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_type
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByPrimaryKey(UserType record);
}