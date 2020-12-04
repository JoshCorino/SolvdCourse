package com.solvd.projectUniversity.filters;

@FunctionalInterface
public interface IGenericFilter<O,C> {
	public boolean satisfy(O obj, C condition);
}
