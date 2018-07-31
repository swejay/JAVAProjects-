package com.deloitte.main;

import java.util.List;

public interface Dao<T> {

	T get(long id);//retrieves one record
	List<T> getAll();// to retrieve all records.
	void save(T t);//exec an insert stmt. can be boolean
	void update(T t,String[] params);//exec update stmt
	void delete(T t);//exec delete stmt
	
}
