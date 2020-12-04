package com.solvd.projectAirport.dao;



import org.apache.ibatis.annotations.Delete;

import org.apache.ibatis.annotations.Select;


import com.solvd.projectAirport.model.Country;

public interface ICountryDAO extends IGenericDAO<Country>{
	
	@Select("insert into Countries(name) values (#{name})")
	public Country save(Country g) ;
	@Select("select * from Countries where id = #{id}")
	public Country getById(long id);
	@Delete("delete from Countries where id = #{id}")
	public void remove(long id);
}
