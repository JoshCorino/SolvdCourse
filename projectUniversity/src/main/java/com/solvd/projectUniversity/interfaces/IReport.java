package com.solvd.projectUniversity.interfaces;

import com.solvd.projectUniversity.model.persons.Person;

@FunctionalInterface
public interface IReport<D> {
	public void generateReport(String name,D destiny, Person emitter);
}
