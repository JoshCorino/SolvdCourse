package com.solvd.projectAirport.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.solvd.projectAirport.model.City;

public interface ICityDAO extends IGenericDAO<City>{
	
	@Select("insert into Cities(name,id_country) values (#{name},#{idCountry})")
	public City save(City g) ;
	@Select("select * from Cities  where id = #{id}")
	public City getById(long id);
	@Delete("delete from Cities where id = #{id}")
	public void remove(long id) ;
	@Select("select * from Cities  where id_country = #{id}")
	public ArrayList<City> getCitiesByCountryId(long id);
	
}
