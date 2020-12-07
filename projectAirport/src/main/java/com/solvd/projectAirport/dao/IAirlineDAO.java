package com.solvd.projectAirport.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.solvd.projectAirport.model.Airline;


public interface IAirlineDAO extends IGenericDAO<Airline>{
	
	@Select("insert into Airlines(name,contact) values (#{name},#{contact})")
	@ResultMap("AirlineResultMap")
	public Airline save(Airline a) ;
	@Select("select * from Airlines where id = #{id}")
	public Airline getById(long id);
	@Delete("delete from Airlines where id = #{id}")
	public void remove(long id);
}
