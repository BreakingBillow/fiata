package com.explitech.fiata.dao;

import com.explitech.fiata.model.User;
import com.explitech.fiata.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int deleteByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	User selectByPrimaryKey(Integer userId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByExampleSelective(@Param("record") User record,
			@Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByExample(@Param("record") User record,
			@Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbggenerated  Tue May 26 21:06:30 CST 2015
	 */
	int updateByPrimaryKey(User record);
}