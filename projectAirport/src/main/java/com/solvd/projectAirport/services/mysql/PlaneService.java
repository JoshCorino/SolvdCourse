package com.solvd.projectAirport.services.mysql;

import com.solvd.projectAirport.dao.IAirlineDAO;
import com.solvd.projectAirport.dao.IPlaneDAO;
import com.solvd.projectAirport.dao.mysql.AirlineDAO;
import com.solvd.projectAirport.dao.mysql.PlaneDAO;
import com.solvd.projectAirport.model.Plane;

public class PlaneService {
	IPlaneDAO planeDAO = new PlaneDAO();
	IAirlineDAO airlineDAO = new AirlineDAO();
	
	public Plane getById(long id) {
		Plane result = planeDAO.getById(id);
		result.setIdAirline(airlineDAO.getById(planeDAO.getAirlineIdById(id)));
		return result;
	};
}
