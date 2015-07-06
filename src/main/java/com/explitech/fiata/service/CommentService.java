package com.explitech.fiata.service;

import java.util.List;

import com.explitech.fiata.model.Comment;
import com.explitech.fiata.model.CommentExample;

public interface CommentService {

	int add(Comment record);
	int update(Comment record);
	int delete(int commentId);
	
	Comment find(int commentId);
	
	int count(CommentExample example);
	List<Comment> list(CommentExample example);
	
}
