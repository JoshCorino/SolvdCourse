package com.solvd.projectAirport.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.solvd.projectAirport.model.Plane;

public interface IPlaneDAO extends IGenericDAO<Plane>{
	
	@Select("insert into Planes(model,passengers_capacity,fuel_capacity,id_owner) values (#{model},#{passengersCapacity},#{fuelCapacity},#{airline.id})")
	public Plane save(Plane p) ;
	@Select("select * from Planes p left join Airlines a on (p.id_owner=a.id) where p.id = #{id}")
	@ResultMap("PlaneResultMap")
	public Plane getById(long id);
	@Delete("delete from Planes where id = #{id}")
	public void remove(long id) ;
	@Select("select * from Planes where id_owner = #{id}")
	public ArrayList<Plane> getPlanesByAirlineId(long id);
}
