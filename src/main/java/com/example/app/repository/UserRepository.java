package com.example.app.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.example.app.dto.UserDto;

@Repository
public class UserRepository{
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public List<UserDto> getUser(String userId){
		SqlParameterSource param = new MapSqlParameterSource().addValue("userId", userId);
		return jdbcTemplate.query(
			"SELECT * FROM USERMST WHERE USERID=:userId",
			param,
			new BeanPropertyRowMapper<UserDto>(UserDto.class)
		);
	}
}


