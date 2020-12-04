package com.solvd.projectUniversity.model.university;

import com.solvd.projectUniversity.enumerate.RoomsCapacities;
import com.solvd.projectUniversity.exceptions.NullAutorizedException;
import com.solvd.projectUniversity.model.persons.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ExclusiveRoom extends Room {
	
	private Departament autorizedToUse;
	private Logger log = LogManager.getLogger(ExclusiveRoom.class);

	public ExclusiveRoom(String name, RoomsCapacities capacity, Departament autorizedToUse)  {
		super(name, capacity);
		
		// TODO Auto-generated constructor stub
		try {
			this.setAutorizedToUse(autorizedToUse);
		} catch (NullAutorizedException e) {
			// TODO Auto-generated catch block
			log.error("The autorized to use cant be null",e);
		}
	}
	
	public Departament getAutorizedToUse() {
		return autorizedToUse;
	}
	
	public void setAutorizedToUse(Departament autorizedToUse) throws NullAutorizedException{
		if(autorizedToUse==null)
			throw new NullAutorizedException();
		else
			this.autorizedToUse = autorizedToUse;
	}
	
	@Override
	public boolean itIsAutorized(Professor d) {
		return autorizedToUse.haveProfessor(d);
	}
	@Override
	public void addReserve(Reservation r) {
		if(autorizedToUse.haveProfessor(r.getProfessor())) {
			super.addReserve(r);
		}
	}
}
