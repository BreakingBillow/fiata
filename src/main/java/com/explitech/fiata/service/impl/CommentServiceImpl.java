package com.explitech.fiata.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.explitech.fiata.dao.CommentMapper;
import com.explitech.fiata.model.Comment;
import com.explitech.fiata.model.CommentExample;
import com.explitech.fiata.service.CommentService;

public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentMapper commentDao;
	
	public int add(Comment record) {
		// TODO Auto-generated method stub
		return commentDao.insertSelective(record);
	}

	public int update(Comment record) {
		// TODO Auto-generated method stub
		return commentDao.updateByPrimaryKeySelective(record);
	}

	public int delete(int commentId) {
		// TODO Auto-generated method stub
		return commentDao.deleteByPrimaryKey(commentId);
	}

	public Comment find(int commentId) {
		// TODO Auto-generated method stub
		return commentDao.selectByPrimaryKey(commentId);
	}

	public int count(CommentExample example) {
		// TODO Auto-generated method stub
		return commentDao.countByExample(example);
	}

	public List<Comment> list(CommentExample example) {
		// TODO Auto-generated method stub
		return commentDao.selectByExample(example);
	}

}
