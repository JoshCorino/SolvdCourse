package com.solvd.projectUniversity.interfaces;

@FunctionalInterface
public interface IContact<S,M,P> {
	public void contact(S receiver, M message, P emitter);
}
