package com.revature.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.model.Book;
import com.revature.util.ConnectionUtil;

public class BookDAO {
	JdbcTemplate jdbcTemplate=ConnectionUtil.getJdbcTemplate();
	public void save(Book book){
		String sql="insert into book_jpr(id,name) values(?,?)";
		Object[] params={book.getId(),book.getName()};
		int rows=jdbcTemplate.update(sql,params);
		System.out.println("numbers of rows inserted"+rows);
	}
	public void update(Book book){
		String sql="update book_jpr set name=? where id=?";
		Object[] params={book.getName(),book.getId()};
		int rows=jdbcTemplate.update(sql,params);
		System.out.println("numbers of rows updated"+rows);
	}
	public void delete(int id){
		String sql="delete from book_jpr where id=?";
	
		int rows=jdbcTemplate.update(sql,id);
		System.out.println("numbers of rows deleted"+rows);
	}
}
