package com.hsbc.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hsbc.springboot.model.User;

@Mapper
public interface UserMapper {
	@Select("SELECT * FROM USER")
	public List<User> findUserInfo();

	@Insert("INSERT INTO USER(NAME, AGE, PASSWORD) VALUES(#{name}, #{age}, #{password})")
	int insert(@Param("name") String name, @Param("age") Integer age, @Param("password") String password);
}
